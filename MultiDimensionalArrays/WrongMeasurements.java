package MultiDimensionalArrays;

import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n * 10];


        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < input.length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        String[] command = scanner.nextLine().split("\\s+");
        int wrongR = Integer.parseInt(command[0]);
        int wrongC = Integer.parseInt(command[1]);
        int wrong = matrix[wrongR][wrongC];

        int[][] result = new int[n][n * 10];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (wrong == matrix[row][col]) {
                    int sum = 0;
                    if (row > 0) {
                        if (matrix[row - 1][col] != wrong) {
                            sum += matrix[row - 1][col];
                        }
                    }
                    if (row < n - 1) {
                        if (matrix[row + 1][col] != wrong) {
                            sum += matrix[row + 1][col];
                        }
                    }
                    if (col > 0) {
                        if (matrix[row][col - 1] != wrong) {
                            sum += matrix[row][col - 1];
                        }
                    }
                    if (col < matrix[row].length - 1) {
                        if (matrix[row][col + 1] != wrong) {
                            sum += matrix[row][col + 1];
                        }
                    }
                    result[row][col] = sum;
                } else {
                    result[row][col] = matrix[row][col];
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < result[row].length; col++) {
                if (matrix[row][col] != 0) {
                    System.out.print(result[row][col] + " ");
                }
            }
            System.out.println();
        }


    }

    private static boolean isValid(int m, int wrong) {
        boolean isValid = false;
        if (m == wrong) {
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }
}
