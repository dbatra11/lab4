package com.example.myapplication;
import kotlin.text.UStringsKt;
public abstract class Shape {
    Integer x;
    Integer y;
    String color = "blue";
    Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
