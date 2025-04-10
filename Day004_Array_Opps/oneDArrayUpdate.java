package Day004_Array_Opps;

import java.util.Scanner;
public class oneDArrayUpdate {

    public static void update(int [] array ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Orignal Array ");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }


        System.out.println("\nEnter Index :");
        int row = sc.nextInt();

        
        System.out.println("Enter Value :");
        int value = sc.nextInt();

        if(row <= array.length){
            array[row] = value;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        else{
            System.out.println("Error");
        }


    }
    public static void main(String[] args) {
        
        int [] arry = {2,4,6,8};
        update(arry );


    }
}
