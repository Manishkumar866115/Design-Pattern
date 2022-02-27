package com.company;

class Circle{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public String info(){
        return "Circle has radius " + this.radius;
    }
}

class ColoredCircle{
    private Circle circle;
    private String color;

    public ColoredCircle(Circle circle, String color) {
        this.circle = circle;
        this.color = color;
    }

    public String info(){
        return circle.info() + " and has color " + this.color;
    }
}

public class Main {

    public static void main(String[] args) {

        ColoredCircle coloredCircle = new ColoredCircle(new Circle(5),"green");
        System.out.println(coloredCircle.info());
    }
}
