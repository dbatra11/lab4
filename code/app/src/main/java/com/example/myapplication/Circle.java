package com.example.myapplication;

public class Circle extends Shape {
    private double radius;

    public Circle(Integer x, Integer y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
