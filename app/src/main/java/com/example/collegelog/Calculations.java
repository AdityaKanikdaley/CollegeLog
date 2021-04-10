package com.example.collegelog;

public class Calculations {

    String weekday,time;
    public void putTimetableValue(String x) {
        switch (x) {
            case "A11":
                weekday="MONDAY";
                time="8:30-10:00";
                break;
            case "A12":
                weekday="WEDNESDAY";
                time="8:30-10:00";
                break;
            case "A13":
                weekday="FRIDAY";
                time="8:30-10:00";
                break;
            case "B11":
                weekday="MONDAY";
                time="10:05-11:35";
                break;
            case "B12":
                weekday="WEDNESDAY";
                time="10:05-11:35";
                break;
            case "B13":
                weekday="FRIDAY";
                time="10:05-11:35";
                break;
            case "C11":
                weekday="MONDAY";
                time="11:40-13:10";
                break;
            case "C12":
                weekday="WEDNESDAY";
                time="11:40-13:10";
                break;
            case "C13":
                weekday="FRIDAY";
                time="11:40-13:10";
                break;
            case "D11":
                weekday="TUESDAY";
                time="8:30-10:00";
                break;
            case "D12":
                weekday="THURSDAY";
                time="8:30-10:00";
                break;
            case "D13":
                weekday="FRIDAY";
                time="14:50-16:20";
                break;
            case "E11":
                weekday="TUESDAY";
                time="10:05-11:35";;
                break;
            case "E12":
                weekday="THURSDAY";
                time="10:05-11:35";;
                break;
            case "E13":
                weekday="MONDAY";
                time="14:50-16:20";
                break;
            case "F11":
                weekday="TUESDAY";
                time="11:40-13:10";
                break;
            case "F12":
                weekday="THURSDAY";
                time="11:40-13:10";
                break;
            case "F13":
                weekday="WEDNESDAY";
                time="14:50-16:20";
                break;
            case "A21":
                weekday="MONDAY";
                time="13:15-14:45";
                break;
            case "A22":
                weekday="WEDNESDAY";
                time="13:15-14:45";
                break;
            case "A23":
                weekday="FRIDAY";
                time="13:15-14:45";
                break;
            case "B21":
                weekday="MONDAY";
                time="16:25-17:55";
                break;
            case "B22":
                weekday="WEDNESDAY";
                time="16:25-17:55";
                break;
            case "B23":
                weekday="THURSDAY";
                time="14:50-16:20";
                break;
            case "C21":
                weekday="MONDAY";
                time="18:00-19:30";
                break;
            case "C22":
                weekday="WEDNESDAY";
                time="18:00-19:30";
                break;
            case "C23":
                weekday="TUESDAY";
                time="14:50-16:20";
                break;
            case "D21":
                weekday="TUESDAY";
                time="13:15-14:45";
                break;
            case "D22":
                weekday="THURSDAY";
                time="13:15-14:45";
                break;
            case "D23":
                weekday="FRIDAY";
                time="18:00-19:30";
                break;
            case "E21":
                weekday="TUESDAY";
                time="16:25-17:55";
                break;
            case "E22":
                weekday="THURSDAY";
                time="16:25-17:55";
                break;
            case "E23":
                weekday="FRIDAY";
                time="16:25-17:55";
                break;
            case "F21":
                weekday="TUESDAY";
                time="18:00-19:30";
                break;
            case "F22":
                weekday="THURSDAY";
                time="18:00-19:30";
                break;
            case "SLOTS":
                weekday="";
                time="";
                break;
            default:
        }
    }
    public String getWeekday() {
        return weekday;
    }
    public String getTime() {
        return time;
    }
}