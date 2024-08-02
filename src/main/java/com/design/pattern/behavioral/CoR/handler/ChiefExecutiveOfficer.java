package com.design.pattern.behavioral.CoR.handler;

import com.design.pattern.behavioral.CoR.model.ExpenseRequest;

public class ChiefExecutiveOfficer implements ExpensesHandler{
    private static final double APPROVAL_LIMIT = 9000000;

    @Override
    public void setNextHandler(ExpensesHandler next) {
        // last handler in the chain.
    }

    @Override
    public void handleExpenses(ExpenseRequest expenseRequest) {
        if (expenseRequest.getAmount() <= APPROVAL_LIMIT){
            System.out.println("ChiefExecutiveOfficer : Yes, you have my approval for these expenses of "+expenseRequest.getAmount());
        }
        else {
            System.out.println("ChiefExecutiveOfficer : I cannot approve these expenses of " + expenseRequest.getAmount()
                    + ". They are too high, it's look like a fraud.");

        }
    }
}
