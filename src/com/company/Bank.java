package com.company;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    private int bankBalance;

    private String bankPassword;

    public String setBankBalance() {
        Random rnd = new Random();
        bankBalance = rnd.nextInt(999999999);

        return String.format("%06d", bankBalance);
    }

    public String bankPassword() {
        Scanner sc = new Scanner(System.in);

        int digit = 8;

        String lowerCase = "qwertzuiopasdfghjklyxcvbnm";
        String upperCase = "QWERTZUIOPASDFGHJKLYXCVBNM";

        bankPassword = "";

        for (int i = 0; i < digit; i++) {
            int rand = (int) (3 * Math.random());

            switch (rand) {
                case 0:
                    bankPassword += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    rand = (int) (lowerCase.length() * Math.random());
                    bankPassword += String.valueOf((lowerCase.charAt(rand)));
                    break;
                case 2:
                    rand = (int) (upperCase.length() * Math.random());
                    bankPassword += String.valueOf((upperCase.charAt(rand)));
                    break;
            }
        }
        return bankPassword;
    }

    public void assertCorrectPassword(String pass) {
        if (pass.equals(bankPassword)) {
        } else {
            throw new IllegalArgumentException("Please enter valid password!");
        }
    }
}
