package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aNumber = promptInt("Enter an integer.");
        System.out.println("Twice your number is " + aNumber * 2);
        double aDouble = promptDouble("Enter a Double");
        System.out.println("Twice your number is " + aDouble * 2);
        String aString = promptString("Enter a String");
        System.out.println("Your string is " + aString);

    }

    static int promptInt(String message) {
        System.out.println(message);
        String userInput = input.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = input.nextLine();
            }
        }

        return userInt;
    }
    static Double promptDouble(String message) {
        System.out.println(message);
        String userInput = input.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = input.nextLine();
            }
        }

        return userDouble;
    }

    static String promptString(String message) {
        System.out.println(message);
        String userInput = input.nextLine();

        String userString = "";
        boolean isString = false;
        while (!isString) {
            try {
                int a = Integer.parseInt(userInput);
                double b = Double.parseDouble(userInput);
                System.out.println(userInput + " is not a valid string. " + message);
                userInput = input.nextLine();
            }
            catch (Exception e){
                isString = true;
            }


            }

            return userInput;
        }









    }


