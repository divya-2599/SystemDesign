package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.Card;
import org.designPatternProblems.atm.TransationType;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransationType transactionType) {
        switch (transactionType) {
            case CASH_WITHDRWAL :
                atm.setAtmCurrentState(new CashWithdrawlState());
                break;
            case CHECK_BALANCE :
                atm.setAtmCurrentState(new CheckBalanceState());
                break;
            default:
                System.out.println("Invalid operation");
                exit(atm);
        }
    }

    public void showOperations() {
        System.out.println("Please select the operation type");
        TransationType.showAllTransactionTypes();
    }
}
