package com.training.designPatterns.builderPattern;

public class Student {

    private final int id;
    private final Boolean eligible;
    private final String grade;
    private final String subject;

    public Student(Builder builder) {
        this.id =builder.id;
        this.eligible=builder.eligible;
        this.grade=builder.grade;
        this.subject=builder.subject;
    }
    static class Builder{
        private int id;
        private Boolean eligible;
        private String grade;
        private String subject;

        public Student build(){
            return new Student(this);
        }

        public Builder(int id){
            this.id=id;
        }
        public Builder eligible(Boolean eligible){
            this.eligible = eligible;
            return  this;
        }
        public Builder grade(String grade){
            this.grade = grade;
            return  this;
        }
        public Builder subject(String subject){
            this.subject = subject;
            return  this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", eligible=" + eligible +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
