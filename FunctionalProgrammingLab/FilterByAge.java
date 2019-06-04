package FunctionalProgrammingLab;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Predicate;

public class FilterByAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] personData = scanner.nextLine().split(", ");

            people.put(personData[0], Integer.parseInt(personData[1]));
        }

        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        Predicate<Integer> youngerThan = age -> age <= ageLimit;
        Predicate<Integer> olderThan = age -> age >= ageLimit;

        if ("name".equals(printType)) {
            if ("younger".equals(comparison)) {
                people.entrySet()
                        .stream()
                        .filter(e -> youngerThan.test(e.getValue()))
                        .forEach(p -> System.out.println(p.getKey()));
            } else {
                people.entrySet()
                        .stream()
                        .filter(e -> olderThan.test(e.getValue()))
                        .forEach(p -> System.out.println(p.getKey()));
            }
        } else if ("age".equals(printType)) {
            if ("younger".equals(comparison)) {
                people.entrySet()
                        .stream()
                        .filter(e -> youngerThan.test(e.getValue()))
                        .forEach(p -> System.out.println(p.getValue()));
            } else {
                people.entrySet()
                        .stream()
                        .filter(e -> olderThan.test(e.getValue()))
                        .forEach(p -> System.out.println(p.getValue()));
            }
        } else {
            if ("younger".equals(comparison)) {
                people.entrySet()
                        .stream()
                        .filter(e -> youngerThan.test(e.getValue()))
                        .forEach(p -> System.out.println(
                                String.format("%s - %d"
                                        , p.getKey(), p.getValue())));
            } else {
                people.entrySet()
                        .stream()
                        .filter(e -> olderThan.test(e.getValue()))
                        .forEach(p -> System.out.println(
                                String.format("%s - %d"
                                        , p.getKey(), p.getValue())));
            }
        }


    }
}
