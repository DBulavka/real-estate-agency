package com.agency.service;

import com.agency.repository.DealRepository;
import com.agency.repository.entity.Deal;
import com.agency.repository.mapper.DealEntityMapper;
import com.agency.service.model.DealModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DealServiceImpl implements DealService {

    private final DealRepository repository;
    private final DealEntityMapper mapper;

    @Override
    public List<DealModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public DealModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public DealModel create(DealModel model) {
        Deal entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public DealModel update(Long id, DealModel model) {
        Deal entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
