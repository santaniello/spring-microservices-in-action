package com.thoughtmechanix.licenses.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class License{
  private String licenseId;
  private String organizationId;
  private String productName;
  private String licenseType;
  private Integer licenseMax;
  private Integer licenseAllocated;
  private String comment;
}
