package in.kgCoding.utils;

import in.kgCoding.geometry.Circle;
import in.kgCoding.geometry.Rectangle;

public class Calculater {
    public static void main(String[] args) {
        Circle cir=new Circle(8);
        Rectangle rec=new Rectangle(8,9);
        double ares=Math.PI*cir.radius*2;
        double areaRec=rec.breadth* rec.length;
        System.out.printf("Area of rectangle is %f \n Area of Circle is %f",areaRec,ares);
    }
}
