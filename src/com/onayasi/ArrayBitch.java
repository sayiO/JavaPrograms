package com.onayasi;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayBitch {
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("onias");
        names.add("Bee");
        names.add("Sauka");
        names.add("Sayi");
        names.add("Masimbira");
        names.set(2, "Yeukai");
        names.set(0, "Nothando");
        names.add("Mashamba");
        names.add("Tinotenda");
        names.add("Lorraine");
        names.add("Audrey");
        names.add("Lynn");
        names.remove(4);
        names.remove(1);
        names.remove(2);
        names.remove(3);
        Collections.sort(names);
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i) + ": at index " + i);
        }

        System.out.println("the arrayList size is: " + names.size());
        System.out.println("The index of " + names.indexOf("Yeukai"));
        System.out.println(names.contains("Lorraine"));

    }
}
