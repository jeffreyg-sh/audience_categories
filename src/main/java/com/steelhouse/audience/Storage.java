package com.steelhouse.audience;

import com.steelhouse.audience.dao.OracleCategoriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Storage {
  private OracleCategoriesDAO dao;

  @Autowired
  public Storage(OracleCategoriesDAO ds) {
    this.dao = ds;
  }

  public void doThis() {
    System.out.println(dao.findById(1L));
  }
}
