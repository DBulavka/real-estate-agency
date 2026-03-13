package com.agency.controller.mapper;

import com.agency.dto.PropertyDto;
import com.agency.service.model.PropertyModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyDtoMapper {

    PropertyDto toDto(PropertyModel model);

    PropertyModel toModel(PropertyDto dto);
}
