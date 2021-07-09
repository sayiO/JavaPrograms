package com.onayasi;
import java.util.Iterator;
import java.util.HashSet;

public class IterateMore {
    public static void main(String[]args){
        //create a hashSEt
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(23);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);

        //create an iterator
        System.out.println(numbers);
        Iterator<Integer> nums = numbers.iterator();
        while(nums.hasNext()){
            Integer i = nums.next();
            if(i <= 20){
                nums.remove();
            }else{
                System.out.println(i +  " is more than 20");
            }

        }
        System.out.println(numbers);



    }
}
