package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //initialize array
        ArrayList<String> names = new ArrayList<String>();
        //while loop
        while (true){
            //ask to enter name
            System.out.print("Enter a name: ");
            String nameIn = userIn.nextLine();
            //accept name until blank entry
            if(nameIn.isBlank() && nameIn.isEmpty())
                break; //exit loop at blank entry
            else
                names.add(nameIn);
            }

        //generate random number between 0 and length of array
        int len = names.size();
        int index = (int) Math.floor(Math.random() * (len + 1));
        //print name at that index
        System.out.print("The winner is... "+ names.get(index));
        }
    }
