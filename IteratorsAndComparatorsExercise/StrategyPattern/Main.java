package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        TreeSet<Person> byName = new TreeSet<>(new PersonByNameLength());
        TreeSet<Person> byAge = new TreeSet<>(new PersonByAge());
//        List<IteratorsAndComparatorsExercise.StrategyPattern.Person> byName = new ArrayList<>();
//        List<IteratorsAndComparatorsExercise.StrategyPattern.Person> byAge = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Person person = new Person(
                    tokens[0], Integer.parseInt(tokens[1]));

            byAge.add(person);
            byName.add(person);

        }

        for (Person person : byName) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        for (Person person : byAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }
}
