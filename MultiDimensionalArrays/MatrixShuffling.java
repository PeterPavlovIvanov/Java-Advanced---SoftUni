package MultiDimensionalArrays;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] matrix = new String[n][m];

        for (int row = 0; row < n; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < m; col++) {
                matrix[row][col] = tokens[col];
            }
        }

        String[] command = scanner.nextLine().split("\\s+");
        while (!"END".equals(command[0])) {
            boolean valid = true;
            if (command.length < 5 || command.length > 5) {
                valid = false;
            }
            if (!"swap".equals(command[0])) {
                valid = false;
            }
            int r1 = -1;
            int r2 = -1;
            int c1 = -1;
            int c2 = -1;

            if (valid) {
                r1 = Integer.parseInt(command[1]);
                c1 = Integer.parseInt(command[2]);
                r2 = Integer.parseInt(command[3]);
                c2 = Integer.parseInt(command[4]);
            }

            if (r1 >= n || r2 >= n || c1 >= m || c2 >= m) {
                valid = false;
            }
            if (r1 < 0) {
                valid = false;
            }

            if (valid) {
                String temp = matrix[r1][c1];
                matrix[r1][c1] = matrix[r2][c2];
                matrix[r2][c2] = temp;

                for (int row = 0; row < n; row++) {
                    for (int col = 0; col < m; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }
            }
            if(!valid){
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine().split("\\s+");
        }

    }
}
