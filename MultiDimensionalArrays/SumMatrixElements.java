package MultiDimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int sum = 0;

        int[][] matr = new int[n][m];
        for (int row = 0; row < n; row++) {
            String[] numbers = scanner.nextLine().split(", ");
            for (int col = 0; col < m; col++) {
                matr[row][col]= Integer.parseInt(numbers[col]);
                sum+=Integer.parseInt(numbers[col]);
            }
        }

        System.out.println(n);
        System.out.println(m);
        System.out.println(sum);

    }
}
