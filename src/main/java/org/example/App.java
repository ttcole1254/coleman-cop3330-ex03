package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askQuote = new Scanner(System.in);
        System.out.println("What is the quote?");

        String inputQuote = askQuote.nextLine();
        if(inputQuote.isEmpty()) {
            System.out.println("A quote is required!");
        }
        else {
            Scanner askAuthor = new Scanner(System.in);
            System.out.println("Who said it?");
            String inputAuthor = askAuthor.nextLine();
            if(inputAuthor.isEmpty()) {
                System.out.println("Well someone had to have said it, please enter an author!");
            }
            else {
                System.out.println(inputAuthor + " says, \"" + inputQuote + "\"");
            }
        }
    }
}
