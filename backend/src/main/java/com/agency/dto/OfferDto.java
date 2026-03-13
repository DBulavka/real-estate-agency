package com.agency.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfferDto {
    private Long id;
    private Long propertyId;
    private Long clientId;
    private java.math.BigDecimal amount;
    private String status;
    private String comment;
}
