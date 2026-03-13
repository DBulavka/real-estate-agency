package com.agency.service;

import com.agency.service.model.ClientModel;
import java.util.List;

public interface ClientService {

    List<ClientModel> findAll();

    ClientModel findById(Long id);

    ClientModel create(ClientModel model);

    ClientModel update(Long id, ClientModel model);

    void delete(Long id);
}
