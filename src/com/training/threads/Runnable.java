package com.training.threads;

import static java.lang.Thread.currentThread;

public class Runnable implements java.lang.Runnable {

    public void run() {
        for(int i=1;i<100;i++){
            System.out.println("Child thread loop value is : "+currentThread().getName()+""+i);
        }
    }
}
