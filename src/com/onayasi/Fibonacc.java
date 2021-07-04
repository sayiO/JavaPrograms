package com.onayasi;
import java.util.Scanner;


public class Fibonacc {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter start number");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        System.out.println("enter number of digits in the sequence");
        int size = in.nextInt();
        for(int i=0; i<size; i++){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;


        }

    }
}
