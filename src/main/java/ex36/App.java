/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex36;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App
{
    public static void main(String[] args)
    {
        int enteredMil[] = new int[100];
        int enteredNum;
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.print("Enter a number: ");
        enteredNum = input.nextInt();

        while (enteredNum.equals("done") == false)
        {
            enteredMil[i] = enteredNum;
            i += 1;
            System.out.print("Enter a number: ");
            enteredNum = input.nextInt();
        }

        System.out.println("Numbers: ");
        for (int j = 0; j < i; j++)
            System.out.println(enteredMil[i] + ",");

        int randomNum = ThreadLocalRandom.current().nextInt(0, i);

        input.close();
    }
}