/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex27;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String first, last, ZIP, ID;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        first = input.nextLine();

        System.out.print("Enter the last name: ");
        last = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        ZIP = input.nextLine();

        System.out.print("Enter the employee ID: ");
        ID = input.nextLine();

        if (first.length() < 2)
            System.out.println("Enter the employee ID: ");

        validateInput(first, last, ZIP, ID);

        input.close();
    }

    int validateFirst(String first)
    {
        if (first.length() >= 2)
            return 1;
        else
            return 0;
    }

    int validateLast(String last)
    {
        if (last.length() >= 2)
            return 1;
        else
            return 0;
    }

    int validateZIP(String ZIP)
    {
        if (ZIP.contains("[0-9]+"))
            return 1;
        else
            return 0;
    }

    int validateID(String ID)
    {
        if (ID.length() != 7)
            return 0;

        if (Character.isLetter(ID.charAt(0)) == false)
            return 0;
        if (Character.isLetter(ID.charAt(1)) == false)
            return 0;
        if (ID.charAt(2) != '-')
            return 0;
        if (Character.isDigit(ID.charAt(3)) == false)
            return 0;
        if (Character.isDigit(ID.charAt(4)) == false)
            return 0;
        if (Character.isDigit(ID.charAt(5)) == false)
            return 0;
        if (Character.isDigit(ID.charAt(6)) == false)
            return 0;

        return 1;
    }

    public void validateInput(String first, String last, String ZIP, String ID)
    {
        String output = null;

        int valFirst = validateFirst(first);
        if (valFirst == 0)
            output = "The first name must be at least 2 characters long.\n";

        int valLast = validateLast(last);
        if (valLast == 0)
            output = "output" + "The last name must be at least 2 characters long.\n";

        int valZIP = validateZIP(ZIP);
        if (valZIP == 0)
            output = "output" + "The first name must be at least 2 characters long.\n";

        int valID = validateID(ID);
        if (valID == 0)
            output = "output" + "The first name must be at least 2 characters long.\n";

        System.out.print(output);
        return;
    }
}