package com.steelhouse.audience;

import com.steelhouse.audience.dao.OracleCategoriesDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Slf4j
public class Storage {
  private OracleCategoriesDAO dao;

  @Autowired
  public Storage(OracleCategoriesDAO ds) {
    this.dao = ds;
  }

  public void doThis() {
    log.debug(dao.findById(1L).toString());
  }
}
