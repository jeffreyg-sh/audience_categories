package com.steelhouse.audience.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "oracle_categories")
public class OracleCategories {

  @Id
  private long categoryId;
  private String name;
  private long parentId;
  private String description;
  private long partnerId;
  private String verticalName;
  private String visibilityStatus;
  private String categoryType;
//  private String public;
  private String countable;
  private String navigationOnly;
  private String analytics;
  private String mutuallyExclusiveChildren;
  private String explicitPriceFloor;
  private long sortOrder;
  private String ownership;
  private String isLeafNode;
  private String pathFromRoot;
  private String names;
  private String status;
  private String links;
  private java.sql.Timestamp createdOn;
  private java.sql.Timestamp updatedOn;
}
