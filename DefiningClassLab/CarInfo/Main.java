package DefiningClassesLab.CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        while (count-- > 0) {
            String[] line = scanner.nextLine().split("\\s+");
            String make = line[0];

            if(line.length>1){
                String model = line[1];
                int horsePower = Integer.parseInt(line[2]);

                Car car = new Car(make,model,horsePower);
                cars.add(car);
            }else{
                Car car = new Car(make);
                car.setMake(make);
                cars.add(car);
            }

        }

        cars.forEach(c -> System.out.println(c.carInfo()));

    }
}

