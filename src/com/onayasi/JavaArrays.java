package com.onayasi;
import java.util.Scanner;

public class JavaArrays {


    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String st1 = sc.nextLine();
        String reverse = "";
        for(int i = st1.length() -1; i>=0; i--){
            reverse = reverse + st1.charAt(i);
        }
        System.out.println("string before reversal is " + st1);
        System.out.println("reversed string is " + reverse);


    }
}
