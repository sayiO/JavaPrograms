package com.onayasi;
import java.util.Scanner;
import java.lang.Integer;


public class SwapNumbers {
    public static void  main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number two swap");
        int num = in.nextInt();
        System.out.println("number before swapping is " + num);

        //convert the number into a string variable
        String s = String.valueOf(num);
        String str = "";

       for(int i= s.length()-1; i>=0; i--){
           str = str + s.charAt(i);

       }
       int swapped = Integer.parseInt(str);
        System.out.println("the number " + num + " after being swapped is " + swapped);

    }
}
