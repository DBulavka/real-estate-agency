package com.agency.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewingModel {
    private Long id;
    private Long propertyId;
    private Long clientId;
    private Long agentId;
    private java.time.OffsetDateTime scheduledAt;
    private String status;
    private String notes;
}
