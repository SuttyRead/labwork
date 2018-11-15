package com.ua.sutty.lab.lab2;

public class Circle extends Shape {

    private double[] point;
    private double radius;

    public Circle() {
    }

    public Circle(double[] point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public void print() {
        System.out.println("Point = " + "(" + point[0] + ";" + point[1] + ")");
        System.out.println("Radius = " + radius);
    }

    public void move(int[] point) {
        this.point[0]+= point[0];
        this.point[1]+= point[1];
    }

    public void scaling(double scale) {
        radius *= scale;
    }
}
