package Day002;

public class loop {
    public static void main(String[] args) {
        

        // for(int i = 2; i<11; i+=2){
        //     System.out.println(i);
        // }

        // int i = 1;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

    int [][] arry = {
            {1,2,3,4},
            {5,6,7,8}
        };
        
        for (int i = 0; i<arry.length; i++){
           for (int j = 0; j < arry[i].length; j++) {
            System.out.print(arry[i][j] + " ");
           }

           System.out.println(" ");
        }
    }
}
