package com.agency.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DealModel {
    private Long id;
    private Long propertyId;
    private Long clientId;
    private Long agentId;
    private String type;
    private String status;
    private java.math.BigDecimal agreedPrice;
}
