package com.training.designPatterns.builderPattern;


//Telescopic Constructor approach
public class StudentTelescopic {
    private final int id;
    private Boolean eligible;
    private String grade;
    private String subject;


    public StudentTelescopic(int id) {
        this.id = id;
    }

    public StudentTelescopic(int id, Boolean eligible) {
        this(id);
        this.eligible = eligible;
    }

    public StudentTelescopic(int id, Boolean eligible, String grade) {
        this(id,eligible);
        this.grade = grade;
    }

    public StudentTelescopic(int id, Boolean eligible, String grade, String subject) {
        this(id,eligible,grade);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "StudentTelescopic{" +
                "id=" + id +
                ", eligible=" + eligible +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
