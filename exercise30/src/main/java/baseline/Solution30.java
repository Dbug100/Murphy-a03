package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */
public class Solution30 {
    public static void main(String[] args){
        //nested for loop both 1 <= 12
        for(int i = 1; i <= 12;i++){
            for(int j = 1; j <= 12; j++){
                //print loop 1 * loop 2
                System.out.print((i*j)+"\t");
            }
            //print new line after first loop
            System.out.print("\n");
        }
    }
}
