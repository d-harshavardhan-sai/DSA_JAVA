package javaPractise;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        System.out.println("Enter elements of Matrix A:");
        int[][] matrixA = inputMatrix(rows, cols, scanner);
        System.out.println("Enter elements of Matrix B:");
        int[][] matrixB = inputMatrix(rows, cols, scanner);

        int[][] additionResult = addMatrices(matrixA, matrixB);
        System.out.println("Matrix Addition Result:");
        printMatrix(additionResult);

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

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

