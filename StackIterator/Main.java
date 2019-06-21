package IteratorsAndComparatorsExercise.StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        MyStack myStack = new MyStack();
        boolean caughtError = false;

        while (!"END".equals(line)) {
            String[] commands = line.split(" ");

            switch (commands[0]) {
                case "Push":
                    for (int i = 1; i < commands.length; i++) {
                        String number = "";
                        if (commands.length - 1 != i) {
                            for (int j = 0; j < commands[i].length() - 1; j++) {
                                number += commands[i].charAt(j);
                            }
                        } else {
                            number += commands[i];
                        }
                        myStack.pusher(Integer.parseInt(number));
                    }
                    break;
                case "Pop":
                    try {
                        myStack.poper();
                    } catch (IllegalAccessException e) {
                        System.out.println(e.getMessage());
                        caughtError = true;
                    }
                    break;
            }
            if(!caughtError){
                line = scanner.nextLine();
            }else{
                break;
            }
        }

        myStack.forEach();
        myStack.forEach();

    }
}
