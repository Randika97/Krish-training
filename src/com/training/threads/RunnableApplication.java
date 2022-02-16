package com.training.threads;

public class RunnableApplication {
    public static void main(String[] args) {

        Runnable runnable = new Runnable();
        Thread thread=new Thread(runnable);
        thread.start();
        for(int i=1;i<50;i++){
            System.out.println("Main thread loop value is : "+Thread.currentThread().getName()+""+i);
        }
    }
}
