package com.challenge.swiftcode.repository.impl;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.swiftcode.models.EntityObject;
import com.challenge.swiftcode.models.FarDFarAnswersData;
import com.challenge.swiftcode.repository.BaseRepository;


/**
 * @author Ruchir.Mehta
 *
 */
@Repository
@Transactional
@SuppressWarnings("unchecked")
public class EntityRepository extends BaseRepository<EntityObject> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final Logger log = LoggerFactory.getLogger(EntityRepository.class);
		
	public List<EntityObject> findById(Long id) {
		try {
			CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
			CriteriaQuery<EntityObject> criteriaQuery = builder.createQuery(EntityObject.class);
			Root<EntityObject> root = criteriaQuery.from(EntityObject.class);
			List<Predicate> predicatesList = new ArrayList<Predicate>();
			predicatesList.add(builder.equal(root.get("entity_id"), id));
			criteriaQuery.where(builder.and(predicatesList.toArray(new Predicate[predicatesList.size()])));
			List<EntityObject> resultList = getCurrentSession().createQuery(criteriaQuery).getResultList();
			
			return resultList;
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting findById ID :"+id);
			throw ex;
		}
	}
	
	public List<EntityObject> findByDUNS(String duns) {
		try {
			CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
			CriteriaQuery<EntityObject> criteriaQuery = builder.createQuery(EntityObject.class);
			Root<EntityObject> root = criteriaQuery.from(EntityObject.class);
			List<Predicate> predicatesList = new ArrayList<Predicate>();
			predicatesList.add(builder.equal(root.get("duns"), duns));
			criteriaQuery.where(builder.and(predicatesList.toArray(new Predicate[predicatesList.size()])));
			List<EntityObject> resultList = getCurrentSession().createQuery(criteriaQuery).getResultList();
			
			return resultList;
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting findByDUNS duns :"+duns);
			throw ex;
		}
	}

	public List<EntityObject> findBySearchText(String searchText, String type) {
		try {
			String queryString ="";
			if(type.equalsIgnoreCase("fardfar")) {
				queryString ="f.far_dfar_code ilike '%"+searchText+"%'";
			} else {
				queryString ="f.answer_id ='"+searchText+"'";
			}
			String finalQueryString ="select * from swiftschema.entity where pk_entity_id in (select distinct(pk_entity_id) from swiftschema.far_dfar_answer_details f where "+queryString+")";
			NativeQuery finalQueryStringNative =getCurrentSession().createNativeQuery(finalQueryString);
			
			finalQueryStringNative.addEntity(EntityObject.class);
			List<EntityObject> entityList = finalQueryStringNative.list();
			return entityList;
			
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting findBySearchText findBySearchText :"+searchText);
			throw ex;
		}
	}

	public List<EntityObject> findAll() {
		String finalQueryString ="select * from swiftschema.entity";
		NativeQuery finalQueryStringNative =getCurrentSession().createNativeQuery(finalQueryString);
		finalQueryStringNative.addEntity(EntityObject.class);
		List<EntityObject> entityList = finalQueryStringNative.list();
		return entityList;
	}


	public List<EntityObject> find(String searchText, String type) {
		try {
			String queryString ="";
			if(type.equalsIgnoreCase("fardfar")) {
				queryString ="f.far_dfar_code ilike '%"+searchText+"%'";
			} else {
				queryString ="f.answer_id ='"+searchText+"'";
			}
			String finalQueryString ="select * from swiftschema.entity where pk_entity_id in (select distinct(pk_entity_id) from swiftschema.far_dfar_answer_details f where "+queryString+")";
			NativeQuery finalQueryStringNative =getCurrentSession().createNativeQuery(finalQueryString);
			
			finalQueryStringNative.addEntity(EntityObject.class);
			List<EntityObject> entityList = finalQueryStringNative.list();
			return entityList;
			
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting findBySearchText findBySearchText :"+searchText);
			throw ex;
		}
	}
	

	public List<Object> getDistinctDfar() {
		try {
			String distinctFarQueryString ="select distinct(far_dfar_code) FROM swiftschema.far_dfar_answer_details where far_dfar_type = 'DFAR'";
			NativeQuery distinctFarQueryStringNative =getCurrentSession().createNativeQuery(distinctFarQueryString);
			
//			distinctFarQueryStringNative.addEntity(FarDFarAnswersData.class);
			List<Object> entityList = distinctFarQueryStringNative.list();
			return entityList;
			
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting distinct dfar");
			throw ex;
		}
	}
	
	public List<Object> getDistinctFar() {
		try {

			String distinctFarQueryString ="select distinct(far_dfar_code) FROM swiftschema.far_dfar_answer_details where far_dfar_type = 'FAR'";
			NativeQuery distinctFarQueryStringNative =getCurrentSession().createNativeQuery(distinctFarQueryString);
			
//			distinctFarQueryStringNative.addEntity(FarDFarAnswersData.class);
			List<Object> entityList = distinctFarQueryStringNative.list();
			return entityList;
			
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting distinct far");
			throw ex;
		}
	}
	
	
	public List<Object> getDistinctDfar(String farDfarVariable) {
		try {
			String distinctFarQueryString ="select distinct(far_dfar_code) FROM swiftschema.far_dfar_answer_details where far_dfar_type = '" + farDfarVariable + "'";
			NativeQuery distinctFarQueryStringNative =getCurrentSession().createNativeQuery(distinctFarQueryString);
			
//			distinctFarQueryStringNative.addEntity(EntityObject.class);
			List<Object> entityList = distinctFarQueryStringNative.list();
			return entityList;
			
		}catch(Exception ex) {
			log.error("swiftCode - Error while getting distinct dfar");
			throw ex;
		}
	}

	
}

