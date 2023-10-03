package com.example.lab2web.backend;

import java.time.LocalTime;

public class Point {
    private String x;
    private String y;
    private String r;


    private String target;
    private LocalTime date;
    private String  time;

    public Point() {
    }



    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                ", name='" + x + '\'' +
                ", serial=" + y +
                '}';
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
