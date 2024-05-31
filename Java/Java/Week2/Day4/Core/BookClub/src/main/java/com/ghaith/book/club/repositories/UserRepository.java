package com.ghaith.book.club.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.book.club.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	 Optional<User> findByEmail(String email);
}
