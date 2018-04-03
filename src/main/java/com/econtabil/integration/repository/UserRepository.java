package com.econtabil.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.econtabil.integration.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
