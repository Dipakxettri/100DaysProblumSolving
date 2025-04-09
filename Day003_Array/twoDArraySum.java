package Day003_Array;

public class twoDArraySum {
    public static void main(String[] args) {
        int [][] arry = {
            {1,2},
            {3,4}
        };
        int sum = 0;

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                sum += arry[i][j];
            }
        }

        System.out.println(sum);
    }
}
