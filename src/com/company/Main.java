/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        String kp = "abc$123";
        System.out.print("Enter your username: ");
        String user = scan.nextLine();
        System.out.print("What is the password? ");
        String pass = scan.nextLine();

        if(kp.equals(pass)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
