package DefiningClassesExercise.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] line1 = scanner.nextLine().split("\\s+");
            String model = line1[0];
            String power = line1[1];
            String displacement = "n/a";
            String efficiency = "n/a";

            if (line1.length == 3) {

                if(line1[2].charAt(0)>='0' && line1[2].charAt(0)<='9'){
                    displacement = line1[2];
                }else{
                    efficiency = line1[2];
                }

            } else if (line1.length == 4) {
                displacement = line1[2];
                efficiency = line1[3];
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);

        }

        int m = Integer.parseInt(scanner.nextLine());

        while (m-- > 0) {
            String[] line2 = scanner.nextLine().split("\\s+");
            String model = line2[0];
            String engineModel = line2[1];
            String weight = "n/a";
            String color = "n/a";

            if (line2.length == 3) {
                if(line2[2].charAt(0)>='0' && line2[2].charAt(0)<='9'){
                    weight = line2[2];
                }else{
                    color = line2[2];
                }
            } else if (line2.length == 4) {
                weight = line2[2];
                color = line2[3];
            }

            String power = "";
            String displacement = "n/a";
            String efficiency = "n/a";

            Engine engine = new Engine(engineModel);

            for (int i = 0; i < engines.size(); i++) {
                if(engines.get(i).getModel().equals(engineModel)){
                    power = engines.get(i).getPower();
                    displacement = engines.get(i).getDisplacement();
                    efficiency = engines.get(i).getEfficiency();
                }
            }
            engine.setPower(power);
            engine.setDisplacement(displacement);
            engine.setEfficiency(efficiency);

            Car car = new Car(model, engine, weight, color);
            cars.add(car);

        }

        cars.stream().forEach(car -> {
            System.out.print(String.format(
                    "%s:%n%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n",
                    car.getModel(),car.getEngine().getModel(),car.getEngine().getPower(),
                    car.getEngine().getDisplacement(), car.getEngine().getEfficiency(),
                    car.getWeight(),car.getColor()
            ));
        });

    }
}
