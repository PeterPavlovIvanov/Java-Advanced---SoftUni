package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Predicate<Integer> filterEven = x -> x % 2 == 0;
        Predicate<Integer> filterOdd = x -> x % 2 == 1;
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        String command = scanner.nextLine();

        int start = Integer.parseInt(line[0]);
        int end = Integer.parseInt(line[1]);

        Predicate<Integer> byType = filterEven;

        if (command.equals("odd")) {
            byType = filterOdd;
        }

        IntStream
                .rangeClosed(start, end)
                .boxed()
                .filter(byType)
                .forEach(x -> System.out.print(x+" "));

    }
}
