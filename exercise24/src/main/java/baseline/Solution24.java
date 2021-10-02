package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Deaja Murphy
 */

import java.util.Scanner;
public class Solution24 {
    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \nEnter the first string: ");
        String word1 = userIn.nextLine();
        System.out.print("Enter the second string: ");
        String word2 = userIn.nextLine();

        boolean anagram = checkAnagram(word1, word2);

        if(anagram){
            System.out.print("\""+word1+"\" and \""+word2 +"\" are anagrams" );
        }
        else{
            System.out.print("\""+word1+"\" and \""+word2 +"\" are not anagrams" );
        }
    }

    static boolean checkAnagram(String word1, String word2) {
        boolean isAnagram = true;
        if (word1.length() != word2.length()) {
            isAnagram = false;
            return isAnagram;
        }

        word1 = makeLowCase(word1);
        word2 = makeLowCase(word2);
        word1 = String.valueOf(sort(word1));
        word2 = String.valueOf(sort(word2));
        isAnagram = word1.equals(word2);
        return isAnagram;
    }
    public static String makeLowCase(String word) {
        char c = 0;
        int len = word.length();
        StringBuffer strBuffer = new StringBuffer(len);

        for (int i = 0; i < len; i++) {
            c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                strBuffer.append(c);
            }
        }
        return strBuffer.toString();
    }

    public static char sort(String word){
        char arr[] = word.toCharArray();
        char temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return temp;
    }
}


/*
    An anagram is a word or phrase that is formed by
    rearranging the letters of another word or phrase

    words or phrases must be same length
    check to see if they contain the same letters
    must be same case --- sort letters instead of looping through both
    check if equal
 */