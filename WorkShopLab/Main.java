package WorkShop;

import java.io.IOException;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IOException {

        //SmartArray Tests
        SmartArray smartArray = new SmartArray();
        System.out.println("SmartArray Tests");
        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);
        smartArray.add(23);
        System.out.println(smartArray.get(3));
        smartArray.remove(1);
        smartArray.remove(1);
        smartArray.remove(2);
        smartArray.add(0, 2);
        smartArray.add(1, 3);
        smartArray.add(3, 23);
        System.out.println(smartArray.contains(23));
        System.out.println(smartArray.contains(0));
        Consumer<Integer> isBiggerThanThree = e -> {
            if (e > 3) {
                System.out.println(e);
            }
        };
        smartArray.forEach(isBiggerThanThree);
        System.out.println();

        //CustomStack Tests
        CustomStack customStack = new CustomStack();
        System.out.println("CustomStack Tests");
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.peek();
        Consumer<Integer> isLessThenTwo = e -> {
            if (e < 2) {
                System.out.println(e);
            }
        };
        customStack.forEach(isLessThenTwo);
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println();
    }
}
