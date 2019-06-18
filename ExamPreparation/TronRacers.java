package ExamPreparation;

import java.util.Scanner;

public class TronRacers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] mapR = new String[n][n];
        int frow = 0;
        int fcol = 0;
        int srow = 0;
        int scol = 0;

        for (int r = 0; r < n; r++) {
            String line = scanner.nextLine();
            for (int c = 0; c < n; c++) {
                mapR[r][c] = String.valueOf(line.charAt(c));
                if (mapR[r][c].equals("f")) {
                    frow = r;
                    fcol = c;
                } else if (mapR[r][c].equals("s")) {
                    srow = r;
                    scol = c;
                }
            }
        }

        int winner = 0;

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            String first = command[0];
            String second = command[1];

            if (first.equals("up")) {
                if (frow - 1 < 0) {
                    if (mapR[n - 1][fcol].equals("s")) {
                        mapR[n - 1][fcol] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[n - 1][fcol] = "f";
                    frow = n - 1;
                } else {
                    if (mapR[frow - 1][fcol].equals("s")) {
                        mapR[frow - 1][fcol] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow - 1][fcol] = "f";
                    frow--;
                }
            } else if (first.equals("down")) {
                if (frow + 1 >= n) {
                    if (mapR[0][fcol].equals("s")) {
                        mapR[0][fcol] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[0][fcol] = "f";
                    frow = 0;
                } else {
                    if (mapR[frow + 1][fcol].equals("s")) {
                        mapR[frow + 1][fcol] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow + 1][fcol] = "f";
                    frow++;
                }
            } else if (first.equals("left")) {
                if (fcol - 1 < 0) {
                    if (mapR[frow][n - 1].equals("s")) {
                        mapR[frow][n - 1] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow][n - 1] = "f";
                    fcol = n - 1;
                } else {
                    if (mapR[frow][fcol - 1].equals("s")) {
                        mapR[frow][fcol-1] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow][fcol - 1] = "f";
                    fcol--;
                }
            } else if (first.equals("right")) {
                if (fcol + 1 >= n) {
                    if (mapR[frow][0].equals("s")) {
                        mapR[frow][0] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow][0] = "f";
                    fcol = 0;
                } else {
                    if (mapR[frow][fcol + 1].equals("s")) {
                        mapR[frow][fcol + 1] = "x";
                        winner = 2;
                        break;
                    }
                    mapR[frow][fcol + 1] = "f";
                    fcol++;
                }
            }


            if (second.equals("up")) {
                if (srow - 1 < 0) {
                    if (mapR[n - 1][scol].equals("f")) {
                        mapR[n - 1][scol] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[n - 1][scol] = "s";
                    srow = n - 1;
                } else {
                    if (mapR[srow - 1][scol].equals("f")) {
                        mapR[srow - 1][scol] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow - 1][scol] = "s";
                    srow--;
                }
            } else if (second.equals("down")) {
                if (srow + 1 >= n) {
                    if (mapR[0][scol].equals("f")) {
                        mapR[0][scol] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[0][scol] = "s";
                    srow = 0;
                } else {
                    if (mapR[srow + 1][scol].equals("f")) {
                        mapR[srow + 1][scol] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow + 1][scol] = "s";
                    srow++;
                }
            } else if (second.equals("left")) {
                if (scol - 1 < 0) {
                    if (mapR[srow][n - 1].equals("f")) {
                        mapR[srow][n - 1] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow][n - 1] = "s";
                    scol = n - 1;
                } else {
                    if (mapR[srow][scol - 1].equals("f")) {
                        mapR[srow][scol - 1] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow][scol - 1] = "s";
                    scol--;
                }
            } else if (second.equals("right")) {
                if (scol + 1 >= n) {
                    if (mapR[srow][0].equals("f")) {
                        mapR[srow][0] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow][0] = "s";
                    scol = 0;
                } else {
                    if (mapR[srow][scol + 1].equals("f")) {
                        mapR[srow][scol + 1] = "x";
                        winner = 1;
                        break;
                    }
                    mapR[srow][scol + 1] = "s";
                    scol++;
                }
            }

//            for (int r = 0; r < n; r++) {
//                for (int c = 0; c < n; c++) {
//                    System.out.print(mapR[r][c]);
//                }
//                System.out.println();
//            }
//            System.out.println();

        }


        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(mapR[r][c]);
            }
            System.out.println();
        }

    }
}
