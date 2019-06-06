package FunctionalProgrammingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");
        List<String> accepted = new ArrayList<>();

        Predicate<String> checker = e -> e.length() <= n;

        Arrays.stream(names)
                .forEach(e -> {
                    if(checker.test(e)){
                        accepted.add(e);
                    }
                });

        accepted.forEach(System.out::println);
    }
}
