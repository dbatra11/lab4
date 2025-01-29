package com.example.myapplication;

public abstract class Shape {
    Integer x;
    Integer y;

    Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape {
    Integer radius;

    public Circle(Integer x, Integer y, Integer radius) {
        super(x, y);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

