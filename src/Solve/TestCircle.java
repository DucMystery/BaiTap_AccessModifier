package Solve;

import org.w3c.dom.ls.LSOutput;

public class TestCircle extends Circle {

    public static void main(String[] args) {

        TestCircle circle1 = new TestCircle();
      Circle circle2 = new Circle(5.0,"blue");

      System.out.printf("dien tich cua hinh tron co ban kinh %f la %f va co mau %s",circle2.getRadius(),circle2.getArea(),circle2.getColor());
        System.out.printf("\n");
        System.out.printf("dien tich cua hinh tron co ban kinh %f la %f va co mau %s",circle1.getRadius(),circle1.getArea(),circle1.getColor());
    }

}
