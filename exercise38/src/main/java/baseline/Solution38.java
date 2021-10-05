package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        // ask for list
        System.out.print("Enter a list of numbers, separated by spaces : ");
        String user = userIn.nextLine();

        //call filterEvenNumbers
        //print
        printList(filterEvenNumbers(user));
    }
    private static ArrayList<Integer> filterEvenNumbers(String list){
        //for length of array
        String[] newList = list.split(" ");
        ArrayList<Integer> evens = new ArrayList<>();
        for (String s : newList) {
            //if array[i] % 2 = 0
            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                //add to newList
                evens.add(num);
            }
        }
        //return new list;
        return evens;
    }
    private static void printList(ArrayList<Integer> list){
        System.out.print("The even numbers are: ");
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size()-1)
                System.out.print(list.get(i) +" ");
            else
                System.out.print(list.get(i) +".");
        }
    }
}
