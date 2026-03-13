package com.agency.service;

import com.agency.service.model.OfferModel;
import java.util.List;

public interface OfferService {

    List<OfferModel> findAll();

    OfferModel findById(Long id);

    OfferModel create(OfferModel model);

    OfferModel update(Long id, OfferModel model);

    void delete(Long id);
}
