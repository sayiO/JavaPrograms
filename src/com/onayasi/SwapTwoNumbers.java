package com.onayasi;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[]args){
        //getting the two numbers from the user

        Scanner in = new Scanner(System.in);
        int x,y;
        System.out.println("enter first number");
         x = in.nextInt();
        System.out.println("enter second number");
         y = in.nextInt();
        System.out.println("First number is " + x + " and second number is " + y + " before swapping");
         x= x+y;
         y = x-y;
         x= x-y;

        System.out.println("First number is " + x + " and second number is " + y + " after swapping");








    }
}
