package MultiDimensionalArrays;

import java.util.Scanner;

public class CompareMatrixes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputF = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(inputF[0]);
        int second = Integer.parseInt(inputF[1]);
        int[][] m = new int[first][second];

        for (int row = 0; row < m.length; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }


        String[] inputS = scanner.nextLine().split("\\s+");
        int third = Integer.parseInt(inputS[0]);
        int fourth = Integer.parseInt(inputS[1]);
        int[][] n = new int[third][fourth];

        for (int row = 0; row < n.length; row++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            for (int col = 0; col < n[row].length; col++) {
                n[row][col] = Integer.parseInt(inputTokens[col]);
            }
        }

        if (first == third && second == fourth) {
            boolean isEqual = true;
            for (int row = 0; row < m.length; row++) {
                for (int col = 0; col < m[row].length; col++) {
                    if(m[row][col]!=n[row][col]){
                        isEqual=false;
                        break;
                    }
                }
            }
            if(isEqual){
                System.out.println("equal");
            }else{
                System.out.println("not equal");
            }
        }else{
            System.out.println("not equal");
        }

    }
}
