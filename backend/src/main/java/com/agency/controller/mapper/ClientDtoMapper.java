package com.agency.controller.mapper;

import com.agency.dto.ClientDto;
import com.agency.service.model.ClientModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientDtoMapper {

    ClientDto toDto(ClientModel model);

    ClientModel toModel(ClientDto dto);
}
