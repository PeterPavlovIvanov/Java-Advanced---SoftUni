package StackQueueExcercise;

import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .limit(Integer.parseInt(command[0]))
                .forEach(e -> queue.offer(e));
        int x = Integer.parseInt(command[1]);

        while (x-- > 0) {
            queue.poll();
        }

        if(queue.contains(command[2])){
            System.out.println("true");
        }else{
            if(queue.size()>0){
                System.out.println(Collections.min(queue));
            }else{
                System.out.println(0);
            }
        }

    }
}
