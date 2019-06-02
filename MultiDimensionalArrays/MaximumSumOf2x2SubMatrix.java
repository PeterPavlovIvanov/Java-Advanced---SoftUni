package MultiDimensionalArrays;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int maxSum = MIN_VALUE;

        int[][] matrix = new int[n][m];
        for (int row = 0; row < n; row++) {
            String[] tokens = scanner.nextLine().split(", ");
            for (int col = 0; col < m; col++) {
                matrix[row][col] = Integer.parseInt(tokens[col]);

            }
        }
        String res1 = "";
        String res2 = "";
        int sum = 0;
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < m - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    res1 = matrix[row][col] + " " + matrix[row][col + 1]+" ";
                    res2 = matrix[row + 1][col] + " " + matrix[row + 1][col + 1]+" ";
                }

            }
        }

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(maxSum);

    }
}