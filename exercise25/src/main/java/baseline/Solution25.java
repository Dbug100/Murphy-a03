package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */


public class Solution25 {
    public static void main(String[] args){
        //take user input string

        /*  get return value from passwordValidator
            if equal 1 print..... if equal 2 print...etc
        */

    }

    private static int passwordValidator(String input){
        // check length of string
        //if less than 8
        //check if String contains letters
        //check if string contains numbers

        // return 0 for very weak
        return 0;
        //return 1 for weak password

        //if greater than or equal to 8
        //check if String contains letters
        //check if String contains numbers
        //check if String contains special characters
        // if contains only letters and numbers
        //return 2 for strong password

        //if greater than or equal to 8
        //check if String contains letters
        //check if String contains numbers
        //check if String contains special characters
        //return 3 for very strong password

        // else
        // return 4 for unknown strength
    }

}
/*
    needs to check for
    A very weak password contains only numbers and is fewer than eight characters.
    A weak password contains only letters and is fewer than eight characters.
    A strong password contains letters and at least one number and is at least eight characters.
    A very strong password contains letters, numbers, and special characters and is at least eight characters.
 If a password does not meet any of these rules, then report it as a password of unknown strength.
 */