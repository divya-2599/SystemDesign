package org.designPatternProblems.atm;

import lombok.Data;

@Data
public class User {
    Card card;
    BankAccount bankAccount;
}
