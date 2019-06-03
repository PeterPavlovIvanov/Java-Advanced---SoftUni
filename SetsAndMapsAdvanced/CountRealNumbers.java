package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input[] = scanner.nextLine().split("\\s+");
        Map<Double, Integer> result = new LinkedHashMap<>();

        for (String inputElement : input) {
Double key = Double.parseDouble(inputElement);
            if (!result.containsKey(key)) {
                result.put(key, 0);
            }
            result.put(key, result.get(key) + 1);
        }
        for (Map.Entry<Double,Integer> e : result.entrySet()){
            System.out.println(String.format("%.1f -> %s",e.getKey(),e.getValue()));
        }
    }
}
