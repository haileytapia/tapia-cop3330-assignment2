/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex25;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String password, strength = " ";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        password = input.nextLine();

        switch (passwordValidator(password)) {
            case 2:
                strength = "very weak";
                break;
            case 3:
                strength = "weak";
                break;
            case 5:
                strength = "strong";
                break;
            case 7:
                strength = "very strong";
                break;
        }

        System.out.print("The password '" + password + "' is a " + strength + " password.");

        input.close();
    }

    public static int passwordValidator(String password)
    {
        int strength = 0;

        if (password.length() < 8)
            strength += 1;
        else if (password.length() >= 8)
            strength += 2;

        if (password.matches("(?=.*[0-9]).*") )
            strength += 1;

        if (password.matches("(?=.*[a-z]).*") || password.matches("(?=.*[A-Z]).*"))
            strength += 2;

        if (password.matches("(?=.*[~!@#$%^&*()_-]).*"))
            strength += 2;

        return strength;
    }
}