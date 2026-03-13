package com.agency.repository.mapper;

import com.agency.repository.entity.Deal;
import com.agency.service.model.DealModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DealEntityMapper {

    DealModel toModel(Deal entity);

    Deal toEntity(DealModel model);
}
