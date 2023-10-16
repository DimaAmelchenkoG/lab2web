package com.example.lab2web.backend;

import com.example.lab2web.backend.Point;

import java.io.Serializable;
import java.util.ArrayList;

public class PointCollection implements Serializable {
    private ArrayList<Point> pointArrayList= new ArrayList();

    public PointCollection(){}

    public void clear(){
        pointArrayList.clear();
    }
    public Point getPoint(int id){
        return pointArrayList.get(id);
    }

    public Integer getLength(){
        return pointArrayList.size();
    }

    public void addPoint(Point point){
        pointArrayList.add(point);
    }

    @Override
    public String toString() {
        return pointArrayList.toString();
    }

    @Override
    public int hashCode() {
        return Float.hashCode(pointArrayList.hashCode());
    }

    public boolean equals(Object obj) {
        return equals(pointArrayList);
    }


}
