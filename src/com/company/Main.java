package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";

        if (amount == 40.0 || 50.0) {
            System.out.println();
        }

        if (grade > 75 > amount) {

        }
        if (no && !no || yes && !yes) {
            System.out.println("True");
        }
    }
}

/*
    Expression	Result
        yes == no || grade > amount // true
        amount == 40.0 || 50.0 // (fejl da 50 er ik en bolsk værdi)
        hiVal != loVal || loVal < 0 // true
        True || hello.length() > 0  // true
        hello.isEmpty() && yes // false
        grade <= 100 && !false // true
        !yes || no // false
        grade > 75 > amount (fejl da bolsk værdi ikke kan være større end "amount")
        amount <= hiVal && amount >= loVal // true
        no && !no || yes && !yes // false

 */