package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        int errors = 0, hR=0, age=0, target ;
        //get user heart rate and age as ints
        while(true) {
            try {
                System.out.print("Enter heart rate:");
                String hRate = userIn.nextLine();
                System.out.print("Enter age:");
                String userAge = userIn.nextLine();
                hR = Integer.parseInt(hRate);
                age = Integer.parseInt(userAge);
                System.out.println("Resting Pulse: " + hR + " Age: " + age);
                errors++;
            }
            catch (NumberFormatException e) {
                //throw exception and ask for input again if not int
                System.out.println("Sorry. Please input a number.");
            }
            if(errors!=0)
                break;
        }
        //print top of table
        System.out.println("Intensity\t | \tRate");
        System.out.println("_____________|____________");
        //for loop i <= 95 -- i + 5
        for(int i = 55; i<=95; i+=5){
            //target heart rate equation
            target = (((220 - age) - hR) * i) + hR;
            //print values as value tab | tab value
            System.out.println(i+"%\t\t\t |"+target +"bpm");
        }
    }
}
