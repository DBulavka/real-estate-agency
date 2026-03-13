package com.agency.service;

import com.agency.service.model.PropertyModel;
import java.util.List;

public interface PropertyService {

    List<PropertyModel> findAll();

    PropertyModel findById(Long id);

    PropertyModel create(PropertyModel model);

    PropertyModel update(Long id, PropertyModel model);

    void delete(Long id);
}
