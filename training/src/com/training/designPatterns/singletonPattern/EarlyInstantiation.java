package com.training.designPatterns.singletonPattern;

public class EarlyInstantiation {
        //create an object of SingleObject
        private static EarlyInstantiation instance = new EarlyInstantiation();

        //make the constructor private so that this class cannot be
        //instantiated
        private EarlyInstantiation(){}

        //Get the only object available
        public static EarlyInstantiation getInstance(){
            return instance;
        }

        public void showMessage(){
            System.out.println("Hello World!");
        }
}

