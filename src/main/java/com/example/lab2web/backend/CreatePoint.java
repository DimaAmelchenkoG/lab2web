package com.example.lab2web.backend;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CreatePoint {
    public Point create(String x, String y, String r){
        Point point = new Point();
        CheckPoint checkPoint = new CheckPoint();
        point.setX(x);
        point.setY(y.replace(",", "."));
        point.setR(r);
        point.setTarget(checkPoint.checkAll(point));
        point.setDate(LocalTime.now().withNano(0));
        return point;
    }


}
