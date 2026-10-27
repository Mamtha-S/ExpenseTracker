package com.expensetracker.repository;

import com.expensetracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByCategory(String category);

    @Query("SELECT SUM(e.amount) FROM Expense e")
    Double getTotalExpense();

    @Query("SELECT e FROM Expense e WHERE YEAR(e.expenseDate) = YEAR(CURRENT_DATE) " +
            "AND MONTH(e.expenseDate) = MONTH(CURRENT_DATE)")
    List<Expense> getCurrentMonthExpenses();

    @Query("SELECT e FROM Expense e WHERE e.expenseDate >= ?1 AND e.expenseDate <= ?2")
    List<Expense> findExpensesByDateRange(LocalDate startDate, LocalDate endDate);
}