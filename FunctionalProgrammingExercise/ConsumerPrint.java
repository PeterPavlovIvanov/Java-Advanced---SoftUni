package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerPrint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Consumer<List<String>> print = s -> s.forEach(System.out::println);

        print.accept(line);

    }
}
