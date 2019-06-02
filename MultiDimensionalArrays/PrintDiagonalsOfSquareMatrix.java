package MultiDimensionalArrays;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        String result1 = "";
        String result2 = "";

        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
                if (row == col) {
                    result1 += input[col] + " ";
                }
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + col == n - 1) {
                    result2 += matrix[row][col] + " ";
                }
            }
        }

        System.out.println(result1.trim());
        result2 = result2.trim();
        String result3="";
        for (int i = result2.length()-1; i >=0 ; i--) {
            result3+=result2.charAt(i);
        }
        System.out.println(result3.trim());

    }
}

