import java.util.Scanner;

public class SpaceStationEstablishment {
    private static int rPlayer = 0;
    private static int cPlayer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int frO = 0;
        int fcO = 0;

        int srO = 0;
        int scO = 0;

        int energy = 0;

        String[][] space = new String[n][n];
        for (int r = 0; r < n; r++) {
            String line = scanner.nextLine();
            for (int c = 0; c < n; c++) {
                space[r][c] = String.valueOf(line.charAt(c));
                if (space[r][c].equals("S")) {
                    rPlayer = r;
                    cPlayer = c;
                }
//                if(space[r][c].equals("O")){
//
//                }
            }
        }

        boolean isInVoid = false;

        String command = scanner.nextLine();
        while (true) {

            if (command.equals("up")) {
                if (rPlayer == 0) {
                    isInVoid = true;
                    space[rPlayer][cPlayer] = "-";
                    break;
                }
                space[rPlayer][cPlayer] = "-";
                if (space[rPlayer - 1][cPlayer].equals("O")) {
                    space[rPlayer - 1][cPlayer] = "-";
                    Teleport(n, space);
                } else if (space[rPlayer - 1][cPlayer].charAt(0) >= '0' && space[rPlayer - 1][cPlayer].charAt(0) <= '9') {
                    energy += Integer.parseInt(space[rPlayer - 1][cPlayer]);
                    space[rPlayer - 1][cPlayer] = "S";
                    rPlayer--;
                } else {
                    space[rPlayer - 1][cPlayer] = "S";
                    rPlayer--;
                }

            } else if (command.equals("down")) {
                if (rPlayer >= n - 1) {
                    isInVoid = true;
                    space[rPlayer][cPlayer] = "-";
                    break;
                }
                space[rPlayer][cPlayer] = "-";
                if (space[rPlayer + 1][cPlayer].equals("O")) {
                    space[rPlayer + 1][cPlayer] = "-";
                    Teleport(n, space);
                } else if (space[rPlayer + 1][cPlayer].charAt(0) >= '0' && space[rPlayer + 1][cPlayer].charAt(0) <= '9') {
                    energy += Integer.parseInt(space[rPlayer + 1][cPlayer]);
                    space[rPlayer + 1][cPlayer] = "S";
                    rPlayer++;
                } else {
                    space[rPlayer + 1][cPlayer] = "S";
                    rPlayer++;
                }

            } else if (command.equals("left")) {
                if (cPlayer == 0) {
                    isInVoid = true;
                    space[rPlayer][cPlayer] = "-";
                    break;
                }
                space[rPlayer][cPlayer] = "-";
                if (space[rPlayer][cPlayer - 1].equals("O")) {
                    space[rPlayer][cPlayer - 1] = "-";
                    Teleport(n, space);
                } else if (space[rPlayer][cPlayer - 1].charAt(0) >= '0' && space[rPlayer][cPlayer - 1].charAt(0) <= '9') {
                    energy += Integer.parseInt(space[rPlayer][cPlayer - 1]);
                    space[rPlayer][cPlayer - 1] = "S";
                    cPlayer--;
                } else {
                    space[rPlayer][cPlayer - 1] = "S";
                    cPlayer--;
                }

            } else if (command.equals("right")) {
                if (cPlayer >= n - 1) {
                    isInVoid = true;
                    space[rPlayer][cPlayer] = "-";
                    break;
                }
                space[rPlayer][cPlayer] = "-";
                if (space[rPlayer][cPlayer + 1].equals("O")) {
                    space[rPlayer][cPlayer + 1] = "-";
                    Teleport(n, space);
                } else if (space[rPlayer][cPlayer + 1].charAt(0) >= '0' && space[rPlayer][cPlayer + 1].charAt(0) <= '9') {
                    energy += Integer.parseInt(space[rPlayer][cPlayer + 1]);
                    space[rPlayer][cPlayer + 1] = "S";
                    cPlayer++;
                } else {
                    space[rPlayer][cPlayer + 1] = "S";
                    cPlayer++;
                }

            }

            if (energy >= 50) {
                break;
            }

            command = scanner.nextLine();
        }

        if (isInVoid) {
            System.out.println("Bad news, the spaceship went to the void.");
        } else {
            System.out.println("Good news! Stephen succeeded in collecting enough star power!");
        }
        System.out.println("Star power collected: " + energy);

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(space[r][c]);
            }
            System.out.println();
        }

    }

    private static void Teleport(int n, String[][] space) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (space[r][c].equals("O")) {
                    space[r][c] = "S";
                    rPlayer = r;
                    cPlayer = c;
                    break;
                }
            }
        }
    }
}
