package MultiDimensionalArrays;

import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        int[][] matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < c; col++) {
                matrix[row][col] = Integer.parseInt(tokens[col]);
            }
        }

        int n = Integer.parseInt(scanner.nextLine());

        boolean notFound = true;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(n==matrix[row][col]){
                    System.out.println(row+" "+col);
                    notFound = false;
                }
            }
        }

        if(notFound){
            System.out.println("not found");
        }
    }
}
