package com.greencross.lims.server.repository;

import com.greencross.lims.server.entity.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, String> {
}
