package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        Deque<String> children = new ArrayDeque<>();
        Collections.addAll(children,names);

        while (children.size() > 1){
            for (int i = 0; i < n - 1; i++) {
                String kid = children.poll();
                children.offer(kid);
            }

            String removed = children.pop();
            System.out.println("Removed " + removed);
        }

        System.out.println("Last is " + children.peek());
    }
}
