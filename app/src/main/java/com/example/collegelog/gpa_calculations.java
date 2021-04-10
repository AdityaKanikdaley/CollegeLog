package com.example.collegelog;

import android.widget.Switch;

public class gpa_calculations {
    public int value;
    public int credit;
    public void putGradeValue(String x) {
        switch (x) {
            case "S":
                value=10;
                break;
            case "A":
                value=9;
                break;
            case "B":
                value=8;
                break;
            case "C":
                value=7;
                break;
            case "D":
                value=6;
                break;
            case "E":
                value=5;
                break;
            case "F":
                value=4;
                break;
            case "GRADE":
                value=0;
                break;
            default:
        }
    }
    public int getGradeValue() {
        return value;
    }
    public void putCreditValue(String x) {
        switch (x) {
            case "1":
                credit=1;
                break;
            case "2":
                credit=2;
                break;
            case "3":
                credit=3;
                break;
            case "4":
                credit=4;
                break;
            case "CREDIT":
                credit=0;
                break;
            default:
        }
    }
    public int getCreditValue() {
        return credit;
    }
}
