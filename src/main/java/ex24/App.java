/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        String first, second;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        first = input.nextLine();

        System.out.print("Enter the second string: ");
        second = input.nextLine();

        if (isAnagram(first, second))
            System.out.print("\"" + first + "\"" + " and + \"" + second + "\"" + " are anagrams.");
        else
            System.out.print("\"" + first + "\"" + " and + \"" + second + "\"" + " are not anagrams.");

        input.close();
    }

    public static boolean isAnagram(String first, String second)
    {
        if (first.length() != second.length())
            return false;
        else
        {
            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = first.toLowerCase().toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            return Arrays.equals(firstArray, secondArray);
        }
    }
}