package com.design.pattern.behavioral.CoR.handler;

import com.design.pattern.behavioral.CoR.model.ExpenseRequest;

public interface ExpensesHandler {

    public void setNextHandler(ExpensesHandler next);
    public void handleExpenses(ExpenseRequest expenseRequest);

}
