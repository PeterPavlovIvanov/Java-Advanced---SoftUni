package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int[] input = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            input[i] = Integer.parseInt(line[i]);
        }

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            if ("add".equals(command)) {
                for (int i = 0; i < input.length; i++) {
                    input[i]+=1;
                }
            } else if ("subtract".equals(command)) {
                for (int i = 0; i < input.length; i++) {
                    input[i]-=1;
                }
            } else if ("multiply".equals(command)) {
                for (int i = 0; i < input.length; i++) {
                    input[i]*=2;
                }
            } else if ("print".equals(command)) {
                for (int i = 0; i < input.length; i++) {
                    System.out.print(input[i]+" ");
                }
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
