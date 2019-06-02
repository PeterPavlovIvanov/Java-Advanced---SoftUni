package MultiDimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        int primarySum = 0;
        int secondarySum = 0;

        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
                if(row == col){
                    primarySum+=Integer.parseInt(input[col]);
                }
                if(row + col == n-1){
                    secondarySum += Integer.parseInt(input[col]);
                }
            }
        }

        System.out.println(Math.abs(primarySum-secondarySum));

    }
}
