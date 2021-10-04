package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
public class Solution37 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //get user input
        System.out.print("What's the minimum length? ");
        String len = userIn.nextLine();
        int length = Integer.parseInt(len);
        System.out.print("How many special characters? ");
        String spec = userIn.nextLine();
        int special = Integer.parseInt(spec);
        System.out.print("How many numbers? ");
        String numb = userIn.nextLine();
        int num = Integer.parseInt(numb);
        //call makePassword
        makePassword(length, special, num);
    }
    private static void makePassword(int length, int special, int numNum){
        //make list of letters, list of specials, and list of nums
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbs = "1234567890";
        String spec = "!@#$%^&*?><.";
        //make array to store password
        ArrayList<Character> passLets = new ArrayList<>();
        //use rand nums to pick random specials and store in array
        int specLen = spec.length();
        int numLen = numbs.length();
        int ran = (int) Math.floor(Math.random() * (specLen + 1));
        for(int i = 0; i < special; i++){
            passLets.add(spec.charAt(ran));
            ran = (int) Math.floor(Math.random() * (specLen + 1));
        }
        //repeat for numbers
        for(int i = 0; i < numNum; i++){
            passLets.add(numbs.charAt(ran));
            ran = (int) Math.floor(Math.random() * (numLen + 1));
        }
        //fill rest of array with letters
        for(int i = special+numNum; i < length; i++){
            passLets.add(alpha.charAt(ran));
            ran = (int) Math.floor(Math.random() * (numLen + 1));
        }
        // java shuffle method
        Collections.shuffle(passLets);
        //print password
        String pass = "";
        for(Character c : passLets){
            pass+=Character.toString(c);
        }
        System.out.print("Your password is "+ pass);
    }
}
