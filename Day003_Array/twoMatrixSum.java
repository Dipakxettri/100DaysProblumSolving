package Day003_Array;

public class twoMatrixSum {
    public static void main(String[] args) {
        int [][] mtrx1 = {
            {1,2},
            {3,4}
        };

        int [][] mtrx2 = {
            {9,8},
            {2,4}
        };

        int [][] result = {
            {0,0},
            {0,0}
        };

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mtrx1[i][j] + mtrx2[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("  ");
        }
    }
}
