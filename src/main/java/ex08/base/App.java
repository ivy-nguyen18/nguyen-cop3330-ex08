/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex08.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        PizzaMath pizzaParty = new PizzaMath(people, slices, pizzas);

        pizzaParty.summary();
        pizzaParty.dividePizza();
        pizzaParty.leftoverPizza();
    }
}
