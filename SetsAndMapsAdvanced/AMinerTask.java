package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        LinkedHashMap<String, Integer> mine = new LinkedHashMap<>();

        while (!"stop".equals(resource)) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!mine.containsKey(resource)) {
                mine.put(resource, quantity);
            } else if (mine.containsKey(resource)) {
                mine.put(resource, mine.get(resource) + quantity);
            }

            resource = scanner.nextLine();
        }

        mine.entrySet().forEach(e -> {
            System.out.println(String.format
                    ("%s -> %d", e.getKey(), e.getValue()));
        });


    }
}
