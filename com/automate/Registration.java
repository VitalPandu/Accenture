package com.automate;

import java.util.Scanner;

public class Registration {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your name:");
        String name =sc.nextLine();
        System.out.print("Enter your age:");
        byte age =sc.nextByte();
        System.out.print("Enter your phoneno:");
        String phoneNumber =sc.next();
        System.out.print("Enter your qualification:");
        String qualification =sc.next();
        System.out.print("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
        String email =sc.next();
        System.out.print("Enter your noofexperience[if any]:");
        double numberOfYearsOfExperience =sc.nextDouble();

        System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+email+" within 2 working days" );


    }
}
