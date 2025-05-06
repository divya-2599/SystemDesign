package org.designPatternProblems.atm.AmountWithdrawl;

import org.designPatternProblems.atm.ATM;

public class twokWithdrawlProcessor extends CashWithdrwalProcessor {
    public twokWithdrawlProcessor(CashWithdrwalProcessor cashWithdrwalProcessor) {
        super(cashWithdrwalProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;
        if(required<=atm.getNoOf2kNotes()) {
            atm.deductTwoKNotes(required);
        }
        else {
            atm.deductTwoKNotes(atm.getNoOf500Notes());
            balance = balance + (required- atm.getNoOf2kNotes()) * 500;
        }
        if(balance!=0){
            super.withdraw(atm, balance);
        }

    }
}
