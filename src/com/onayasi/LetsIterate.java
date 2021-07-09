package com.onayasi;
import java.util.Iterator;
import java.util.ArrayList;

public class LetsIterate {
    public static void main(String[]args){
        //create and arraylist
        ArrayList<String> gfs = new ArrayList<String>();
        gfs.add("Yeukai");
        gfs.add("Lorraine");
        gfs.add("Tsitsi");
        gfs.add("Lisah");
        gfs.add("Patie");
        gfs.add("Tinevimbo");
        gfs.add("Rachie");
        gfs.add("Audrey");
        gfs.add("Simbisanai");
        gfs.add("Sinikiwe");
        gfs.add("Tinoe");
        gfs.add("Mutare");
        gfs.add("Vimbai");
        gfs.add("form4");
        gfs.add("rutendoe");
        System.out.println(gfs);

        //create an iterator

        Iterator<String> values = gfs.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        System.out.println("The size of the hashSet is " + gfs.size());


    }
}
