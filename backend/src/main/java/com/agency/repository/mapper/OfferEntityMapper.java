package com.agency.repository.mapper;

import com.agency.repository.entity.Offer;
import com.agency.service.model.OfferModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OfferEntityMapper {

    OfferModel toModel(Offer entity);

    Offer toEntity(OfferModel model);
}
