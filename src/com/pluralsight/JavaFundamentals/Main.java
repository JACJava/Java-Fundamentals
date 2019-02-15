package com.pluralsight.JavaFundamentals;

public class Main {

    private static int age = 50;

    public static void main(String[] args) {

        /*
        // Using scopes
        System.out.println();
        System.out.println("*** Using Scopes ***");
        System.out.println();

        System.out.println("*** Hello World ***");

        {
            int age = 25;
            System.out.println("Age inside block is:  " + age);
        }

        int age = 20;

        System.out.println("Age is:  " + age);


        // Using opearators
        System.out.println();
        System.out.println("*** Using operators ***");
        System.out.println();

        int number = 3;

        number++;
        System.out.println("Number:  " +number);

        number = 3;
        number += 2; //same as number = number + 2
        System.out.println("Number:  " +number);

        boolean value = true;
        System.out.println("Value:  " +value);

        System.out.print("Value of expression 3 > 2:  ");
        System.out.println(3 > 2);

        System.out.print("Value of expression 3 < 2:  ");
        System.out.println(3 < 2);

        System.out.print("Value of expression 3 <= 3:  ");
        System.out.println(3 <= 3);

        System.out.print("Value of expression true && true:  ");
        System.out.println(true && true);

        System.out.print("Value of expression true && false:  ");
        System.out.println(true && false);

        System.out.print("Value of expression true || false:  ");
        System.out.println(true || false);

        System.out.print("Value of expression !true:  ");
        System.out.println(!true);

        String salutation = "Hello World";
        System.out.println("Salutation:  "+salutation);

        String firstName = "Julie";
        System.out.println("firstName:  "+firstName);

        String fullName = firstName + " Carlson";
        System.out.println("fullName:  "+fullName);

        System.out.println("Length of fullName:  "+fullName.length());
        System.out.println("Location of 'C':  "+fullName.indexOf('C'));

        // Arrays
        System.out.println();
        System.out.println("*** Arrays ***");
        System.out.println();

        int[] numbers =  new int[10];

        numbers[0] = 5;
        numbers[1] = 8;

        System.out.println("numbers[0]:  "+numbers[0]);
        System.out.println("numbers[1]:  "+numbers[1]);
        System.out.println("numbers[2]:  "+numbers[2]);

        */

        // Creating and using classes
        System.out.println();
        System.out.println("*** Creating and Using Classes ***");
        System.out.println();

        /*
        Printer myPrinter = new Printer();
        myPrinter.isOn = false;
        myPrinter.modelNumber = "ABCD";
        System.out.println("myPrinter state:  " + myPrinter.isOn +
                "  ||  myPrinter model:  " + myPrinter.modelNumber);

        Printer yourPrinter = new Printer();

        yourPrinter.isOn = true;
        yourPrinter.modelNumber = "FGH";
        System.out.println("yourPrinter state:  " + yourPrinter.isOn +
                "  ||  yourPrinter model:  " + yourPrinter.modelNumber);

        myPrinter.print();
        yourPrinter.print();

        myPrinter.print("Hello Printer");

        String theModelNumber = myPrinter.getModelNumber();
        System.out.println("theModelNumber:  " + theModelNumber);

        */
        Printer myPrinter = new Printer(true, "My Printer");
        myPrinter.print(10);

        Printer yourPrinter = new Printer(false, "Your Printer");
        yourPrinter.print(10);




    }
}
