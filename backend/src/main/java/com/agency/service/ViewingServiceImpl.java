package com.agency.service;

import com.agency.repository.ViewingRepository;
import com.agency.repository.entity.Viewing;
import com.agency.repository.mapper.ViewingEntityMapper;
import com.agency.service.model.ViewingModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewingServiceImpl implements ViewingService {

    private final ViewingRepository repository;
    private final ViewingEntityMapper mapper;

    @Override
    public List<ViewingModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public ViewingModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public ViewingModel create(ViewingModel model) {
        Viewing entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public ViewingModel update(Long id, ViewingModel model) {
        Viewing entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
