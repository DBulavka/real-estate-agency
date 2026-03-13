package com.agency.repository.mapper;

import com.agency.repository.entity.AgencyUser;
import com.agency.service.model.AgencyUserModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AgencyUserEntityMapper {

    AgencyUserModel toModel(AgencyUser entity);

    AgencyUser toEntity(AgencyUserModel model);
}
