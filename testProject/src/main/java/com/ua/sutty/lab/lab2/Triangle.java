package com.ua.sutty.lab.lab2;

public class Triangle extends Shape {

    private double[] a = new double[2];
    private double[] b = new double[2];
    private double[] c = new double[2];

    public Triangle() {
    }

    public Triangle(double[] a, double[] b, double[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print() {
        System.out.println("Point a = " + "(" + a[0] + ";" + a[1] + ")"
            + "(" + b[0] + ";" + b[1] + ")" + "(" + c[0] + ";" + c[1] + ")");
    }

    public void move(int[] point) {
        a[0]+= point[0];
        a[1]+= point[1];
        b[0]+= point[0];
        b[1]+= point[1];
        c[0]+= point[0];
        c[1]+= point[1];
    }

    public void scaling(double scale) {
        a[0]*= scale;
        a[1]*= scale;
        b[0]*= scale;
        b[1]*= scale;
        c[0]*= scale;
        c[1]*= scale;
    }
}
