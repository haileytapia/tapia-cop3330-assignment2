/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex33;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App
{
    public static void main(String[] args)
    {
        String name[] = new String[100];
        String enteredName;
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.print("Enter a name: ");
        enteredName = input.nextLine();

        while (enteredName.isEmpty() != true)
        {
            name[i] = enteredName;
            i += 1;
            System.out.print("Enter a name: ");
            enteredName = input.nextLine();
        }

        int randomNum = ThreadLocalRandom.current().nextInt(0, i);

        System.out.println("The winner is... " + name[randomNum] + ".");

        input.close();
    }
}