package SetsAndMapsAdvanced;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        int n = count;
        Map<String, Double> student = new TreeMap<>();

        while (n > 0) {

            String name = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");
            double avg = 0;
            for (int i = 0; i < grades.length; i++) {
                avg += Double.parseDouble(grades[i]);
            }
            avg /= grades.length;

            student.put(name, avg);

            n--;
        }

        for (Map.Entry<String, Double> e : student.entrySet()) {
            System.out.println(
                    e.getKey()+" is graduated with "+e.getValue()
            );
        }
    }
}
