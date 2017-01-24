package edu.tomer.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       int[][] table =  { { 1, 2, 3, 4, 5 },
                          { 2, 4, 6, 8, 10 },
                          { 20, 10, 5, 3, 2 },
                          { 3, 6, 9, 12, 15 } };

        int[][] matrix = new int[5][5];


        for (int i = 0, counter = 1; i < matrix[0].length; i++, counter++) {
            matrix[0][i] = counter;
        }

        for (int i = 0, counter = 2; i < matrix[1].length; i++, counter+=2) {
            matrix[1][i] = counter;
        }

        for (int i = 0, counter = 20; i < matrix[2].length; i++) {
            matrix[2][i] = counter;
            counter = counter / 2 + counter % 2;
        }

        for (int i = 0, counter = 3; i < matrix[3].length; i++, counter+=3) {
            matrix[3][i] = counter;
        }

        //the first diagonal [0][0], [1][1]...
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = (i + 1) * (i + 1);
        }

        //the first diagonal [0][0], [1][1]...
        int temp = 5;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            matrix[i][j] = temp;
            temp *= 2;
        }

        //print a [][]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }



    }
}
