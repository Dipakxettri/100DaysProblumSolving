package Day004_Array_Opps;

public class findDeterminant {
    public static void main(String[] args) {
        
        int [][] arry = {
            {1,2},
            {3,4}
        };

        int d1 = 0;
        int d2 = 0;
        int d;

        d1 = arry[0][0] * arry[1][1];
        d2 = arry[0][1] * arry[1][0];
        d = d1 - d2;
        System.out.println(d);


    }
}
