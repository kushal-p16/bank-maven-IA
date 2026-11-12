package com.example.maven_github_bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testSuccessfulDepositAndWithdrawal() {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);

        assertEquals(1300, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        BankAccount account = new BankAccount(500);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(600);
        });
    }

    @Test
    void testZeroDeposit() {
        BankAccount account = new BankAccount(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });
    }

    @Test
    void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });
    }

    @Test
    void testMultipleTransactions() {
        BankAccount account = new BankAccount(2000);

        account.deposit(1000);
        account.withdraw(500);
        account.deposit(300);
        account.withdraw(200);

        assertEquals(2600, account.getBalance());
    }
}