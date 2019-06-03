package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstNumbers = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondNumbers = new LinkedHashSet<>();
       // LinkedHashSet<Integer> result = new LinkedHashSet<>();

        while (n-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            firstNumbers.add(number);
        }

        while (m-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            secondNumbers.add(number);
        }

        firstNumbers.forEach(e -> {
            if(secondNumbers.contains(e)){
                System.out.print(e+" ");
            }
        });

//       firstNumbers.retainAll(secondNumbers);
//                                                                         correct
//    firstNumbers.forEach(e -> System.out.print(e + " "));


    }
}
