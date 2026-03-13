package com.agency.controller.mapper;

import com.agency.dto.AgencyUserDto;
import com.agency.service.model.AgencyUserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgencyUserDtoMapper {

    AgencyUserDto toDto(AgencyUserModel model);

    AgencyUserModel toModel(AgencyUserDto dto);
}
