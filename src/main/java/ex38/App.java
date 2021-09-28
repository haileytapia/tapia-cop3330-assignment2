/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex38;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        String numList;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        numList = input.nextLine();

        String[] splitted = numList.split(" ");
        int[] numbers = new int[splitted.length];
        for (int i = 0; i < splitted.length; i++)
            numbers[i] = Integer.parseInt(splitted[i]);

        int[] newArr = filterEvenNumbers(numbers, splitted.length);

        System.out.print("The even numbers are " + Arrays.toString(newArr));

        input.close();
    }

    public static int[] filterEvenNumbers(int arr[], int length)
    {
        int[] newArr = new int[length];
        int k = 0;

        for (int i = 0; i < length; i++)
        {
            if (i % 2 == 1)
            {
                newArr[k] = arr[i];
                k += 1;
            }
        }

        return newArr;
    }
}
