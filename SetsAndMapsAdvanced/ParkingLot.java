package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parkingLot = new HashSet<>();
        String input = scanner.nextLine();

        while(!"END".equals(input)){
            String[] tokens = input.split(",\\s+");

            String command = tokens[0];
            String value = tokens[1];

            switch (command) {
                case"IN":
                    parkingLot.add(value);
                    break;
                case "OUT":
                    parkingLot.remove(value);
                    break;
            }

            input=scanner.nextLine();
        }

        if(!parkingLot.isEmpty()){
            for(String s : parkingLot){
                System.out.println(s);
            }

            //parkingLot.forEach(e -> System.out.println(e));
        }else{
            System.out.println("Parking Lot is Empty");
        }


    }
}
