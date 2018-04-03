package com.econtabil.integration.repository;

import org.springframework.data.repository.CrudRepository;

import com.econtabil.integration.domain.Role;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
