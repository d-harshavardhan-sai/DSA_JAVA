package javaPractise;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrices dimensions
        System.out.print("Enter the number of rows and columns for the matrices (Addition): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Input matrices for addition
        System.out.println("Enter elements of Matrix A:");
        int[][] matrixA = inputMatrix(rows, cols, scanner);
        System.out.println("Enter elements of Matrix B:");
        int[][] matrixB = inputMatrix(rows, cols, scanner);

        // Perform matrix addition
        int[][] additionResult = addMatrices(matrixA, matrixB);
        System.out.println("Matrix Addition Result:");
        printMatrix(additionResult);

        // Input matrices dimensions for multiplication
        System.out.print("Enter the number of rows and columns for Matrix A (Multiplication): ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        System.out.print("Enter the number of rows and columns for Matrix B (Multiplication): ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
        } else {
            // Input matrices for multiplication
            System.out.println("Enter elements of Matrix A:");
            matrixA = inputMatrix(rowsA, colsA, scanner);
            System.out.println("Enter elements of Matrix B:");
            matrixB = inputMatrix(rowsB, colsB, scanner);

            // Perform matrix multiplication
            int[][] multiplicationResult = multiplyMatrices(matrixA, matrixB);
            System.out.println("Matrix Multiplication Result:");
            printMatrix(multiplicationResult);
        }

        scanner.close();
    }

    // Method to input a matrix
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method for matrix addition
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method for matrix multiplication
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

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

