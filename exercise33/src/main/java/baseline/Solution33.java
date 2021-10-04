package baseline;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
public class Solution33 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String[] response = {"Yes.", "No.", "Ask Again Later."};
        System.out.print("What's your question?\n> ");
        String question = userIn.nextLine();
        System.out.println();
        //generate random number 0,1, or 2
        int answer = (int) Math.floor(Math.random() * (2 + 1));
        //print item in array at position of generated num
        System.out.print(response[answer]);
    }
}
