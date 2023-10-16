package com.example.lab2web.backend;

public class CheckValue {

    public boolean ckeck(String xStr, String yStr, String rStr){
        float x = Float.parseFloat(xStr);
        float y = Float.parseFloat(yStr.replace(",", "."));
        float r = Float.parseFloat(rStr);

        System.out.println(x + " " + y + " " + r);
        return (checkX(x) & checkY(y) & checkR(r));
    }

    private static boolean checkX(float x){
        if (x >= -8.3 & x <= 8.3){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkY(float y){
        if (y > -8.3 & y < 8.3){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkR(float r){
        if (r >= 1 & r <= 5){
            return true;
        } else {
            return false;
        }
    }

}
