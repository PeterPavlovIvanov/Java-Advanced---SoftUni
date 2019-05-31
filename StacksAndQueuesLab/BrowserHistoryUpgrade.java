package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        while (!"Home".equals(input)) {

            if ("back".equals(input)) {
                if (stack.size() > 1) {
                    forwardStack.addFirst(stack.peek());
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if ("forward".equals(input)) {
                if (forwardStack.size() > 0) {
                    stack.push(forwardStack.peek());
                    System.out.println(forwardStack.pop());
                } else {
                    System.out.println("no next URLs");
                }
            } else {
                System.out.println(input);
                stack.push(input);
                forwardStack.clear();
            }

            input = scanner.nextLine();
        }
    }
}
