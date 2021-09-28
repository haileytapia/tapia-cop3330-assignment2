/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Hailey Tapia
 */

package ex32;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int difficulty, guess, numGuesses;
        char play = 'y';
        Scanner input = new Scanner(System.in);

        System.out.print("Let's play Guess the Number!\n\n");

        while (play == 'y')
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty = input.nextInt();

            while (!input.hasNextInt())
            {
                System.out.println("Sorry. That's not a valid input.\nEnter the difficulty level (1, 2, or 3): ");
                difficulty = input.nextInt();
            }

            if (difficulty == 1)
            {
                numGuesses = 0;
                int random_int = (int)Math.floor(Math.random()*(10-1+1)+1);

                System.out.println("I have my number. What's your guess? ");
                guess = input.nextInt();
                numGuesses += 1;

                while (!input.hasNextInt())
                {
                    System.out.println("Sorry. That's not a valid input.\nWhat's your guess? ");
                    guess = input.nextInt();
                }

                while (guess != random_int)
                {
                    if (guess < random_int)
                    {
                        System.out.println("Too low. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                    else if (guess > random_int)
                    {
                        System.out.println("Too high. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                }

                System.out.println("You got it in " + numGuesses + " guesses!\n");
            }
            else if (difficulty == 2)
            {
                numGuesses = 0;
                int random_int = (int)Math.floor(Math.random()*(100-1+1)+1);

                System.out.println("I have my number. What's your guess? ");
                guess = input.nextInt();
                numGuesses += 1;

                while (!input.hasNextInt())
                {
                    System.out.println("Sorry. That's not a valid input.\nWhat's your guess? ");
                    guess = input.nextInt();
                }

                while (guess != random_int)
                {
                    if (guess < random_int)
                    {
                        System.out.println("Too low. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                    else if (guess > random_int)
                    {
                        System.out.println("Too high. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                }

                System.out.println("You got it in " + numGuesses + " guesses!\n");
            }
            else if (difficulty == 3)
            {
                numGuesses = 0;
                int random_int = (int)Math.floor(Math.random()*(1000-1+1)+1);

                System.out.println("I have my number. What's your guess? ");
                guess = input.nextInt();
                numGuesses += 1;

                while (!input.hasNextInt())
                {
                    System.out.println("Sorry. That's not a valid input.\nWhat's your guess? ");
                    guess = input.nextInt();
                }

                while (guess != random_int)
                {
                    if (guess < random_int)
                    {
                        System.out.println("Too low. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                    else if (guess > random_int)
                    {
                        System.out.println("Too high. Guess again: ");
                        guess = input.nextInt();
                        numGuesses += 1;
                    }
                }

                System.out.println("You got it in " + numGuesses + " guesses!\n");
            }

            System.out.println("Do you wish to play again (Y/N)? ");
            play = input.next().charAt(0);
        }

        input.close();
    }
}