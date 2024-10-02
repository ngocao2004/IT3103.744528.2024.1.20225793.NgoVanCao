import java.util.Scanner;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];
        System.out.println("Nhập các phần tử cho ma trận 1:");

        int i;
        int j;
        for(i = 0; i < rows; ++i) {
            for(j = 0; j < cols; ++j) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập các phần tử cho ma trận 2:");

        for(i = 0; i < rows; ++i) {
            for(j = 0; j < cols; ++j) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for(i = 0; i < rows; ++i) {
            for(j = 0; j < cols; ++j) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Tổng của hai ma trận là:");

        for(i = 0; i < rows; ++i) {
            for(j = 0; j < cols; ++j) {
                System.out.print(sumMatrix[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
