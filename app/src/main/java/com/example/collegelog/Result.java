package com.example.collegelog;

public class Result {
    private int sno;
    private String Subject;
    private String Grade;

    public Result(int sno, String subject, String grade) {
        this.sno = sno;
        this.Subject = subject;
        this.Grade = grade;
    }

    @Override
    public String toString() {
        return "database{" +
                "sno=" + sno +
                ", Subject='" + Subject + '\'' +
                ", Grade='" + Grade + '\'' +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}

