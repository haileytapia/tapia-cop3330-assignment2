/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex39;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App
{
    public static void main(String[] args)
    {
        String[] first = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        String[] last = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String[] position = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
        String[] separation = {"2016-12-31", "	2016-10-05", "	2015-12-19", " ", " ", "2015-12-18"};

        System.out.print("Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n");

        String[] newArr = new String[6];
        for (int i = 0; i < 6; i++)
            newArr[i] = last[i];

        Arrays.sort(last);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                if (newArr[i] == last[j])
                    System.out.print(first[j] + " " + newArr[i] + "\t\t" + position[j] + "\t\t" + separation[j] + "\n");
        }
    }
}