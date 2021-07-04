package com.onayasi;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File f1 = new File("loveletter.txt");
            Scanner obj = new Scanner(f1);
            while(obj.hasNextLine()){
                String data = obj.nextLine();
                System.out.println(data);
            }
              obj.close();

        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}