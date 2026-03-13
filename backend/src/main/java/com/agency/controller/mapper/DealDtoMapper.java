package com.agency.controller.mapper;

import com.agency.dto.DealDto;
import com.agency.service.model.DealModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DealDtoMapper {

    DealDto toDto(DealModel model);

    DealModel toModel(DealDto dto);
}
