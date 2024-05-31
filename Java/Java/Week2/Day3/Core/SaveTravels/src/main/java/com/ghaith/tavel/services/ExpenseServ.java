package com.ghaith.tavel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghaith.tavel.models.Expense;
import com.ghaith.tavel.repositories.ExpenseRepo;

@Service
public class ExpenseServ {
	@Autowired
	ExpenseRepo expenseRepo;
	
	
	// READ ONE
		public Expense findExpenseById(Long id) {
			Optional<Expense> expense = expenseRepo.findById(id);
			if (expense.isPresent()) {
				return expense.get();
			} else {
				return null;
			}
		}

	// CREATE ONE 
	
	
	public Expense create(Expense expense) {

		return expenseRepo.save(expense);

	}
	

	// GET ALL 

	public List<Expense> allExpences() {
		return expenseRepo.findAll();
	}

	

	// UPDATE
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}

	// DELETE
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	
}
