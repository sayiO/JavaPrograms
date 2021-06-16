package com.onayasi;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        if(num%2 >0){
            System.out.println("Your number " + num + " is a prime number");
        }else{
            System.out.println("Your number " + num + " is not a prime number");
        }
    }
}
