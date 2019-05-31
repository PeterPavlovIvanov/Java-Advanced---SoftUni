package StackQueueExcercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");
        String[] robots = new String[input.length];
        int[] processTime = new int[input.length];
        int[] worktime = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            String[] data = input[i].split("-");
            String name = data[0];
            int time = Integer.parseInt(data[1]);
            robots[i] = name;
            processTime[i] = time;
        }

        ArrayDeque<String> products = new ArrayDeque<>();

        String inputTime = scanner.nextLine();
        String[] timeSplitted = inputTime.split(":");
        int hours = Integer.parseInt(timeSplitted[0]);
        int minutes = Integer.parseInt(timeSplitted[1]);
        int seconds = Integer.parseInt(timeSplitted[2]);

        String inputProduct = scanner.nextLine();

        while (!inputProduct.equals("End")) {
            products.offer(inputProduct);

            inputProduct = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            seconds++;

            boolean isWorking = false;
            for (int i = 0; i < robots.length; i++) {
                if (worktime[i] == 0 && !isWorking) {
                    worktime[i] = processTime[i];
                    isWorking = true;
                    String totalTime = "";
                    String tSeconds = "";
                    String tMinutes = "";
                    String tHours = "";
                    if(seconds<=9){
                        tSeconds = String.format("0%d",seconds);
                    }else{
                        tSeconds = String.format("%d",seconds);
                    }
                    if(minutes<=9){
                        tMinutes = String.format("0%d",minutes);
                    }else{
                        tMinutes = String.format("%d",minutes);
                    }
                    if(hours<=9){
                        tHours = String.format("0%d",hours);
                    }else{
                        tHours = String.format("%d",hours);
                    }
                    System.out.println(String.format("%s - %s [%S:%S:%S]",robots[i],currentProduct,tHours,tMinutes,tSeconds));
                }
                if (worktime[i] > 0) {
                    worktime[i]--;
                }
            }

            if (!isWorking) { //toest ako vsichki rabotqt
                products.offer(currentProduct);
            }

            if (seconds >= 60) {
                minutes++;
                seconds = 0;
            }
            if (minutes >= 60) {
                hours++;
                minutes = 0;
            }
            if (hours >= 24) {
                hours = 0;
                minutes = 0;
                seconds = 0;
            }
        }

    }
}
