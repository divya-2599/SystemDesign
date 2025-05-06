package org.designPatternProblems.atm.AmountWithdrawl;

import org.designPatternProblems.atm.ATM;

public class oneHundredWithdrawlProcessor extends CashWithdrwalProcessor {
    public oneHundredWithdrawlProcessor(CashWithdrwalProcessor cashWithdrwalProcessor) {
        super(cashWithdrwalProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;
        if(required<=atm.getNoOf100Notes()) {
            atm.deduct100Notes(required);
        }
        else {
            atm.deduct100Notes(atm.getNoOf100Notes());
            balance = balance + (required- atm.getNoOf100Notes()) * 100;
        }
        if(balance!=0){
            super.withdraw(atm, balance);
        }

    }
}
