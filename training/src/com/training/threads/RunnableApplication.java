package com.training.threads;


import java.sql.Date;

public class RunnableApplication {
    public static void main(String[] args) {
        Runnable runnable = new Runnable();
        Thread thread=new Thread(runnable);
        thread.setPriority(10);
        System.out.println("Main thread Priority"+Thread.currentThread().getPriority());
        System.out.println("Child thread Priority"+thread.getPriority());
        thread.start();
        for(int i=1;i<50;i++){
            System.out.println("Main thread loop value is : "+Thread.currentThread().getName()+""+i);
        }
    }
}
