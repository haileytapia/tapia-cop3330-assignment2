/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex37;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App
{
    public static void main(String[] args)
    {
        int minLength, specialChars, num;
        char str[] = {'"', '<', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '>'};
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        minLength = input.nextInt();
        if ((minLength & 1) != 0)
            minLength += 1;

        System.out.print("How many special characters? ");
        specialChars = input.nextInt();

        System.out.print("How many numbers? ");
        num = input.nextInt();

        List<Character> charList = new ArrayList<Character>();
        List<Character> specCharList = new ArrayList<Character>();
        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; i < minLength / 2; i++)
        {
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            charList.add(c);
        }

        for (int j = 0; j < specialChars; j++)
        {
            int randomSpecChar = ThreadLocalRandom.current().nextInt(0, 12);
            specCharList.add(str[randomSpecChar]);
        }

        for (int k = 0; k < num; k++)
        {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 12);
            intList.add(randomNum);
        }

        System.out.print("Your password is ");

        charList.forEach(System.out::print);
        specCharList.forEach(System.out::print);
        intList.forEach(System.out::print);

        input.close();
    }
}