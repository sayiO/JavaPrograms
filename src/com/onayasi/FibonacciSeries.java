package com.onayasi;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("enter your start number");
        int num = sc.nextInt();*/
        System.out.println("enter number of count in the series");
        int count = sc.nextInt();

        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }


    }
}
