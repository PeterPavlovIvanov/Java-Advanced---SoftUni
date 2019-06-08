package DefiningClassesExercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person p = new Person(name, age);

            people.add(p);

        }

        people.stream()
                .filter(person -> person.getAge()>30)
                .sorted((p1,p2)-> p1.getName().compareTo(p2.getName()))
                .forEach(pe -> System.out.println(String.format(
                        "%s - %d",
                        pe.getName(),pe.getAge()
                )));

    }
}
