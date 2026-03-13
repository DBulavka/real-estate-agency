package com.agency.repository.mapper;

import com.agency.repository.entity.Property;
import com.agency.service.model.PropertyModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyEntityMapper {

    PropertyModel toModel(Property entity);

    Property toEntity(PropertyModel model);
}
