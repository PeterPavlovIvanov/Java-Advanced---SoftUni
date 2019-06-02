package MultiDimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[][] matrix = new String[n][m];

        int index = 0;
        int fl = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                char c = (char) (97 + fl);
                matrix[row][col] += c;
                char b = (char) (97 + index + col);
                matrix[row][col] += b;
                matrix[row][col] += c;
            }
            index++;
            fl++;
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                String res = matrix[row][col].substring(4);
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
