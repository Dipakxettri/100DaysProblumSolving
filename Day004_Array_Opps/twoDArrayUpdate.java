package Day004_Array_Opps;

import java.util.Scanner;

public class twoDArrayUpdate {

    public static void update(int[][] array){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();

        System.out.println("Enter column :");
        int column = sc.nextInt();

        System.out.println("Enter value :");
        int value = sc.nextInt();

        if(row < array.length && column< array.length){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[row][column] = value;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println("  ");
        }
       

    }
    public static void main(String[] args) {

        int [][] arry = {
            {1,2},
            {3,4}
        };
        
        update(arry);
        
    }
}
