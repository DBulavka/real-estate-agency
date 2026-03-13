package com.agency.service;

import com.agency.repository.ClientRepository;
import com.agency.repository.entity.Client;
import com.agency.repository.mapper.ClientEntityMapper;
import com.agency.service.model.ClientModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;
    private final ClientEntityMapper mapper;

    @Override
    public List<ClientModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public ClientModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public ClientModel create(ClientModel model) {
        Client entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public ClientModel update(Long id, ClientModel model) {
        Client entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
