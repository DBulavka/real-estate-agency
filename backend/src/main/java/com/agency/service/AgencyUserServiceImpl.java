package com.agency.service;

import com.agency.repository.AgencyUserRepository;
import com.agency.repository.entity.AgencyUser;
import com.agency.repository.mapper.AgencyUserEntityMapper;
import com.agency.service.model.AgencyUserModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgencyUserServiceImpl implements AgencyUserService {

    private final AgencyUserRepository repository;
    private final AgencyUserEntityMapper mapper;

    @Override
    public List<AgencyUserModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public AgencyUserModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public AgencyUserModel create(AgencyUserModel model) {
        AgencyUser entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public AgencyUserModel update(Long id, AgencyUserModel model) {
        AgencyUser entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
