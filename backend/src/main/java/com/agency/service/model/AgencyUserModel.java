package com.agency.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgencyUserModel {
    private Long id;
    private String email;
    private String fullName;
    private String role;
    private String phone;
    private Boolean active;
}
