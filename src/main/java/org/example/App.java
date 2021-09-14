package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.println( "Enter a noun: " );
        String noun = reader.nextLine();

        System.out.println( "Enter a verb: " );
        String verb = reader.nextLine();

        System.out.println( "Enter a adjective: " );
        String adj = reader.nextLine();

        System.out.println( "Enter a adverb: " );
        String adv = reader.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}