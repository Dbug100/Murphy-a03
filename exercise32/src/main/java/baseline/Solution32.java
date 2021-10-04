package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int secretNumber, guesses = 0;
        // ask for difficulty
        while (true) {

                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                int level = userIn.nextInt();
                //if difficulty 1-3 generate number for difficulty
                if (level == 1)
                    secretNumber = (int) (Math.random() * 10 + 1);
                else if (level == 2)
                    secretNumber = (int) (Math.random() * 100 + 1);
                else
                    secretNumber = (int) (Math.random() * 1000 + 1);
                //ask for guess
                System.out.print("I have my number. What's your guess?: ");
                try {
                    int guess = userIn.nextInt();
                guesses++;
                //while user has not guessed correctly
                while (guess != secretNumber) {
                    //if < number print too low
                    if (guess < secretNumber) {
                        System.out.print("Too low. Guess again: ");
                        guess = userIn.nextInt();
                    }
                    //if > number print too high
                    if (guess < secretNumber) {
                        System.out.print("Too high. Guess again: ");
                        guess = userIn.nextInt();
                    }
                    guesses++;
                }
            }
            catch (InputMismatchException nfe){
                System.out.print("Non numerical input. Guess again: ");
            }
            //out of while print congrats
            System.out.println("You got it in "+guesses +" guesses!");
            //ask to play again reset values
            System.out.print("Do you wish to play again (Y/N)? ");
            char again = userIn.next().charAt(0);

            if(again == 'n' || again == 'N')
                break;
        }
    }
}
