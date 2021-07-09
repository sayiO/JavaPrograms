package com.onayasi;
import java.util.HashMap;
import java.lang.Integer;

public class hashingMap {
    public static void main(String[]args){
        HashMap<String, Integer> movieRatings = new HashMap<String, Integer>();
        movieRatings.put("rambo", 3);
        movieRatings.put("terminator", 4);
        movieRatings.put("freaks", 3);
        movieRatings.put("forgotten", 4);
        movieRatings.put("law abiding citizen", 5);
        for(String i : movieRatings.keySet()){
            System.out.println("key: " + i +  " value: " + movieRatings.get(i));
        }



    }
}
