package GenericsExercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!"END".equals(line)) {
            String[] command = line.split("\\s+");

            if ("Add".equals(command[0])) {
                customList.add(command[1]);
            } else if ("Remove".equals(command[0])) {
                customList.remove(Integer.parseInt(command[1]));
            } else if ("Contains".equals(command[0])) {
                System.out.println(customList.contains(command[1]));
            } else if ("Swap".equals(command[0])) {
                customList.swap(Integer.parseInt(command[1]), Integer.parseInt(command[2]));
            } else if ("Greater".equals(command[0])) {
                System.out.println(customList.countGreater(command[1]));
            } else if ("Max".equals(command[0])) {
                System.out.println(customList.getMax());
            } else if ("Min".equals(command[0])) {
                System.out.println(customList.getMin());
            } else if ("Print".equals(command[0])) {
                customList.print();
            }

            line = scanner.nextLine();
        }

    }
}
