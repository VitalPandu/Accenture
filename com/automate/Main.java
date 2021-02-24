package com.automate;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int  age = sc.nextInt();
        System.out.print("Enter gender:");
        String gender = sc.next();
        System.out.print("Hailing from:");
        String hcity= sc.nextLine();
        System.out.println();


        System.out.println("Welcome, "+name+"!" );
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+hcity);


    }
}

