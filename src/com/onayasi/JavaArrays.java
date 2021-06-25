package com.onayasi;

public class JavaArrays {
    public int arr[];
    //function to calculate value at position even in the array
    static void evenValues(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(i%2 == 0){
                System.out.println( arr[i] +" is at even position " + i);
            }
        }
        System.out.println("the number of elements in the array is " + arr.length);

    }
    //function to calculate sum of array elements
    static void sumOfElements(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of the array elements is " + sum);
    }
    //print smallest number in an array
    static void min(int arr[]){
        int i, min = arr[0];
        for(i=0; i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }

        }

        System.out.println("the smallest number is " + min);
    }
    //print the largest number in the array
    static void max(int arr[]){
        int i, max = arr[0];
        for(i=0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }

        System.out.println("the smallest number is " + max);
    }
    //sort array in ascending order
    static void asceOrder(int arr[]){
        int i,j, temp = 0;
        for(i=0; i<arr.length;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");

        }


    }
    //sort in descending order
    static void descOrder(int arr[]){
        int i,j, temp = 0;
        for(i=0; i<arr.length;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");

        }


    }


    public static void main(String [] args){
        int arr[] = {10,25, 100,5};
        //sumOfElements(arr);
        //min(arr);
        //max(arr);
        //asceOrder(arr);
        descOrder(arr);

    }
}
