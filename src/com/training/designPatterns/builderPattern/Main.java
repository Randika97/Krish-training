package com.training.designPatterns.builderPattern;

public class Main {

    public static void main(String[] args) {
        //telescopic setting
        StudentTelescopic carTelescopic1 = new StudentTelescopic(1);
        System.out.println(carTelescopic1);
        //using builder pattern
        Student.Builder builder = new Student.Builder(1);
        Student student = builder.eligible(true).grade("Graduated").build();
        System.out.println(student);
    }
}
