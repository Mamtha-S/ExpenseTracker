package com.expensetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.YearMonth;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonthlySummaryResponse {
    private YearMonth month;
    private Map<String, Double> categoryTotals;
    private Double totalAmount;
}