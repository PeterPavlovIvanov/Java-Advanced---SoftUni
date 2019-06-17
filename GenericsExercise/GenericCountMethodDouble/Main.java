package GenericsExercise.GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> boxes = new ArrayList<>();

        while (n-- > 0) {
            double number = Double.parseDouble(scanner.nextLine());

            Box<Double> box = new Box<>(number);
            boxes.add(box);

        }

        double lastNumber = Double.parseDouble(scanner.nextLine());
        System.out.println(countBigger(boxes,lastNumber));

    }

    private static <T extends Comparable<T>> int countBigger(List<Box<T>> boxes, T lastNumber) {
        int count = 0;

        for (Box box : boxes) {
            if (box.getNumber().compareTo(lastNumber) > 0) {
                count++;
            }
        }

        return count;
    }
}
