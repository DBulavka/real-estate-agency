package com.agency.service;

import com.agency.repository.OfferRepository;
import com.agency.repository.entity.Offer;
import com.agency.repository.mapper.OfferEntityMapper;
import com.agency.service.model.OfferModel;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OfferRepository repository;
    private final OfferEntityMapper mapper;

    @Override
    public List<OfferModel> findAll() {
        return repository.findAll().stream().map(mapper::toModel).toList();
    }

    @Override
    public OfferModel findById(Long id) {
        return mapper.toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public OfferModel create(OfferModel model) {
        Offer entity = mapper.toEntity(model);
        entity.setId(null);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public OfferModel update(Long id, OfferModel model) {
        Offer entity = mapper.toEntity(model);
        entity.setId(id);
        return mapper.toModel(repository.save(entity));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
