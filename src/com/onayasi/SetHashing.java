package com.onayasi;
import java.util.HashSet;
import java.lang.Integer;

public class SetHashing {
    public static void main(String[]args){
        HashSet <Integer> nums = new HashSet<Integer>();
        nums.add(45);
        nums.add(50);
        nums.add(8);
        nums.add(5);
        nums.add(4);
        nums.add(69);
        nums.add(7);
        nums.add(100);
        System.out.println(nums);
        for(int i=0; i<=10; i++){
            if(nums.contains(i)){
                System.out.println("the hashSet contains the element " + i);
            }
            else{
                System.out.println("the element " + i + " was not found in the hashSet");
            }
        }

    }
}
