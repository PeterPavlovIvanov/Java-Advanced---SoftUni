package IteratorsAndComparatorsExercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!"END".equals(line)) {
            String[] info = line.split("\\s+");

            Person person = new Person(
                    info[0], Integer.parseInt(info[1]), info[2]);
            people.add(person);

            line = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());
        int equalPeople = 0;

        Person find = people.get(index - 1);

        for (Person person : people) {
            if (person.compareTo(find) == 0) {
                equalPeople++;
            }
        }

        if (equalPeople == 1) {
            System.out.println("No matches");
        }else{
            System.out.println(String.format("%d %d %d",
                    equalPeople,
                    people.size() - equalPeople,
                    people.size()));
        }

    }
}
