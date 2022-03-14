package com.training.designPatterns.FactoryMethodPattern;

abstract class Tasks {
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
