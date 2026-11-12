
package com.example.maven_github_bank;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        System.out.println("Bank Account Application");

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        try {
            account.withdraw(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
