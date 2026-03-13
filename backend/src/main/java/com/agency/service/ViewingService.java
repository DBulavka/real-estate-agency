package com.agency.service;

import com.agency.service.model.ViewingModel;
import java.util.List;

public interface ViewingService {

    List<ViewingModel> findAll();

    ViewingModel findById(Long id);

    ViewingModel create(ViewingModel model);

    ViewingModel update(Long id, ViewingModel model);

    void delete(Long id);
}
