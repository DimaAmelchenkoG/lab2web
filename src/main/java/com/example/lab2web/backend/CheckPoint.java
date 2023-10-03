package com.example.lab2web.backend;

public class CheckPoint {
    public String check(Point point){
        if (Integer.parseInt(point.getX()) >= 0){
            return "Попадание";
        }
        else {
            return "Нет попадания";
        }
    }

    public String checkAll(Point point){
        Float x = Float.valueOf(point.getX());
        Float y =  Float.valueOf(point.getY());
        System.out.println(point.getR());
        Float r = Float.valueOf(point.getR());;
        if  (checkSquare(x, y, r) | checkTriangle(x, y, r) | checkCircle(x, y, r)){
            return "Hit";
        }
        else {
            return "No hit";
        }
    }

    private boolean checkSquare(Float x, Float y, Float r){
        return (x >= 0 & x <= r) & (y >= 0 & y <= r);
    }

    private boolean checkTriangle(Float x, Float y, Float r){
        return (x >= 0 & y <= 0) & ((x*x + y*y) <= r*r);
    }

    private boolean checkCircle(Float x, Float y, Float r){
        return (x <= 0 & y >= 0) & ((x*x + y*y) <= (r*r)/4);
    }

    /**
     * function checkSquare($x, $y, $r): bool{
     *     return ($x>=0 and $x<=$r) and ($y>=0 and $y<=$r);
     * }
     *
     * function checkTri($x, $y, $r): bool{
     *     return $x>=0 and $y<=0 and ($x*$x + $y*$y <= $r*$r);
     * }
     *
     *
     * function checkCir($x, $y, $r): bool{
     *     return $x<=0 and $y>=0 and ($x*$x + $y*$y <= ($r*$r)/4);
     * }
     *
     * function checkFull($x, $y, $r): bool{
     *     return checkCir($x, $y, $r) or checkSquare($x, $y, $r) or checkTri($x, $y, $r);
     * }
     */

}
