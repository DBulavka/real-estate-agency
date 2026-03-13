package com.agency.service;

import com.agency.service.model.AgencyUserModel;
import java.util.List;

public interface AgencyUserService {

    List<AgencyUserModel> findAll();

    AgencyUserModel findById(Long id);

    AgencyUserModel create(AgencyUserModel model);

    AgencyUserModel update(Long id, AgencyUserModel model);

    void delete(Long id);
}
