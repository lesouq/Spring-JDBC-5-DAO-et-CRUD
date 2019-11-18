package com.wildcodeschool.wildandwizard.entity;

public interface CrudDao<T> {
	
	T save(T entity);
	T findById(Long id);
	T findAll();
	T update(T entity);
	void deleteById(Long id);
}
