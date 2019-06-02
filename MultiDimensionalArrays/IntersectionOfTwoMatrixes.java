package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows * 2; i++) {
            String[] elements = scanner.nextLine().split("\\s+");

            for (int col = 0; col < elements.length; col++) {
                if (i < rows) {
                    firstMatrix[i][col] = elements[col].charAt(0);
                } else {
                    secondMatrix[i - rows][col] = elements[col].charAt(0);
                }
            }

        }

        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                char firstElement = firstMatrix[row][col];
                char secondElement = secondMatrix[row][col];
                if (firstElement != secondElement) {
                    resultMatrix[row][col] = '*';
                    continue; //preskacha resultMatrix[row][col] = firstElement;
                }

                resultMatrix[row][col] = firstElement;

            }

        }

        for (char[] martix : resultMatrix) {
            System.out.println(Arrays.toString(martix)
                    .replaceAll("\\[|\\]", " ")
                    .replaceAll(",", ""));
        }

    }
}
