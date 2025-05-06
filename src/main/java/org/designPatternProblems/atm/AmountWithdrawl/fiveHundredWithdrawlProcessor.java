package org.designPatternProblems.atm.AmountWithdrawl;

import org.designPatternProblems.atm.ATM;

public class fiveHundredWithdrawlProcessor extends CashWithdrwalProcessor {
    public fiveHundredWithdrawlProcessor(CashWithdrwalProcessor cashWithdrwalProcessor) {
        super(cashWithdrwalProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/500;
        int balance = remainingAmount%500;
        if(required<=atm.getNoOf500Notes()) {
            atm.deduct500Notes(required);
        }
        else {
            atm.deduct500Notes(atm.getNoOf500Notes());
            balance = balance + (required- atm.getNoOf500Notes()) * 500;
        }
        if(balance!=0){
            super.withdraw(atm, balance);
        }

    }
}
