package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> kids = new ArrayDeque<>();

        Collections.addAll(kids, line);

        int count = 1;
        while (kids.size() > 1) {
            boolean flag = false;
            for(int i = 2; i <= count/2; ++i)
            {
                if(count % i == 0)
                {
                    flag = true;
                    break;
                }
            }
            for (int i = 1; i < n; i++) {
                String removeKid = kids.poll();
                kids.offer(removeKid);
            }
            if(!flag && count!=1){
                System.out.println("Prime " + kids.peek());
            }else{
                String removed = kids.pop();
                System.out.println("Removed " + removed);
            }
            count++;
        }

        System.out.println("Last is " + kids.peek());
    }
}
