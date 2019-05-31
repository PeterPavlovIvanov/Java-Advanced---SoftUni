package StackQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConventer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(decimal==0){
            System.out.println(0);
        }else{
            while(decimal!=0){
                stack.push(decimal%2);
                decimal/=2;
            }

            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                System.out.print(stack.pop());
            }
        }

    }
}
