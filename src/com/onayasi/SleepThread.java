package com.onayasi;
import java.lang.Thread;

public class SleepThread extends Thread{
    public void run(){
        for(int i=1; i<5;i++){
            try{
            Thread.sleep(500);
            }catch(InterruptedException e){
              System.out.println(e);
           }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        SleepThread t1 = new SleepThread();
        SleepThread t2 =new SleepThread();
        SleepThread t3 =new SleepThread();
        SleepThread t4 =new SleepThread();
        t1.start();
        t1.start();



    }
}
