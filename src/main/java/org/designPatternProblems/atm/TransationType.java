package org.designPatternProblems.atm;

public enum TransationType {
    CASH_WITHDRWAL, CHECK_BALANCE;
    public static void showAllTransactionTypes() {
        for(TransationType type : TransationType.values())
         System.out.println(type.name());
    }
}
