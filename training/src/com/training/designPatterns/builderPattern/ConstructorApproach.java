package com.training.designPatterns.builderPattern;

//constructor overloading
public class ConstructorApproach {
    private  int id;
    private  Boolean eligible;
    private  String grade;
    private  String subject;

    public ConstructorApproach() {
    }

    public ConstructorApproach(int id) {
        this.id = id;
    }

    public ConstructorApproach(int id, Boolean eligible) {
        this.id = id;
        this.eligible = eligible;
    }

    public ConstructorApproach(int id, Boolean eligible, String grade) {
        this.id = id;
        this.eligible = eligible;
        this.grade = grade;
    }

    public ConstructorApproach(int id, Boolean eligible, String grade, String subject) {
        this.id = id;
        this.eligible = eligible;
        this.grade = grade;
        this.subject = subject;
    }
}
