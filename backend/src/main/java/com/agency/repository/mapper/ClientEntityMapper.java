package com.agency.repository.mapper;

import com.agency.repository.entity.Client;
import com.agency.service.model.ClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientEntityMapper {

    ClientModel toModel(Client entity);

    Client toEntity(ClientModel model);
}
