package com.agency.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientModel {
    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String type;
    private String budgetRange;
    private Long assignedAgentId;
}
