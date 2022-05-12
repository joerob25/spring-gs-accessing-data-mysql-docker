package io.vosy.gsaccessingdatamysqldocker.repository;

import io.vosy.gsaccessingdatamysqldocker.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
