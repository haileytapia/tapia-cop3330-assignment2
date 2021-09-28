/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex28;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int total = 0, number;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            total += number;
        }

        System.out.print("The total is " + total + ".");

        input.close();
    }
}