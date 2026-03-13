package com.agency.controller.mapper;

import com.agency.dto.ViewingDto;
import com.agency.service.model.ViewingModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViewingDtoMapper {

    ViewingDto toDto(ViewingModel model);

    ViewingModel toModel(ViewingDto dto);
}
