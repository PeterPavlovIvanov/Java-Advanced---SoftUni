package DefiningClassesExercise.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            String command = tokens[1];

            Person person = new Person(name);

            boolean isInListAlready = false;
            for (int i = 0; i < people.size(); i++) {
                if (people.get(i).getName().equals(name)) {
                    isInListAlready = true;
                    person = people.get(i);
                    break;
                }
            }

            if (!isInListAlready) {
                person = new Person(name);
            }

            if (command.equals("company")) {
                String companyName = tokens[2];
                String department = tokens[3];
                double salary = Double.parseDouble(tokens[4]);

                Company company = new Company(companyName, department, salary);
                person.setCompany(company);
            } else if (command.equals("pokemon")) {
                String pokemonName = tokens[2];
                String pokemonType = tokens[3];

                Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                if (person.getPokemons().size() == 0) {
                    List<Pokemon> temp = new ArrayList<>();
                    temp.add(pokemon);
                    person.setPokemons(temp);
                } else {
                    person.getPokemons().add(pokemon);
                }
            } else if (command.equals("parents")) {
                String parentName = tokens[2];
                String parentBirthday = tokens[3];

                Parent parent = new Parent(parentName, parentBirthday);
                if (person.getParents().isEmpty()) {
                    List<Parent> temp = new ArrayList<>();
                    temp.add(parent);
                    person.setParents(temp);
                } else {
                    person.getParents().add(parent);
                }
            } else if (command.equals("children")) {
                String childName = tokens[2];
                String childBirthday = tokens[3];

                Child child = new Child(childName, childBirthday);
                if (person.getChildren().isEmpty()) {
                    List<Child> temp = new ArrayList<>();
                    temp.add(child);
                    person.setChildren(temp);
                } else {
                    person.getChildren().add(child);
                }
            } else if (command.equals("car")) {
                String carModel = tokens[2];
                String carSpeed = tokens[3];

                Car car = new Car(carModel, carSpeed);
                person.setCar(car);
            }

            people.add(person);

            line = scanner.nextLine();
        }

        String exitname = scanner.nextLine();

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(exitname)) {
                Person r = people.get(i);
                System.out.println(r.getName());

                System.out.println("DefiningClassesExercise.Google.Company:");
                if (!r.getCompany().getCompanyName().equals("n/a")) {
                    System.out.println(String.format("%s %s %.2f",
                            r.getCompany().getCompanyName(),
                            r.getCompany().getDepartment(),
                            r.getCompany().getSalary()));
                }

                System.out.println("DefiningClassesExercise.Google.Car:");
                if (!r.getCar().getCarModel().equals("n/a")) {
                    System.out.println("" + r.getCar().getCarModel() + " " + r.getCar().getCarSpeed());
                }

                System.out.println("DefiningClassesExercise.Google.Pokemon:");
                for (Pokemon pokemon : r.getPokemons()) {
                    String result = pokemon.getPokemonName() + " " + pokemon.getPokemonType();
                    System.out.println(result);
                }

                System.out.println("Parents:");
                for (Parent parent : r.getParents()) {
                    String result = parent.getParentName() + " " + parent.getParentBirthday();
                    System.out.println(result);
                }

                System.out.println("Children:");
                for (Child child : r.getChildren()) {
                    String result = child.getChildName() + " " + child.getChildBirthday();
                    System.out.println(result);
                }

                break;
            }
        }

    }
}
