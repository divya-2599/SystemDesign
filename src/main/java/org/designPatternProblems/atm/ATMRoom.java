package org.designPatternProblems.atm;

public class ATMRoom {

    User user;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        ATM atm = new ATM();
        atmRoom.initialize(atm);

        atm.printCurrentATMStatus();
        atm.getAtmCurrentState().insertCard(atm, atmRoom.user.getCard());
        atm.getAtmCurrentState().authenticatePin(atm, atmRoom.user.getCard(), 12345);
        atm.getAtmCurrentState().selectOperation(atm, atmRoom.user.getCard(), TransationType.CASH_WITHDRWAL);
        atm.getAtmCurrentState().cashWithdrawl(atm, atmRoom.user.getCard(),2700);
        atm.printCurrentATMStatus();

    }

    public void initialize(ATM atm) {
        atm.setATMBalance(3500, 1, 2, 5);
        this.user = createUser();
    }

    public User createUser() {
        User user1 = new User();
        user1.setCard(createCard());
        return user1;
    }

    public Card createCard() {
        Card card = new Card();
        card.setCvv(12345);
        card.setBankAccount(createBankAccount());
        card.setHolderName("Divya Rani");
        return card;
    }

    public BankAccount createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(3000);
        return bankAccount;
    }
}
