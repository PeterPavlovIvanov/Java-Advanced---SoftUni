import java.util.*;
import java.util.stream.Collectors;

public class SpaceshipCrafting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> liquids = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> physicalItems = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(physicalItems);
        boolean glass = false;
        boolean aluminium = false;
        boolean lithium = false;
        boolean carbonFiber = false;
        boolean spaceShipBuilt = false;

        List<String> createdMaterials = new ArrayList<>();

        while (true) {

            boolean removeBoth = true;

            if (liquids.get(0) + physicalItems.get(0) == 25) {
                createdMaterials.add("Glass");
                glass = true;
            } else if (liquids.get(0) + physicalItems.get(0) == 50) {
                createdMaterials.add("Aluminium");
                aluminium = true;
            } else if (liquids.get(0) + physicalItems.get(0) == 75) {
                createdMaterials.add("Lithium");
                lithium = true;
            } else if (liquids.get(0) + physicalItems.get(0) == 100) {
                createdMaterials.add("Carbon fiber");
                carbonFiber = true;
            } else {
                removeBoth = false;
                liquids.remove(0);
                int temp = physicalItems.get(0) + 3;
                physicalItems.set(0, temp);
            }

            if (removeBoth) {
                liquids.remove(0);
                physicalItems.remove(0);
            }

            if (glass && lithium && aluminium && carbonFiber) {
                spaceShipBuilt = true;
            }

            if (physicalItems.size() == 0) {
                break;
            }

            if (liquids.size() == 0) {
                break;
            }

        }

        if (spaceShipBuilt) {
            System.out.println("Wohoo! You succeeded in building the spaceship!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to build the spaceship.");
        }

        if (liquids.size() != 0) {
            System.out.print("Liquids left: ");
            for (int i = 0; i < liquids.size(); i++) {
                if (i + 1 != liquids.size()) {
                    System.out.print(liquids.get(i) + ", ");
                } else {
                    System.out.print(liquids.get(i));
                }
            }
            System.out.println();
        } else {
            System.out.println("Liquids left: none");
        }

        if (physicalItems.size() != 0) {
            System.out.print("Physical items left: ");
            for (int i = 0; i < physicalItems.size(); i++) {
                if (i + 1 != physicalItems.size()) {
                    System.out.print(physicalItems.get(i) + ", ");
                } else {
                    System.out.print(physicalItems.get(i));
                }
            }
            System.out.println();
        } else {
            System.out.println("Physical items left: none");
        }

        int glassCount = 0;
        int aluminiumCount = 0;
        int lithiumCount = 0;
        int carbonFiberCount = 0;
        if (createdMaterials.size() != 0) {
            for (int i = 0; i < createdMaterials.size(); i++) {
                if (createdMaterials.get(i).equals("Glass")) {
                    glassCount++;
                } else if (createdMaterials.get(i).equals("Aluminium")) {
                    aluminiumCount++;
                } else if (createdMaterials.get(i).equals("Lithium")) {
                    lithiumCount++;
                } else if (createdMaterials.get(i).equals("Carbon fiber")) {
                    carbonFiberCount++;
                }
            }
        }

        System.out.println("Aluminium: " + aluminiumCount);
        System.out.println("Carbon fiber: " + carbonFiberCount);
        System.out.println("Glass: " + glassCount);
        System.out.println("Lithium: " + lithiumCount);

    }
}