/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex34;
import java.util.Scanner;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        String employees[] = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String remove;

        System.out.print("There are 5 employees:\n");
        for (int i = 0; i < 5; i++)
            System.out.println(employees[i]);

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter an employee name to remove: ");
        remove = input.nextLine();

        List<String> list = new ArrayList<String>(Arrays.asList(employees));
        list.remove(remove);
        employees = list.toArray(new String[0]);

        System.out.print("\nThere are 4 employees:\n");
        for (int i = 0; i < 4; i++)
            System.out.println(employees[i]);

        input.close();
    }
}