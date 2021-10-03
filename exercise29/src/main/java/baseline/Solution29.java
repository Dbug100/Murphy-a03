package baseline;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        int errors = 0;
        //while (1)
        while(true){
            try {
                //ask for return rate
                System.out.print("What is the rate of return? ");
                String user = userIn.nextLine();
                //convert String input to int
                int rate = Integer.parseInt(user);
                // 72/input = r
                int years = 72 / rate;
                //print output
                System.out.print("It will take " + years + " years to double your initial investment.");
                errors++;
                }
                //number exception to stop inputs of letters
                catch(NumberFormatException e)
                {
                    //print error message
                    System.out.println("Sorry. That's not a valid input");
                }
                //arithmetic exception to find input of 0
                catch(ArithmeticException e)
                {
                    //print error message
                    System.out.println("Sorry. That's not a valid input");
                }
                //if no errors found break
                if(errors!=0)
                    break;
        }




    }
}
