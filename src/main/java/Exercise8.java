/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */

import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise8 {
    public static void main(String[] args) {

        System.out.println("How many people? ");
        Scanner input = new Scanner(in);
        String numPpl = input.nextLine();

        System.out.println("How many pizzas do you have? ");
        Scanner input2 = new Scanner(in);
        String numPizza = input2.nextLine();

        System.out.println("How many slices per pizza? ");
        Scanner input3 = new Scanner(in);
        String numSlices = input3.nextLine();

        try
        {

            int x = Integer.parseInt(numPpl);
            int y = Integer.parseInt(numPizza);
            int z = Integer.parseInt(numSlices);
            int slices = y * z;
            int spp = slices / x;

            if(x >= 0 && y >= 0 && z > 0)
            {
                System.out.println(numPpl + " people with " + numPizza + " pizzas " + "(" + (y * z) + " slices)");
                System.out.println("Each person gets " + spp + " pieces of pizza.");
                System.out.println("There are " + (slices % x) + " leftover pieces.");
            }
            if(z == 0 && y > 0)
            {
                System.out.println("You cannot have zero slices. Try again.");
            }
            else
            {
                System.out.println("Please enter a positive number.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Please enter a number.");
        }
    }
}