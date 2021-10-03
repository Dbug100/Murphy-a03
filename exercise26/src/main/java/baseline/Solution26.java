package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.Scanner;

public class Solution26 {
    static Double apr;
    static Double balance;
    static Double payment;
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        //ask user for needed values for calculation
        System.out.print("What is your balance? ");
        balance = userIn.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = userIn.nextDouble();
        apr = apr / 100;

        PaymentCalculator calc = new PaymentCalculator();
        System.out.print("What is the monthly payment you can make? ");
        payment = userIn.nextDouble();

        int months = calc.calculateMonthsUntilPaidOff();
        System.out.print("It will take you "+months+" to pay off this card.");

    }
}
