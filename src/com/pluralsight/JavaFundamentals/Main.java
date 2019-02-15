package com.pluralsight.JavaFundamentals;

public class Main {

    public static void main(String[] args) {

        /* Naming variables */
        System.out.println();
        System.out.println("*** Naming Variables ***");
        System.out.println();

        int number = 3;
        String firstname = "Julie";
        firstname = "Rik";

        number = 5 + 2;

        System.out.println("Number:  " +number);
        System.out.println("Firstname:  "+firstname);

        int number2 = 3;
        number2 += number;
        System.out.println("Number2:  "+number2);

    }
}
