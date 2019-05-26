package com.thoughtmechanix.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
}
