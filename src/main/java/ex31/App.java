/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex31;
import java.util.Scanner;
import java.lang.Math;

public class App
{
    public static void main(String[] args)
    {
        int age, RHR;
        float THR;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        while (!input.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.\nEnter your age: ");
            age = input.nextInt();
        }

        System.out.print("Enter your resting heart rate: ");
        RHR = input.nextInt();

        while (!input.hasNextInt())
        {
            System.out.println("Invalid input. Please enter a number.\nEnter your resting heart rate: ");
            RHR = input.nextInt();
        }

        System.out.print("\nResting Pulse: " + RHR + "\t\tAge: " + age + "\n\nIntensity \t | Rate  \n-------------|--------\n");

        for (float i = 55; i < 100; i = i + 5)
        {
            float intensity = i / 100;
            THR = (((220 - age) - RHR) * intensity) + RHR;
            System.out.println(+ Math.round(i) + "%\t\t\t | " + Math.round(THR) + " bpm ");
        }

        input.close();
    }
}