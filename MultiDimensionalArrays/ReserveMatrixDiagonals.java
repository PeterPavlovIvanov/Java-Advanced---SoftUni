package MultiDimensionalArrays;

import java.util.Scanner;

public class ReserveMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] matrix = new int[n][m];

        for (int row = 0; row < n; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < m; col++) {
                matrix[row][col] = Integer.parseInt(tokens[col]);
            }
        }

        int count = 2;
        int t = n*m;
        int sum = n + m;

        while (t>0) {
            for (int row = n-1; row >= 0; row--) {
                for (int col = m-1; col >= 0; col--) {
                    if (col + row == sum - count) {
                        System.out.print(matrix[row][col] + " ");
                        t--;
                    }
                }
            }
            count++;
            System.out.println();
        }


    }
}
