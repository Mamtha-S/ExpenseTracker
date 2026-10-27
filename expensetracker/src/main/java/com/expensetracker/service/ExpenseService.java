package com.expensetracker.service;

import com.expensetracker.dto.ExpenseRequest;
import com.expensetracker.dto.ExpenseResponse;
import com.expensetracker.dto.MonthlySummaryResponse;
import java.util.List;

public interface ExpenseService {
    ExpenseResponse createExpense(ExpenseRequest expenseRequest);
    List<ExpenseResponse> getAllExpenses();
    ExpenseResponse getExpenseById(Long id);
    ExpenseResponse updateExpense(Long id, ExpenseRequest expenseRequest);
    void deleteExpense(Long id);
    List<ExpenseResponse> getExpensesByCategory(String category);
    Double getTotalExpense();
    MonthlySummaryResponse getMonthlySummary();
}