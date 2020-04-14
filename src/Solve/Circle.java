package Solve;

public class Circle {

    private String color;
    private double radius;

    Circle(){
        color ="red";
        radius =1.0;
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    protected double getRadius(){
        return this.radius;
    }

    protected double getArea(){
        return radius*radius*Math.PI;
    }

    protected String getColor(){
        return this.color;
    }
}
