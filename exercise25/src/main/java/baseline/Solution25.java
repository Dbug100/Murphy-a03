package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */


import java.util.*;
import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //take user input string
        System.out.print("Enter your password:");
        String pass = userIn.nextLine();

        /*  get return value from passwordValidator
            if equal 1 print..... if equal 2 print...etc
        */
        if(passwordValidator(pass)==0){
            System.out.print("The password '" +pass +"' is a very weak password.");
        }
        else if(passwordValidator(pass)==1){
            System.out.print("The password '" +pass +"' is a weak password.");
        }
        else if(passwordValidator(pass)==2){
            System.out.print("The password '" +pass +"' is a strong password.");
        }
        else if(passwordValidator(pass)==3){
            System.out.print("The password '" +pass +"' is a very strong password.");
        }
        else if(passwordValidator(pass)==4){
            System.out.print("The password '" +pass +"' is an unknown strength.");
        }

    }

    private static int passwordValidator(String pass){
        // check length of string
        //use check case built-in functions to find letters and use hasDigit for numbers
        int len = pass.length();
        boolean lowLet = false;
        boolean upLet = false;
        boolean num = false;
        boolean special = false;
        char c ;
        //if less than 8
        // check if String contains letters
        // check if string contains numbers
        if(len < 8){
            for(int i = 0; i < len; i++){
                c = pass.charAt(i);
                if (Character.isUpperCase(c)) {
                    upLet = true;}
                if (Character.isLowerCase(c)) {
                    lowLet = true;}
                if (Character.isDigit(c)) {
                    num = true;}
            }
            if(num && !upLet && !lowLet){
                return 0;}
            else if(!num && (upLet || lowLet)){
                return 1;}
            else{
                return 4;}
        }
        // return 0 for very weak
        //return 1 for weak password
        // if greater than or equal to 8
        //check if String contains letters
        //check if String contains numbers
        //check if String contains special characters
        //if contains only letters and numbers
        //return 2 for strong password
        Set<Character> specialChar = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
        for(int i = 0; i < len; i++){
            c = pass.charAt(i);
            if (Character.isUpperCase(c)) {
                upLet = true;}
            if (Character.isLowerCase(c)) {
                lowLet = true;}
            if (Character.isDigit(c)) {
                num = true;}
            if(specialChar.contains(c)){
                special=true;}
        }
        //if greater than or equal to 8
        //check if String contains letters
        //check if String contains numbers
        //check if String contains special characters
        //return 3 for very strong password
        if((upLet || lowLet) && num && !special){
            return 2;}
        else if((upLet || lowLet) && num && special){
            return 3;}
        else{
            return 4;}

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