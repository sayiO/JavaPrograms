package com.onayasi;
import java.util.Scanner;
import java.lang.Integer;


public class Palindrome {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number to check");
        int num = in.nextInt();
        String temp = "";
        for(int i=String.valueOf(num).length()-1; i>=0; i-- ){
            temp = temp + String.valueOf(num).charAt(i);
        }
        System.out.println(temp);
        int reversed = Integer.parseInt(temp);
        if(num == reversed){
            System.out.println("The number " + num + " is a palindrome");
        }
        else{
            System.out.println("The number " + num + " is not a palindrome");
        }
    }
}
