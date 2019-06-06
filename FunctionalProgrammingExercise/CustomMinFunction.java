package FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Function;

import static java.lang.Integer.MAX_VALUE;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int[] numbers = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        Function<int[], Integer> findSmallest = e ->{
            int min = MAX_VALUE;
            for (int i = 0; i < e.length; i++) {
                if(e[i] < min){
                    min = e[i];
                }
            }
            return min;
        };
        System.out.println(findSmallest.apply(numbers));
    }
}
