package com.training.threads;


public class Printer extends Thread{

    //This will not create a thread and already violated a OOP concept here.
   @Override
    public void start(){
        super.start(); //If you call even with super keyword to access the parent class start method this will still create a thread based on the requirements
        System.out.println("This is start ");
    }
    //When you overload the run method it will run the method with no arg method
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Child thread loop value is : "+currentThread().getName()+""+i);
        }

    }
    public void run(int x){
        for(int i=1;i<100;i++){
            System.out.println("Child thread loop value is : "+currentThread().getName()+""+i);
        }

    }
}
