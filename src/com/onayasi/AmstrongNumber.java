package com.onayasi;
import java.util.Scanner;
import java.lang.Math;

public class AmstrongNumber {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter `your number to check");
        int num = sc.nextInt();

        int temp, digits=0, last=0, sum=0;
        temp = num;
        while(temp>0){
            temp =temp/10;
            digits++;
        }
        temp = num;


        while(temp>0){
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp/10;

        }
        if(num == sum){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " not an Armstrong number");
        }


    }
}
