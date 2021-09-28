/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex26;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        double balance, monthlyPay, APR;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        balance = input.nextInt();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextFloat();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPay = input.nextInt();

        PaymentCalculator months = new PaymentCalculator();
        double m = months.calculateMonthsUntilPaidOff(balance, APR, monthlyPay);

        System.out.print("It will take you " + m + " months to pay off this card.\n");

        input.close();
    }
}