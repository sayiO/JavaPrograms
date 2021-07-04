package com.onayasi;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Miscelleneous {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name, age and salary");
        String name  = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();

        System.out.println("Your name is " + name + " and your age is " + age + " with a salary of " + salary);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Today's date and time  is " + dt);


        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("TOYOTA");
        cars.add("PORSCHE");
        cars.add("MERCEDES");
        cars.set(1, "Range Rover" );

        for(int i=0; i<cars.size(); i++){
            System.out.println("car at index " + i + " is " + cars.get(i));
        }

        HashMap<String, String> capital = new HashMap<String, String>();
        capital.put("Zimbabwe", "Harare");
        capital.put("South Africa", "Pretoria");
        capital.put("Nigeria", "Lagos");
        capital.put("Zambia", "Lusaka");
        System.out.println(capital);
        System.out.println("the capital of Zimbabwe is: " + capital.get("Zimbabwe"));


    }
}
