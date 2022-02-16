package com.training.threads;

public class ThreadApplication {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDaemon(true); //This will let the program to run the child thread even after the main thread finish
        printer.start();
        for(int i=1;i<50;i++){
            System.out.println("Main thread loop value is : "+Thread.currentThread().getName()+""+i);
        }
    }
}
