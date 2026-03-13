package com.agency.repository.mapper;

import com.agency.repository.entity.Viewing;
import com.agency.service.model.ViewingModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ViewingEntityMapper {

    ViewingModel toModel(Viewing entity);

    Viewing toEntity(ViewingModel model);
}
