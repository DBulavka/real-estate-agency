package com.agency.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfferModel {
    private Long id;
    private Long propertyId;
    private Long clientId;
    private java.math.BigDecimal amount;
    private String status;
    private String comment;
}
