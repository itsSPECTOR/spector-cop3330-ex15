package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 15 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{
    public static void main( String[] args )
    {

        // scanner
        Scanner input = new Scanner(System.in);

        // get info
        System.out.print("What is the username? ");
        String strName = input.nextLine();
        System.out.print("What is the password? ");
        String strPW = input.nextLine();

        //if 'correct'
        if (strPW.contains("abc$123")){
            System.out.print("Welcome! " + strName);
        } else {
            System.out.print("I don't know you.\n");
        }
    }
}
