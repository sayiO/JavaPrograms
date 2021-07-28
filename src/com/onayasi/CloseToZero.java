package com.onayasi;

import java.util.*;

public class CloseToZero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter size of array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            int i = 0;
            if (!(size >=0 && size <= 1000)) {
                System.out.println("size is out of range");
            }

            while (i < size) {

                System.out.println("enter numbers in the array");
                int num = sc.nextInt();
                arr[i] = num;
                i++;
            }

            int minValue = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < minValue && arr[j] >0){
                    minValue = arr[j];
                }

            }
            System.out.println("the value closest to zero in the array is " + minValue);
        }
    }


