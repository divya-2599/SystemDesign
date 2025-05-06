package org.designPatternProblems.atm;

import lombok.Data;
import org.designPatternProblems.atm.state.ATMState;
import org.designPatternProblems.atm.state.IdleState;

@Data
public class ATM {

    ATMState atmCurrentState;
    private int atmBalance;
    private int noOf2kNotes;
    private int noOf500Notes;
    private int noOf100Notes;

    public ATM() {
        this.atmCurrentState = new IdleState();
    }

    public void setATMBalance(int atmBalance, int noOf2kNotes, int noOf500Notes, int noOf100Notes) {
        this.atmBalance = atmBalance;
        this.noOf2kNotes = noOf2kNotes;
        this.noOf500Notes = noOf500Notes;
        this.noOf100Notes = noOf100Notes;
    }

    public void deductTwoKNotes(int number) {
        atmBalance=atmBalance-(number*2000);
        noOf2kNotes-=number;
    }

    public void deduct500Notes(int number) {
        atmBalance=atmBalance-(number*500);
        noOf500Notes -= number;
    }

    public void deduct100Notes(int number) {
        atmBalance=atmBalance-(number*100);
        noOf100Notes-=number;
    }

    public void printCurrentATMStatus() {
        System.out.println("ATM Balance is : " + atmBalance);
        System.out.println("No. of 2k notes is  : " + noOf2kNotes);
        System.out.println("No. of 500 notes is : " + noOf500Notes);
        System.out.println("No. of 100 notes is : " + noOf100Notes);
    }

}
