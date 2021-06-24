package com.onayasi;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
       String original, reverse="";
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your string or number");
        original = sc.nextLine();
        int length = original.length();

        for(int i = length-1;i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(original + " ia a palindrome ");
        }
        else{
            System.out.println(original + "  is not a palindromme");

        }
    }
}


