package com.agency.service;

import com.agency.repository.PropertyRepository;
import com.agency.repository.entity.Property;
import com.agency.repository.mapper.PropertyEntityMapper;
import com.agency.service.model.PropertyModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository repository;
    private final PropertyEntityMapper mapper;

    @Override
    public List<PropertyModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public PropertyModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public PropertyModel create(PropertyModel model) {
        Property entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public PropertyModel update(Long id, PropertyModel model) {
        Property entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
