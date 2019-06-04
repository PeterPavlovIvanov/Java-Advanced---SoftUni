package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        if (line.length() != 0) {
            String[] lineArr = line.split(", ");
            List<Integer> numbers =
                    Arrays.stream(lineArr)
                            .map(Integer::parseInt)
                            .filter(x -> x % 2 == 0)
                            .collect(Collectors.toList());

            System.out.println(SortAndPrint(numbers));

            numbers.sort(Integer::compareTo);

            System.out.println(SortAndPrint(numbers));

        }

    }

    private static String SortAndPrint(List<Integer> numbers) {
        String res2 = "";
        for (int n : numbers) {
            res2 += n + ", ";
        }
        res2 = res2.substring(0, res2.length() - 2);
        return res2;
    }
}
