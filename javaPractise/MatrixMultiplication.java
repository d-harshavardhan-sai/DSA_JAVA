package javaPractise;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns for Matrix A: ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for Matrix B: ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible.");
        } else {
            System.out.println("Enter elements of Matrix A:");
            int[][] matrixA = inputMatrix(rowsA, colsA, scanner);
            System.out.println("Enter elements of Matrix B:");
            int[][] matrixB = inputMatrix(rowsB, colsB, scanner);

            int[][] multiplicationResult = multiplyMatrices(matrixA, matrixB);
            System.out.println("Matrix Multiplication Result:");
            printMatrix(multiplicationResult);
        }

        scanner.close();
    }

    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
