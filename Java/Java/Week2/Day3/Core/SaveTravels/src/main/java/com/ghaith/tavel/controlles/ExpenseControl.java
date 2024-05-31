package com.ghaith.tavel.controlles;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ghaith.tavel.models.Expense;
import com.ghaith.tavel.services.ExpenseServ;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/expenses")
public class ExpenseControl {

		
		@Autowired
		private ExpenseServ expenseServ;
//		 all exp
		@GetMapping("")
		public String home(@ModelAttribute("expense") Expense expense,Model model) {
			
			List<Expense> allExpenses=expenseServ.allExpences();
			model.addAttribute("allExpenses",allExpenses);
			return "home.jsp";
		}
		
		@PostMapping("/create")
		public String postMethodName(@Valid @ModelAttribute("expense") Expense expense,BindingResult result,Model model)	{
			
			if (result.hasErrors()) {
				
				List<Expense> allExpenses=expenseServ.allExpences();
				model.addAttribute("allExpenses",allExpenses);
				return "home.jsp";
				
			}
			else {
				Expense nexpense=expenseServ.create(expense);
				return "redirect:/expenses";
			}
		
		}
		@GetMapping("/{id}")
		public String showOne(@PathVariable("id") Long id,Model model) {
			Expense selectExpense= expenseServ.findExpenseById(id);
			model.addAttribute("expense",selectExpense);
			return "show.jsp";
			
			
		}
		
		@GetMapping("/edit/{id}")
		public String getMethodName(Model model, @PathVariable("id") Long id) {
			Expense selectExpense= expenseServ.findExpenseById(id);
			model.addAttribute("expense",selectExpense);
			return "edit.jsp";
		}
		
		@PutMapping("/{id}")
		public String editBook(@Valid @ModelAttribute("expense") Expense expense,BindingResult result) {
			
			if(result.hasErrors()) {
				return "edit.jsp";
			}else {
				expenseServ.updateExpense(expense);
			
				return "redirect:/expenses";
			}
		}
		
		@DeleteMapping("/{id}")
		public String deleteBook(@PathVariable("id") Long id) {
			
			expenseServ.deleteExpense(id);
			
			return "redirect:/expenses";
		}
}
