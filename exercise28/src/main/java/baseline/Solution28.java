package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //varaible to hold total
        int sum = 0;
        //for loop that runs 5 times
        for(int i = 0; i<5; i++){
            //print to ask for number
            System.out.print("Enter a number: ");
            int user = userIn.nextInt();
            //add numbers
            sum += user;
        }
        //print total
        System.out.print("The total is "+sum);
    }
}
