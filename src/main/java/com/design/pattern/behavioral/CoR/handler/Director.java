package com.design.pattern.behavioral.CoR.handler;

import com.design.pattern.behavioral.CoR.model.ExpenseRequest;

public class Director implements ExpensesHandler{
    private static final double APPROVAL_LIMIT = 2500000;
    private ExpensesHandler nextHandler;
    @Override
    public void setNextHandler(ExpensesHandler next) {
        this.nextHandler = next;
    }

    @Override
    public void handleExpenses(ExpenseRequest expenseRequest) {
        if (expenseRequest.amount() <= APPROVAL_LIMIT){
            System.out.println("Director : Yes, you have my approval for these expenses of "+expenseRequest.amount());
        }
        else {
            String nameOfMyHierarchicSuperior = this.nextHandler.getClass().getName();
            System.out.println("Director : I cannot approve these expenses of "+ expenseRequest.amount() +
                    ". You must going to see "+
                    nameOfMyHierarchicSuperior.substring(nameOfMyHierarchicSuperior.lastIndexOf(".")+1));
            this.nextHandler.handleExpenses(expenseRequest);
        }
    }
}
