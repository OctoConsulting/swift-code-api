package com.challenge.swiftcode.repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.challenge.swiftcode.repository.GenericRepository;

@Repository
public class BaseRepository<T> implements GenericRepository<T> {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public T create(T t) {
		Long seqId = (Long) getCurrentSession().save(t);
		return (T) getCurrentSession().get(t.getClass(), seqId);
	}

	@Override
	public T update(T t) {
		getCurrentSession().update(t);
		return t;	
	}
	
	@Override
	public T merge(T t) {
		getCurrentSession().merge(t);
		return t;	
	}

	@Override
	public void delete(T t) {
		getCurrentSession().delete(t);
	}
	
	public T findBy(Class<T> t, Integer id) {
		return (T) getCurrentSession().get(t,id);
	}
	
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession() ;
	}

	
}
