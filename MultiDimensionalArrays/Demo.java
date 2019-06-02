package MultiDimensionalArrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[][] name = new int[5][4];
//        System.out.println(name.length);     // 5
//        System.out.println(name[0].length);  // 4
//        System.out.println(name[3].length);  // 4

//        int[][] matrix = new int[scanner.nextByte()][scanner.nextByte()];
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[0].length; col++) {
//                matrix[row][col] = row + col;
//                System.out.print(matrix[row][col]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int[][] test = new int[n][m];
        for (int row = 0; row < test.length; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < test[row].length; col++) {
                test[row][col] = Integer.parseInt(inputTokens[col]+1);
                System.out.print(test[row][col]+" ");
            }
            System.out.println();
        }

    }
}
