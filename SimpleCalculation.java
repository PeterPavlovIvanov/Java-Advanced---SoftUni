package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] Elements = line.split("\\s+");

        for (int i = Elements.length-1; i >= 0; i--) {
            stack.push(Elements[i]);
        }

        while (stack.size() > 1) {
            Integer firstNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            Integer secondNum = Integer.parseInt(stack.pop());

            if ("+".equalsIgnoreCase(op)) {
                stack.push(firstNum + secondNum + "");
            } else {
                stack.push(firstNum - secondNum + "");
            }
        }
        System.out.println(stack.peek());
    }
}
