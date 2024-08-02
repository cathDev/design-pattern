package com.design.pattern;

import com.design.pattern.behavioral.CoR.handler.*;
import com.design.pattern.behavioral.CoR.model.ExpenseRequest;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        ExpensesHandler manager = new Manager();
        ExpensesHandler cfo = new ChiefFinancialOfficer();
        ExpensesHandler director = new Director();
        ExpensesHandler ceo = new ChiefExecutiveOfficer();

        manager.setNextHandler(cfo);
        cfo.setNextHandler(director);
        director.setNextHandler(ceo);

        ExpenseRequest request1 = new ExpenseRequest(450000);
        ExpenseRequest request2 = new ExpenseRequest(1300000);
        ExpenseRequest request3 = new ExpenseRequest(2450000);
        ExpenseRequest request4 = new ExpenseRequest(5700000);
        ExpenseRequest request5 = new ExpenseRequest(9100000);

        manager.handleExpenses(request1);
        manager.handleExpenses(request2);
        manager.handleExpenses(request3);
        manager.handleExpenses(request4);
        manager.handleExpenses(request5);
    }
}
