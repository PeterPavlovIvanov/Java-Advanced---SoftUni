package ExamPreparation;

import java.util.*;

public class ClubParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split("\\s+");
        List<String> line = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            line.add(input[i]);
        }

        LinkedHashMap<String, List<Integer>> halls = new LinkedHashMap<>();
        List<String> helperHalls = new ArrayList<>();

        for (int i = 0; i < line.size(); i++) {
            if ((line.get(i).charAt(0) >= 'a' && line.get(i).charAt(0) <= 'z') ||
                    (line.get(i).charAt(0) >= 'A' && line.get(i).charAt(0) <= 'Z')) {
                halls.put(line.get(i), new ArrayList<>());
                helperHalls.add(line.get(i));
            } else {
                if (!halls.isEmpty()) {
                    boolean isFull = false;

                    int tempCapacity = maxCapacity - Integer.parseInt(line.get(i));
                    int someSize = halls.get(helperHalls.get(0)).size();
                    for (int j = 0; j < someSize; j++) {
                        tempCapacity -= halls.get(helperHalls.get(0)).get(j);
                        if (tempCapacity < 0) {
                            isFull = true;
                            break;
                        }
                    }

                    if (!isFull) {
                        String tempKey = helperHalls.get(0);
                        int tempNumber = Integer.parseInt(line.get(i));
                        List<Integer> tempValue = halls.get(tempKey);
                        tempValue.add(tempNumber);
                        halls.put(tempKey, tempValue);
                    } else {
                        String output = helperHalls.get(0) + " -> ";
                        String outputHelper = halls.get(helperHalls.get(0))
                                .toString().replaceAll("\\[", "").replaceAll("]", "");
                        output += outputHelper;
                        System.out.println(output);
                        halls.remove(helperHalls.get(0));
                        helperHalls.remove(0);

//no protection over helper size = 0
                        if(!helperHalls.isEmpty()){
                            String tempKey = helperHalls.get(0);
                            int tempNumber = Integer.parseInt(line.get(i));
                            List<Integer> tempValue = halls.get(tempKey);
                            tempValue.add(tempNumber);
                            halls.put(tempKey, tempValue);
                        }

                    }

                }
            }
        }


    }
}
//60
//1 20 b 20 20 a