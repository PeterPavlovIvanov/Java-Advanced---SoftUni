package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equalsIgnoreCase(input)) {

            if (!"cancel".equalsIgnoreCase(input)) {
                queue.offer(input);
            } else {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }

            input = scanner.nextLine();
        }

        if(!queue.isEmpty()){
            while(!queue.isEmpty()){
                System.out.println(queue.poll());
            }
        }
    }
}
