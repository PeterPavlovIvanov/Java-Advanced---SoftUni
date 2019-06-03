package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String username = scanner.nextLine();

            usernames.add(username);
        }

        for (String username : usernames) {
            System.out.println(username);
        }

    }
}
