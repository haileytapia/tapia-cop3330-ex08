
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        int numPeople, numPizzas, numSlices;
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        numPeople = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        numPizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        numSlices = input.nextInt();

        System.out.print(numPeople + " people with " + numPizzas + " pizzas (" + (numPizzas * numSlices) + " slices)\nEach person gets " + ((numPizzas * numSlices) / numPeople) + " pieces of pizza.\nThere are " + ((numPizzas * numSlices) - (((numPizzas * numSlices) / numPeople)) * numPeople) + " leftover pieces.");
    }
}
