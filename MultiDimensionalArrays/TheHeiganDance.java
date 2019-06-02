package MultiDimensionalArrays;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] area = new int[15][15];
        int pc = 7;
        int pr = 7;

        double damagePerTurn = Double.parseDouble(scanner.nextLine());
        double health = 18500;

        double boss = 3000000;
        boolean isWin = false;
        boolean isPoisoned = false;
        int row2 = -2;
        int col2 = -2;

        String killedBy = "";

        while (true) {
            boss -= damagePerTurn;
            if (boss <= 0) {
                isWin = true;
                break;
            }

            String[] input = scanner.nextLine().split("\\s+");
            String spell = input[0];
            int row = Integer.parseInt(input[1]);
            int col = Integer.parseInt(input[2]);



            if (pr >= row - 1 && pr <= row + 1 && pc >= col - 1 && pc <= col + 1) {
                if (isPoisoned) {
                    if (pr >= row2 - 1 && pr <= row2 + 1 ) {
                        if(pc >= col2 - 1 && pc <= col2 + 1){
                            health -= 3500;
                        }
                    }
                    row2 = -2;
                    col2 = -2;
                    isPoisoned = false;
                }
                if("Cloud".equals(spell)){
                    row2 = row;
                    col2 = col;
                    isPoisoned = true;
                }
                if (pr - 1 < row - 1 && pr - 1 >= 0) {
                    pr--;
                } else if (pc + 1 > col + 1 && pc + 1 <= 14) {
                    pc++;
                } else if (pr + 1 > row + 1 && pr + 1 <= 14) {
                    pr++;
                } else if (pc - 1 < col - 1 && pc - 1 >= 0) {
                    pc--;
                } else {
                    if ("Cloud".equals(spell)) {
                        health -= 3500;
                    } else if ("Eruption".equals(spell)) {
                        health -= 6000;
                        row2 = -1;
                        col2 = -1;
                    }

                }

                if (health <= 0) {
                    isWin = false;
                    killedBy = spell;
                    break;
                }
            }

        }

        if (killedBy.equals("Cloud")) {
            killedBy = "Plague Cloud";
        }

        if (isWin) {
            System.out.println("Heigan: Defeated!");
            System.out.printf("Player: %.0f\n", health);
            System.out.printf("Final position: %d, %d\n", pr, pc);
        } else {
            System.out.printf("Heigan: %.2f\n", boss);
            System.out.printf("Player: Killed by %s\n", killedBy);
            System.out.printf("Final position: %d, %d\n", pr, pc);
        }

    }
}
