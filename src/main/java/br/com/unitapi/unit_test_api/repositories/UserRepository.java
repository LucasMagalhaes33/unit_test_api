package br.com.unitapi.unit_test_api.repositories;

import br.com.unitapi.unit_test_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {



}
