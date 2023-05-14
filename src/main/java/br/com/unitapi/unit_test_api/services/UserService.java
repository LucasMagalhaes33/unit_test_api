package br.com.unitapi.unit_test_api.services;

import br.com.unitapi.unit_test_api.domain.User;

public interface UserService {

    User findById(Integer id);
}