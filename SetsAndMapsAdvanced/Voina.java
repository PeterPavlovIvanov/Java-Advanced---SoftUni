package SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Set<Integer> firstPlayer = Arrays
//                .stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toSet());

        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        String[] input1 = scanner.nextLine().split("\\s+");
        for (int i = 0; i < input1.length; i++) {
            firstPlayer.add(Integer.parseInt(input1[i]));
        }

//        Set<Integer> secondPlayer = Arrays
//                .stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .collect(Collectors.toSet());
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();
        String[] input2 = scanner.nextLine().split("\\s+");
        for (int i = 0; i < input2.length; i++) {
            secondPlayer.add(Integer.parseInt(input2[i]));
        }

        for (int round = 0; round < 50; round++) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }

            Iterator<Integer> firstPlayerIterator = firstPlayer.iterator();
            Iterator<Integer> secondPlayerIterator = secondPlayer.iterator();

            int firstPlayerValue = firstPlayerIterator.next();
            firstPlayer.remove(firstPlayerValue);
            int secondPlayerValue = secondPlayerIterator.next();
            secondPlayer.remove(secondPlayerValue);

            if (firstPlayerValue > secondPlayerValue) {
                firstPlayer.add(firstPlayerValue);
                firstPlayer.add(secondPlayerValue);
            } else if (firstPlayerValue < secondPlayerValue) {
                secondPlayer.add(firstPlayerValue);
                secondPlayer.add(secondPlayerValue);
            } else {
               firstPlayer.add(firstPlayerValue);
               secondPlayer.add(secondPlayerValue);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");

        }
    }
}
