package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Predicate<String> isCapitalStart = word ->
                Character.isAlphabetic(word.charAt(0)) ?
                        Character.isUpperCase(word.charAt(0)) :
                        Character.isUpperCase(word.charAt(1));

        List<String> capitalWords =
                Arrays.stream(words)
                        .filter(isCapitalStart)
                        .collect(Collectors.toList());

        System.out.println(capitalWords.size());
        capitalWords.forEach(System.out::println);
    }
}
