package com.ua.sutty.lab.lab3;

import com.ua.sutty.lab.lab2.Circle;
import com.ua.sutty.lab.lab2.Shape;
import com.ua.sutty.lab.lab2.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
//        for (int i = 0; i < 10; i++) {
//            shapes[i] = new Circle();
//        }
        shapes[0] = new Circle(new double[] {1, 1}, 2);
        shapes[1] = new Triangle(new double[] {1, 1}, new double[] {3, 3}, new double[] {5, 1});
        shapes[0].print();
        System.out.println("-----");
        shapes[1].print();

        Shape[] someShape = generateShapes();
        for (int i = 0; i < 10; i++) {
            someShape[i].print();
        }
        System.out.println("-------------------------------");


//        defineShape(someShape);

    }

    public static Shape[] generateShapes() {

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(2));
        }

        Shape[] shapes = new Shape[10];
        for (int i = 0; i < 10; i++) {
            if (integers.get(i) == 1) {
                shapes[i] = new Circle(new double[] {1, 1}, 2);
            } else {
                shapes[i] = new Triangle(new double[] {1, 1}, new double[] {3, 3}, new double[] {5, 1});
            }
        }
        return shapes;
    }

    public static void defineShape(Shape[] shapes) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getClass().equals("class com.ua.sutty.lab.lab2.Circle")) {
                integers.add(1);
            } else {
                integers.add(2);
            }


        }
        for (int i = 0; i < 10; i++) {
            if (integers.get(i) == 1) {
                System.out.println(i + " - Circle");
            } else {
                System.out.println(i + " - Triangle");
            }
        }
    }


}
