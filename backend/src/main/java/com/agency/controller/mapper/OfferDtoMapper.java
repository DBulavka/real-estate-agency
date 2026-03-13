package com.agency.controller.mapper;

import com.agency.dto.OfferDto;
import com.agency.service.model.OfferModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferDtoMapper {

    OfferDto toDto(OfferModel model);

    OfferModel toModel(OfferDto dto);
}
