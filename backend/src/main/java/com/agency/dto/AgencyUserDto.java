package com.agency.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgencyUserDto {
    private Long id;
    private String email;
    private String fullName;
    private String role;
    private String phone;
    private Boolean active;
}
