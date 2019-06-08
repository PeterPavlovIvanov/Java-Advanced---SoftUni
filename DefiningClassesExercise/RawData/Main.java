package DefiningClassesExercise.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String model = line[0];
            int engineSpeed = Integer.parseInt(line[1]);
            int enginePower = Integer.parseInt(line[2]);
            int cargoWeight = Integer.parseInt(line[3]);
            String cargoType = line[4];
            double tire1Pressure = Double.parseDouble(line[5]);
            int tire1Age = Integer.parseInt(line[6]);
            double tire2Pressure = Double.parseDouble(line[7]);
            int tire2Age = Integer.parseInt(line[8]);
            double tire3Pressure = Double.parseDouble(line[9]);
            int tire3Age = Integer.parseInt(line[10]);
            double tire4Pressure = Double.parseDouble(line[11]);
            int tire4Age = Integer.parseInt(line[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            Car car = new Car(model, engine, cargo, tire);

            cars.add(car);
        }

        String command = scanner.nextLine();
        if ("fragile".equals(command)) {
            for (Car c : cars) {
                if (c.getCargo().getType().equals("fragile")) {
                    if (c.getTire().getTire1Pressure() < 1 || c.getTire().getTire2Pressure() < 1 ||
                            c.getTire().getTire3Pressure() < 1 || c.getTire().getTire4Pressure() < 1) {
                        System.out.println(c.getModel());
                    }
                }
            }
        } else {
            for (Car c : cars) {
                if (c.getCargo().getType().equals("flamable")) {
                    int power = c.getEngine().getPower();
                    if (power > 250) {
                        System.out.println(c.getModel());
                    }
                }
            }


        }

    }
}
