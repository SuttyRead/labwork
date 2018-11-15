package com.ua.sutty.lab.lab1;


public class Matrix {


    private double[][] valueMatrix;

    public double[][] getValueMatrix() {
        return valueMatrix;
    }

    public void setValueMatrix(double[][] valueMatrix) {
        this.valueMatrix = valueMatrix;
    }

    public static double[][] addMatrix(double[][] someMatrix, double[][] someMatrix2) {

        double[][] newMatrix = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = someMatrix[i][j] + someMatrix2[i][j];
            }
        }

        return newMatrix;
    }

    public static double[][] multiplyMatrix(double[][] firstMatrix, double[][] secondMatrix2) {

        int firstMatrixColumnLength = firstMatrix[0].length;
        int secondMatrixRowLength = secondMatrix2.length;
        if (firstMatrixColumnLength != secondMatrixRowLength) {
            return null;
        }
        int firstMatrixRowLength = firstMatrix.length;
        int secondMatrixColLength = secondMatrix2[0].length;

        double[][] newMatrix = new double[firstMatrixRowLength][secondMatrixColLength];

        for (int i = 0; i < firstMatrixRowLength; i++) {
            for (int j = 0; j < secondMatrixColLength; j++) {
                newMatrix[i][j] = 0;
                for (int k = 0; k < firstMatrixColumnLength; k++) {
                    newMatrix[i][j] += firstMatrix[i][k] * secondMatrix2[k][j];
                }
            }
        }
        return newMatrix;
    }

    public static double[][] transportMatrix(double[][] someMatrix) {
        double[][] newMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = someMatrix[j][i];
            }
        }
        return newMatrix;
    }

    public static void printMatrix(double[][] valueMatrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(valueMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
