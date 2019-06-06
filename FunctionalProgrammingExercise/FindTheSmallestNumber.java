package FunctionalProgrammingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.max;

public class FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> line = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        Function<ArrayList<Integer>, Integer> findSmallest = e -> {
            int min = MAX_VALUE;

            for (int n : e) {
                if (n < min) {
                    min = n;
                }
            }

            return line.lastIndexOf(min);
        };

        System.out.println(findSmallest.apply(line));
    }
}
