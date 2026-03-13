package com.agency.service;

import com.agency.service.model.DealModel;
import java.util.List;

public interface DealService {

    List<DealModel> findAll();

    DealModel findById(Long id);

    DealModel create(DealModel model);

    DealModel update(Long id, DealModel model);

    void delete(Long id);
}
