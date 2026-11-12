
package com.example.maven_github_bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    // Test Case 1: Successful deposit
    @Test
    void testDeposit() {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);

        assertEquals(1500, account.getBalance());
    }

    // Test Case 2: Insufficient balance
    @Test
    void testInsufficientBalance() {

        BankAccount account = new BankAccount(500);

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> account.withdraw(600)
        );

        System.out.println("Exception: " + exception.getMessage());

        assertEquals("Insufficient balance", exception.getMessage());
    }

    // Test Case 3: Successful withdrawal
    @Test
    void testWithdrawal() {

        BankAccount account = new BankAccount(1000);

        account.withdraw(200);

        assertEquals(800, account.getBalance());
    }
}
