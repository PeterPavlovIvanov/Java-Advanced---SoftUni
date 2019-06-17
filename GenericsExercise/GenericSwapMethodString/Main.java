package GenericsExercise.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxes = new ArrayList<>();

        while (n-- > 0) {
            String line = scanner.nextLine();

            Box<String> box = new Box<>(line);

            boxes.add(box);
        }

        String[] command = scanner.nextLine().split("\\s+");
        int f = Integer.parseInt(command[0]);
        int s = Integer.parseInt(command[1]);

        swapElements(boxes,f,s);

        for (Box box : boxes) {
            System.out.println(box.toString());
        }

    }

    private static <T> void swapElements(List<Box<T>> someBoxes, int f, int s) {

        Box<T> temp = someBoxes.get(f);
        someBoxes.set(f, someBoxes.get(s));
        someBoxes.set(s, temp);

    }
}
