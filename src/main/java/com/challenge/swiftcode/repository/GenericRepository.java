package com.challenge.swiftcode.repository;

import org.springframework.stereotype.Component;

@Component
public interface GenericRepository<T>   {
     T create(T t);
     T update(T t);
     T merge(T t);
     void delete(T t);
}
