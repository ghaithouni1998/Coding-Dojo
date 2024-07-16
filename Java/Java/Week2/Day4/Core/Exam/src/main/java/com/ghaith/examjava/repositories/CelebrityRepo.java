package com.ghaith.examjava.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ghaith.examjava.models.Celebrity;
import com.ghaith.examjava.models.User;

public interface CelebrityRepo extends CrudRepository<Celebrity, Long> {
	List<Celebrity> findAll();
	Celebrity findByIdIs(Long id);
	List<Celebrity> findAllByUsers(User user);
	List<Celebrity> findByUsersNotContains(User user);
}
