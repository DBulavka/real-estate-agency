package com.agency.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyDto {
    private Long id;
    private String title;
    private String type;
    private String status;
    private String address;
    private java.math.BigDecimal price;
    private Double area;
    private Integer rooms;
    private Long ownerId;
}
