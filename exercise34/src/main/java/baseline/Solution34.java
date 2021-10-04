package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.Scanner;
public class Solution34 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //make list of employees
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] newList = new String[4];
        int j = 0;
        //call to print list
        printList(employees);
        //ask for name of employee
        System.out.print("Enter an employee name to remove: ");
        String remove = userIn.nextLine();
        /*
            loop through array if
            you reach name of employee
            skip it every other name goes in new array
         */
        for(int i = 0; i < employees.length; i++){
            if(remove.equals(employees[i])){
                //do nothing
            }else{
                newList[j] = employees[i];
                j++;}
        }
        //call to printList
        printList(newList);
    }
    private static void printList(String[] names){
        //find length of array
        int len = names.length;
        //print number of employees
        System.out.println("There are "+len +" employees:");
        //loop through and print out each name in array
        for(int i = 0; i < len; i++){
            System.out.println(names[i]);
        }
    }
}
