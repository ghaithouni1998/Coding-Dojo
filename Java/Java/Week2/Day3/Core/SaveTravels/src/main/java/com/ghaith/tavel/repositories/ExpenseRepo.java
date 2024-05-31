package com.ghaith.tavel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ghaith.tavel.models.Expense;
@Repository

public interface ExpenseRepo extends CrudRepository<Expense, Long> {
//	find all
	List<Expense> findAll();
}
