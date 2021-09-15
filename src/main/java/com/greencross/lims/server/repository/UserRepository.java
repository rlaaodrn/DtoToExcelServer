package com.greencross.lims.server.repository;

import com.greencross.lims.server.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
