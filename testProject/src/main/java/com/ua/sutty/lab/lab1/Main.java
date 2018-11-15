package com.ua.sutty.lab.lab1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Matrix firstMatrix = new Matrix();
        Matrix secondMatrix = new Matrix();
        Matrix afterAdd = new Matrix();
        Matrix afterMultiply = new Matrix();
        Matrix afterTransport = new Matrix();

        System.out.println("Generated matrix");
        System.out.println("First matrix\n");
        firstMatrix.setValueMatrix(generateMatrix());
        Matrix.printMatrix(firstMatrix.getValueMatrix());

        System.out.println("Second matrix\n");
        secondMatrix.setValueMatrix(generateMatrix());
        Matrix.printMatrix(secondMatrix.getValueMatrix());


        System.out.println("Add\n");
        afterAdd.setValueMatrix(Matrix.addMatrix(firstMatrix.getValueMatrix(), secondMatrix.getValueMatrix()));
        Matrix.printMatrix(afterAdd.getValueMatrix());

        System.out.println("Multiply\n");
        afterMultiply.setValueMatrix(Matrix.multiplyMatrix(firstMatrix.getValueMatrix(), secondMatrix.getValueMatrix()));
        Matrix.printMatrix(afterMultiply.getValueMatrix());

        System.out.println("Transport\n");
        afterTransport.setValueMatrix(Matrix.transportMatrix(firstMatrix.getValueMatrix()));
        Matrix.printMatrix(afterTransport.getValueMatrix());

    }

    public static double[][] generateMatrix() {
        double[][] newMatrix = new double[3][3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = random.nextDouble();
            }
        }
        return newMatrix;
    }
}
