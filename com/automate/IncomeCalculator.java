package com.automate;

import java.util.Scanner;

public class IncomeCalculator {
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byte noOfWorkingHours = numberOfWorkingHours();
        int income = incomeCalculation(noOfWorkingHours);
        if (income <0) {
            displayOutput();
        } else
            System.out.println("Total income in a year:" + income);

    }


    private static byte numberOfWorkingHours() {
        System.out.print("Enter no of hours worked in a day:");
        byte noOfWorkingHours = scanner.nextByte();
        return noOfWorkingHours;

    }

    private static int incomeCalculation(byte noOfWorkingHours) {
        if (validateWorkingHours(noOfWorkingHours) == true)
            return (noOfWorkingHours * 100) * 365;
            return -1;
    }


    private static void displayOutput() {

        System.out.println("Unable to calculate the earnings");

    }

    private static boolean validateWorkingHours(byte noOfWorkingHours) {
        if (noOfWorkingHours >= 0 && noOfWorkingHours <= 24)
            return true;
        else
            return false;
    }

}
