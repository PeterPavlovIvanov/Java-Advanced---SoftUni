package MultiDimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if ("A".equalsIgnoreCase(pattern)) {
            int index = 1;
            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = index;
                    index++;
                }
            }
        } else if ("B".equalsIgnoreCase(pattern)) {
            int count = 0;
            int index = 1;
            for (int col = 0; col < n; col++) {
                if (count % 2 == 0) {
                    for (int row = 0; row < n; row++) {
                        matrix[row][col] = index;
                        index++;
                    }
                } else {
                    for (int row = n-1; row >=0 ; row--) {
                        matrix[row][col]= index;
                        index++;
                    }
                }
                count++;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
