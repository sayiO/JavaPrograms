package com.onayasi;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to reverse");
        String s1 = sc.nextLine();
        String s2 = "";

        for(int i = s1.length()-1; i>=0; i--){
            s2 += s1.charAt(i);


        }
        System.out.println("reversed string is " + s2);
    }

}
