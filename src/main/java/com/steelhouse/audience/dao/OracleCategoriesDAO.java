package com.steelhouse.audience.dao;

import com.steelhouse.audience.model.OracleCategories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Transactional
@Repository
public interface OracleCategoriesDAO extends BaseDAO<OracleCategories, Long> {}
