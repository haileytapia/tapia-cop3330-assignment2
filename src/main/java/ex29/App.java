/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex29;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int ROR;
        Scanner input = new Scanner(System.in);

        System.out.print("What is the rate of return? ");
        ROR = input.nextInt();

        if (!input.hasNextInt() || ROR == 0)
        {
            System.out.println("Sorry. That's not a valid input.\nWhat is the rate of return? ");
            ROR = input.nextInt();
        }

        System.out.print("It will take " + (72 / ROR) + " years to double your initial investment.");

        input.close();
    }
}