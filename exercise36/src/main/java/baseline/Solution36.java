package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        //ask for numbers in a while loop
        while(true) {
            //if entry does not equal done NumberFormatException
            //if not done and is a number add to list
            try {
                System.out.print("Enter a number: ");
                String user = userIn.nextLine();
                //when user enters done exit loop
                if(user.equals("done")){
                    break;
                }
                int num = Integer.parseInt(user);
                numbers.add(num);
            }
            catch(NumberFormatException nfe){
                //ignore input
            }
        }
        //call average
        double avg = average(numbers);
        //call min
        int mini = min(numbers);
        //call max
        int maxi = max(numbers);
        //call printOut(average, min, max, std)
        printOut(numbers, avg, mini, maxi);
    }
    private static double average(ArrayList<Integer> array){
        int sum = 0;
        //for length of list
        for (Integer integer : array) {
            //add each num together
            sum += integer;
        }
        //divide by size
        //return
        return (double)(sum)/array.size();
    }
    private static int min(ArrayList<Integer> array) {
        // int = 0
        int num = array.get(0);
        //for length of array
        for (Integer integer : array) {
            // if int > array[index]
            if (num > integer)
                num = integer;//int = array[index]
        }
        //return
        return num;
    }
    private static int max(ArrayList<Integer> array){
        // int = 0
        int num = 0;
        //for length of array
        for (Integer integer : array) {
            // if int < array[index]
            if (num < integer)
                num = integer;//int = array[index]
        }
        //return
        return num;
    }
    private static double std(ArrayList<Integer> array){
        double avg = average(array);
        double sum = 0;
        // for length of array
        for (Integer integer : array) {
            // sum+= math.pow((array[index]-average),2)
            sum += Math.pow((integer - avg), 2);
        }
        //double stdv = Math.sqrt(sum/array size)
        //return
        return Math.sqrt(sum/array.size());
    }
    private static void printOut(ArrayList<Integer> array, double avg, int minimum, int maximum){
        System.out.print("Numbers: ");
        for(int i = 0; i < array.size();i++){
            System.out.print(array.get(i));
            if(i != array.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        //print avg
        System.out.println("The average is "+avg);
        //print min
        System.out.println("The minimum is "+minimum);
        //print max
        System.out.println("The maximum is "+maximum);
        //print stdv
        System.out.println("The standard deviation is "+String.format("%.2f",std(array)));
    }
}
