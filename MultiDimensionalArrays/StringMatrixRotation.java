package MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String degreeString = command.substring(7, command.length() - 1);
        int degree = Integer.parseInt(degreeString);

        List<String> checker = new ArrayList<>();
        int maxSize = MIN_VALUE;
        int size = 0;

        String input = scanner.nextLine();
        while (!"END".equals(input)) {

            checker.add(input);
            size = input.length();
            if (size > maxSize) {
                maxSize = size;
            }

            input = scanner.nextLine();
        }

        String[][] matrix = new String[checker.size()][maxSize];

        for (int row = 0; row < checker.size(); row++) {                  // fill
            for (int col = 0; col < checker.get(row).length(); col++) {
                matrix[row][col] = String.valueOf(checker.get(row).charAt(col));
            }
        }

        String result = "";
        int rolls = degree/90;
        if(rolls>4){
            rolls= rolls%4;
        }
        //System.out.println(rolls);

        if (degree == 0 || degree % 360 == 0) {
            for (int row = 0; row < checker.size(); row++) {
                for (int col = 0; col < maxSize; col++) {
                    result += matrix[row][col];
                }
                result += "\n";
            }
        } else if (rolls==3) {
            for (int col = maxSize - 1; col >= 0; col--) {
                for (int row = 0; row < checker.size(); row++) {
                    result += matrix[row][col];
                }
                result += "\n";
            }
        } else if (rolls==2) {
            for (int row = checker.size() - 1; row >= 0; row--) {
                for (int col = maxSize - 1; col >= 0; col--) {
                    result += matrix[row][col];
                }
                result += "\n";
            }
        } else if (rolls ==1) {
            for (int col = 0; col < maxSize; col++) {
                for (int row = checker.size() - 1; row >= 0; row--) {
                    result += matrix[row][col];
                }
                result += "\n";
            }
        }

        System.out.println(result.replaceAll("null", " "));

    }
}
