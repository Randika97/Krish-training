package com.training.designPatterns.FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Application {
    public static void main(String[] args) throws IOException {
    GetScaleFactory scaleFactory = new GetScaleFactory();
        System.out.println( "Enter the scale of the bill :");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String Scale = bufferedReader.readLine();
        System.out.println("Enter the units of the bill : ");
        int units = Integer.parseInt(bufferedReader.readLine());
        //Identify  the scale
        Tasks tasks = scaleFactory.getScale(Scale);
        System.out.println("Bill value for the "+Scale+" of "+units+" unit is :");
        //Based on the scale get the concrete class object and set the rates
        tasks.getRate();
        //Calculate the bill using give rates and units
        tasks.calculateBill(units);

    }
}
