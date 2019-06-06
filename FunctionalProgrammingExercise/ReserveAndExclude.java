package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Predicate;

public class ReserveAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int divide = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }

        Predicate<Integer> remover = e -> e % divide != 0;
        ArrayList<Integer> updated = new ArrayList<>();

        for (int n : numbers) {
            if (remover.test(n)) {
                updated.add(n);
            }
        }

        Collections.reverse(updated);

        updated.forEach(e -> System.out.print(e + " "));

    }
}
