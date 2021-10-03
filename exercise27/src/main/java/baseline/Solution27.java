package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution27 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //ask user for needed inputs
        System.out.print("Enter the first name: ");
        String fName = userIn.nextLine();
        System.out.print("Enter the last name: ");
        String lName = userIn.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zCode = userIn.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = userIn.nextLine();
        errorCheck(zCode,fName, lName, id);
    }

    private static boolean firstName(String name){
        //if input.lenght < 2 false else true
        return name.length() >= 2;
    }

    private static boolean lastName(String name){
        //if input.lenght < 2 false else true
        return name.length() >= 2;
    }

    private static boolean idFormat(String id){
        //use java built in pattern matcher
        String patStr = "AA-1234";
        Pattern pattern = Pattern.compile(patStr);
        // if it matches true if not false
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();

    }

    private static boolean zip(String zCode){
        //if zip length != 5 false else true
        char c = 0;
        for (int i = 0; i < zCode.length(); i++) {
            c = zCode.charAt(i);
            if (Character.isUpperCase(c)) {
                return false;
            }else if(Character.isLowerCase(c)){
                return false;
            }
        }
        return zCode.length() == 5;


    }

    private static void errorCheck(String zipCode, String fName, String lName, String idF){
        boolean fN = firstName(fName);
        boolean lN =lastName(lName);
        boolean id = idFormat(idF);
        boolean zCode = zip(zipCode);
        //if !zip, !firstName, !lastName, !idFormat
        // print no error statement
        if(zCode && fN && lN && id){
            System.out.print("There were no errors found.");
        }
        if(!fN){
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(!lN){
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(!zCode){
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(!id){
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        //if !zip print...
        //if !firstName print...
        //if !lastName print...
        //if !idFormat print...
    }

}
