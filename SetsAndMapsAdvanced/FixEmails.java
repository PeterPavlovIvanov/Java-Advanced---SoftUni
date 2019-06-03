package SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        LinkedHashMap<String, String> emails = new LinkedHashMap<>();

        while (!name.equalsIgnoreCase("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emails.putIfAbsent(name, email);
            }

           // emails.putIfAbsent(name, email);
//            if (!emails.containsKey(name)) {
//                emails.put(name, email);
//            }

            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
        }

    }
}
