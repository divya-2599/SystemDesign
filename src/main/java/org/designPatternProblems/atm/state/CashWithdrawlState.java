package org.designPatternProblems.atm.state;

import org.designPatternProblems.atm.ATM;
import org.designPatternProblems.atm.AmountWithdrawl.CashWithdrwalProcessor;
import org.designPatternProblems.atm.AmountWithdrawl.fiveHundredWithdrawlProcessor;
import org.designPatternProblems.atm.AmountWithdrawl.oneHundredWithdrawlProcessor;
import org.designPatternProblems.atm.AmountWithdrawl.twokWithdrawlProcessor;
import org.designPatternProblems.atm.Card;

public class CashWithdrawlState extends ATMState {

    public CashWithdrawlState() {
        System.out.println("Please enter the withdrawl amount");
    }

    @Override
    public void cashWithdrawl(ATM atm, Card card, int withdrawlAmount) {
        if(atm.getAtmBalance()<withdrawlAmount) {
            System.out.println("Insufficient balance in atm");
            exit(atm);
        } else if(card.getBankBalance()<withdrawlAmount) {
            System.out.println("Insufficient bank balance");
            exit(atm);
        } else {
            CashWithdrwalProcessor cashWithdrwalProcessor = new twokWithdrawlProcessor(new fiveHundredWithdrawlProcessor(new oneHundredWithdrawlProcessor(null)));
            cashWithdrwalProcessor.withdraw(atm, withdrawlAmount);
            exit(atm);
        }

    }

}
