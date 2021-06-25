package com.onayasi;

public class JavaArrays {
    int arr[];
    static void evenValues(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0){
                System.out.println( arr[i] +" is at even position " + i);
            }
        }
        System.out.println("the number of elements in the array is " + arr.length);

    }

    public static void main(String [] args){
int arr[] = {25,2,23,8,12,4,36,4585, 2000};
evenValues(arr);


    }
}
