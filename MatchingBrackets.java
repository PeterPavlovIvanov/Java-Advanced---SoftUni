package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < line.length(); i++) {
            int start = 0;
            int end = 0;
            if (line.charAt(i) == '(') {
                stack.push(i);
            } else if (line.charAt(i) == ')') {
                start = stack.pop();
                end = i;
                System.out.println(line.substring(start,end+1));
            }
        }

    }
}
