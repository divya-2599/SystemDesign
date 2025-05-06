package org.designPatternProblems.atm.AmountWithdrawl;

import org.designPatternProblems.atm.ATM;

public class CashWithdrwalProcessor {

    CashWithdrwalProcessor nextProcessor;

    public CashWithdrwalProcessor(CashWithdrwalProcessor cashWithdrwalProcessor) {
        this.nextProcessor = cashWithdrwalProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if(nextProcessor != null) {
            nextProcessor.withdraw(atm, remainingAmount);
        }
    }
}
