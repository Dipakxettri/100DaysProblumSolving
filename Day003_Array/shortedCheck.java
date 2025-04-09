package Day003_Array;

public class shortedCheck {
    public static void main(String[] args) {
        int [] arry = {1,2,3,4};

        int prev = 0;
        boolean isShorted = false;
        
       for (int i = 0; i < arry.length; i++) {
            if (arry[i] > prev){
                prev = arry[i];
               isShorted = true;
            }
            else{
                isShorted = false;
            }
        }

        if(isShorted){
            System.out.println("Shorted");
        }

        else{
            System.out.println("Not Shorted");
        }
    }
}
