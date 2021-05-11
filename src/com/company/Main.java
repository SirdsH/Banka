package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] banks = {"ČS", "ČSOB"};
        int[] accId = new int[10];
        int idLength;
        int bankNumber;
        int mainMenu;
        int choice;
        int accMenu;
        int bankMenu;

        Account acc = new Account();

        Human pn = new Human();

        System.out.println("Hello what bank do you want to use?");
        System.out.println("1. ČS");
        System.out.println("2. ČSOB");
        System.out.println("3. Exit");
        bankNumber = Integer.parseInt(sc.nextLine());
        if (bankNumber == 1) {
            System.out.println("Welcome in " + banks[0] + " what's your first name?");
            pn.setFirstName(sc.nextLine());
            System.out.println("What's your last name?");
            pn.setLastName(sc.nextLine());
            System.out.println("And how old are you Mr." + pn.getLastName() + " ?");
            pn.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("What do you want to do now?");
            System.out.println("1. Create account");
            System.out.println("2. Exit");
            mainMenu = Integer.parseInt(sc.nextLine());
            while (mainMenu == 1) {
                System.out.println("Choose number of Id index: ");
                idLength = Integer.parseInt(sc.nextLine());
                accId[idLength] = Integer.parseInt(acc.createId());
                System.out.println("We created your account Id, it is: " + acc.getId());
                System.out.println("Now please create your password Mr." + pn.getLastName() + ", password must be between 4-8 numbers!");
                pn.setPassword(Integer.parseInt(sc.nextLine()));
                System.out.println("You have successfully created an account!");
                System.out.println("What do you want to do now?");
                System.out.println("1. Create account");
                System.out.println("2. Log in into account");
                System.out.println("3. Log in into bank");
                System.out.println("4. Exit");
                choice = Integer.parseInt(sc.nextLine());

                while (choice == 2) {
                    System.out.println("Please enter your password: ");
                    pn.assertCorrectPassword(Integer.parseInt(sc.nextLine()));
                    System.out.println("Welcome Mr." + pn.getLastName() + "!");
                    System.out.println();
                    System.out.println("You have $" + acc.getBalance() + " on account!");
                    System.out.println("What do you want to do now?");
                    System.out.println("1. Account details");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Log out");
                    accMenu = Integer.parseInt(sc.nextLine());
                    if (accMenu == 1) {
                        System.out.println("Account owner name: " + pn.getFullName());
                        System.out.println("Account owner age: " + pn.getAge());
                        System.out.println("Account Id: " + acc.getId());
                        System.out.println("Account password: " + pn.getPassword());
                        System.out.println("Account balance: " + acc.getBalance());
                    }
                    if (accMenu == 2) {
                        System.out.println("Please choose amount you want to deposit!");
                        acc.deposit(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have now $" + acc.getBalance() + " on account!");
                    }

                    if (accMenu == 3) {
                        System.out.println("Please choose amount you want to withdraw!");
                        acc.withdraw(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have now $" + acc.getBalance() + " on account!");
                    }

                    if (accMenu == 4) {
                        System.out.println("You have been successfully logged out!");

                        System.out.println("What do you want to do now?");
                        System.out.println("1. Create account");
                        System.out.println("2. Log in into account");
                        System.out.println("3. Log in into bank");
                        System.out.println("4. Exit");
                        choice = Integer.parseInt(sc.nextLine());
                    }
                }

                while (choice == 3) {
                    System.out.println("Welcome administrator!");
                    System.out.println("What do you want to do now?");
                    System.out.println(Arrays.toString(accId));
                    System.out.println("1. Create account");
                    System.out.println("2. Remove account");
                    System.out.println("3. Log out");
                    bankMenu = Integer.parseInt(sc.nextLine());
                    if (bankMenu == 1) {
                        System.out.println("Choose number of Id index: ");
                        idLength = Integer.parseInt(sc.nextLine());
                        accId[idLength] = Integer.parseInt(acc.createId());
                        System.out.println("We created your account Id, it is: " + acc.getId());
                        System.out.println("Now please create your password Mr." + pn.getLastName() + ", password must be between 4-8 numbers!");
                        pn.setPassword(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have successfully created an account!");
                    }
                    if (bankMenu == 2) {
                        System.out.println("Please choose number of Id account index you want to remove: ");
                        idLength = Integer.parseInt(sc.nextLine());
                        accId[idLength] = 0;
                    }

                    if (bankMenu == 3) {
                        System.out.println("You have been successfully logged out!");

                        System.out.println("What do you want to do now?");
                        System.out.println("1. Create account");
                        System.out.println("2. Log in into account");
                        System.out.println("3. Log in into bank");
                        System.out.println("4. Exit");
                        choice = Integer.parseInt(sc.nextLine());
                    }
                }

                if (choice == 4) {
                    System.out.println("Thank you for visiting our application Mr." + pn.getFullName() + " see you next time!");
                }
            }
            if (mainMenu == 2) {
                System.out.println("Thank you for visiting our application Mr." + pn.getFullName() + " see you next time!");
            }


        } else if (bankNumber == 2) {
            System.out.println("Welcome in " + banks[1] + " what's your first name?");
            pn.setFirstName(sc.nextLine());
            System.out.println("What's your last name?");
            pn.setLastName(sc.nextLine());
            System.out.println("And how old are you Mr." + pn.getLastName() + " ?");
            pn.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("What do you want to do now?");
            System.out.println("1. Create account");
            System.out.println("2. Exit");
            mainMenu = Integer.parseInt(sc.nextLine());
            while (mainMenu == 1) {
                System.out.println("Choose number of Id index: ");
                idLength = Integer.parseInt(sc.nextLine());
                accId[idLength] = Integer.parseInt(acc.createId());
                System.out.println("We created your account Id, it is: " + acc.getId());
                System.out.println("Now please create your password Mr." + pn.getLastName() + ", password must be between 4-8 numbers!");
                pn.setPassword(Integer.parseInt(sc.nextLine()));
                System.out.println("You have successfully created an account!");
                System.out.println("What do you want to do now?");
                System.out.println("1. Create account");
                System.out.println("2. Log in into account");
                System.out.println("3. Log in into bank");
                System.out.println("4. Exit");
                choice = Integer.parseInt(sc.nextLine());

                while (choice == 2) {
                    System.out.println("Please enter your password: ");
                    pn.assertCorrectPassword(Integer.parseInt(sc.nextLine()));
                    System.out.println("Welcome Mr." + pn.getLastName() + "!");
                    System.out.println();
                    System.out.println("You have $" + acc.getBalance() + " on account!");
                    System.out.println("What do you want to do now?");
                    System.out.println("1. Account details");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Log out");
                    accMenu = Integer.parseInt(sc.nextLine());
                    if (accMenu == 1) {
                        System.out.println("Account owner name: " + pn.getFullName());
                        System.out.println("Account owner age: " + pn.getAge());
                        System.out.println("Account Id: " + acc.getId());
                        System.out.println("Account password: " + pn.getPassword());
                        System.out.println("Account balance: " + acc.getBalance());
                    }
                    if (accMenu == 2) {
                        System.out.println("Please choose amount you want to deposit!");
                        acc.deposit(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have now $" + acc.getBalance() + " on account!");
                    }

                    if (accMenu == 3) {
                        System.out.println("Please choose amount you want to withdraw!");
                        acc.withdraw(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have now $" + acc.getBalance() + " on account!");
                    }

                    if (accMenu == 4) {
                        System.out.println("You have been successfully logged out!");

                        System.out.println("What do you want to do now?");
                        System.out.println("1. Create account");
                        System.out.println("2. Log in into account");
                        System.out.println("3. Log in into bank");
                        System.out.println("4. Exit");
                        choice = Integer.parseInt(sc.nextLine());
                    }
                }

                while (choice == 3) {
                    System.out.println("Welcome administrator!");
                    System.out.println("What do you want to do now?");
                    System.out.println(Arrays.toString(accId));
                    System.out.println("1. Create account");
                    System.out.println("2. Remove account");
                    System.out.println("3. Log out");
                    bankMenu = Integer.parseInt(sc.nextLine());
                    if (bankMenu == 1) {
                        System.out.println("Choose number of Id index: ");
                        idLength = Integer.parseInt(sc.nextLine());
                        accId[idLength] = Integer.parseInt(acc.createId());
                        System.out.println("We created your account Id, it is: " + acc.getId());
                        System.out.println("Now please create your password Mr." + pn.getLastName() + ", password must be between 4-8 numbers!");
                        pn.setPassword(Integer.parseInt(sc.nextLine()));
                        System.out.println("You have successfully created an account!");
                    }
                    if (bankMenu == 2) {
                        System.out.println("Please choose number of Id account index you want to remove: ");
                        idLength = Integer.parseInt(sc.nextLine());
                        accId[idLength] = 0;
                    }

                    if (bankMenu == 3) {
                        System.out.println("You have been successfully logged out!");

                        System.out.println("What do you want to do now?");
                        System.out.println("1. Create account");
                        System.out.println("2. Log in into account");
                        System.out.println("3. Log in into bank");
                        System.out.println("4. Exit");
                        choice = Integer.parseInt(sc.nextLine());
                    }
                }

                if (choice == 4) {
                    System.out.println("Thank you for visiting our application Mr." + pn.getFullName() + " see you next time!");
                }
            }
            if (mainMenu == 2) {
                System.out.println("Thank you for visiting our application Mr." + pn.getFullName() + " see you next time!");
            }
        } else if (bankNumber == 3) {
            System.out.println("Thank you for visiting our application, see you next time!");
        }
    }

}
