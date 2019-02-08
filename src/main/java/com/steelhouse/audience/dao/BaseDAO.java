package com.steelhouse.audience.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseDAO<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>
{
//  List<T> bulkInsert(List<T> entities);
//  List<T> bulkUpdate(List<T> entities);
//  List<T> bulkRemove(List<T> entities);
//  void setBatchSize(int batchSize);
//  void detach(T entity);
}
