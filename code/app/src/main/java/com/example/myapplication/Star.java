package com.example.myapplication;

public class Star extends Shape {
    private int points;

    public Star(Integer x, Integer y, int points) {
        super(x, y);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Star at (" + x + ", " + y + ") with " + points + " points";
    }
}
