package com.ghaith.examjava.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.examjava.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findAll();
	Optional<User> findByEmail(String email);
	User findByIdIs(Long id);
}
