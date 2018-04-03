package com.econtabil.integration.service;

import java.util.List;

import com.econtabil.integration.domain.RandomCity;
import com.econtabil.integration.domain.User;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
