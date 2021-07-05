package com.onayasi;
import java.lang.Thread;

public class JavaThreading extends Thread{
    public void run(){
        System.out.println("thread is running.........!!!");
    }
    public static void main (String[] args){
        JavaThreading t1 = new JavaThreading();
        t1.start();

    }
}
