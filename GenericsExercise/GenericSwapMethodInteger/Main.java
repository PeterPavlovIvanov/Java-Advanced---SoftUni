package GenericsExercise.GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Integer>> boxes = new ArrayList<>();

        while(n-->0){
            int number = Integer.parseInt(scanner.nextLine());

            Box<Integer> box = new Box<>(number);
            boxes.add(box);

        }
        String[] command = scanner.nextLine().split("\\s+");
        int f = Integer.parseInt(command[0]);
        int s = Integer.parseInt(command[1]);

        swapMethod(boxes,f,s);

        boxes.forEach(b -> System.out.println(b.toString()));
    }

    public static <E> void swapMethod(List<Box<E>> boxes, int f, int s){

        Box<E> temp = boxes.get(f);
        boxes.set(f,boxes.get(s));
        boxes.set(s,temp);

    }
}
