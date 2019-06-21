package IteratorsAndComparatorsExercise.ListlyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tokens = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .collect(Collectors.toList());

        ListlyIterator iterator = new ListlyIterator(tokens);

        String line = scanner.nextLine();

        while (!("END").equals(line)) {

            if (line.equals("Move")) {
                System.out.println(iterator.move());
            } else if (line.equals("Print")) {
                try {
                    System.out.println(iterator.print());
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            } else if(line.equals("HasNext")){
                System.out.println(iterator.hasNext());
            }

            line = scanner.nextLine();
        }
    }


}
