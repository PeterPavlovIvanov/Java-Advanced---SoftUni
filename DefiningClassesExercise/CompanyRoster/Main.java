package DefiningClassesExercise.CompanyRoster;

import java.util.*;

import static java.lang.Float.MIN_VALUE;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        LinkedHashMap<String, Double> departments = new LinkedHashMap<>();
        HashMap<String, Double> res = new HashMap<>();

        while ((n-- > 0)) {
            String[] line = scanner.nextLine().split("\\s+");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String departmentName = line[3];

            Employee employee = new Employee(name, salary, position, departmentName);

            if (line.length == 5) {
                if (Character.isDigit(line[4].charAt(0))) {
                    employee.setAge(Integer.parseInt(line[4]));
                } else {
                    employee.setEmail(line[4]);
                }
            } else if (line.length == 6) {
                employee.setEmail(line[4]);
                employee.setAge(Integer.parseInt(line[5]));
            }

            employees.add(employee);

            if (!departments.containsKey(departmentName)) {
                departments.put(departmentName, -1.0);
            }

        }

        String highestString = "";
        double highestValue = MIN_VALUE;

        for (Map.Entry<String, Double> depart : departments.entrySet()) {
            int count = 0;
            double all = 0;

            for (Employee emp : employees) {
                if (emp.getDepartment().equals(depart.getKey())) {
                    count++;
                    all += emp.getSalary();
                }
            }
            double avg = all / count;
            res.put(depart.getKey(), avg);
            if (highestValue < avg) {
                highestValue = avg;
                highestString = depart.getKey();
            }
        }

        System.out.println("Highest Average Salary: " + highestString);

        employees.sort((e1,e2) -> e2.getSalary().compareTo(e1.getSalary()));

        for (Employee emp : employees) {
            if (emp.getDepartment().equals(highestString)) {
                System.out.println(String.format(
                        "%s %.2f %s %d",emp.getName(),emp.getSalary(),emp.getEmail(),emp.getAge()
                ));
            }
        }
    }
}
