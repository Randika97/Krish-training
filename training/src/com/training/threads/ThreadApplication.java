package com.training.threads;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class EdurekaLogger {
    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public void sampleLog()
    {
        LOGGER.log(Level.WARNING, "Welcome to Edureka!");
    }
}


public class ThreadApplication {
    public static void main(String[] args) {
        Printer printer = new Printer();
        EdurekaLogger obj = new EdurekaLogger();
        obj.sampleLog();
        LogManager slg = LogManager.getLogManager();
        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.log(Level.WARNING, "Hi! Welcome from Edureka");
        printer.setDaemon(true); //This will let the program to run the child thread even after the main thread finish
        printer.start();
        for(int i=1;i<50;i++){
            System.out.println("Main thread loop value is : "+Thread.currentThread().getName()+""+i);
        }

    }
}
