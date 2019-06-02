package MultiDimensionalArrays;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[][] matrix = new int[n][m];
        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < m; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        int maxSum = MIN_VALUE;
        String answer = "";
        for (int row = 0; row < n - 2; row++) {
            int sum = 0;
            for (int col = 0; col < m - 2; col++) {
                sum = matrix[row][col] +
                        matrix[row + 1][col] +
                        matrix[row + 2][col] +
                        matrix[row][col + 1] +
                        matrix[row][col + 2] +
                        matrix[row + 1][col + 1] +
                        matrix[row + 2][col + 1] +
                        matrix[row + 1][col + 2] +
                        matrix[row + 2][col + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    answer = "" + matrix[row][col] + " " +
                            matrix[row][col + 1] + " " +
                            matrix[row][col + 2] + " " +
                            matrix[row + 1][col] + " " +
                            matrix[row + 1][col + 1] + " " +
                            matrix[row + 1][col + 2] + " " +
                            matrix[row + 2][col] + " " +
                            matrix[row + 2][col + 1] + " " +
                            matrix[row + 2][col + 2];
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        String[] res = answer.split("\\s+");

        int index= 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[index]+" ");
                index++;
            }
            System.out.println();
        }

    }
}
