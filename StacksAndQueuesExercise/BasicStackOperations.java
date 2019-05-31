package StackQueueExcercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] param = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int elementsCount = param[0];
        int elementsToRemove = param[1];
        int lookUpElement = param[2];


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(elementsCount)
                .forEach(stack::push);

        while (elementsToRemove-- > 0) {
            stack.pop();
        }

        if (stack.contains(lookUpElement)) {
            System.out.println("true");
        } else {
            if (stack.size() == 0) {
                System.out.println(0);
            } else {
                //System.out.println(Collections.min(stack));
                int min = Integer.MAX_VALUE;
                while(!stack.isEmpty()){
                    int number = stack.pop();
                    if(number<min){
                        min=number;
                    }
                }
                System.out.println(min);
            }
        }

    }
}
