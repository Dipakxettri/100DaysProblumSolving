package Day003_Array;

public class greatestValueCheck {
    public static void main(String[] args) {
        
        int [] arry = {1,2,3,4};

        int greatest = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > greatest){
                greatest = arry[i];
            }
        }
        System.out.println(greatest);
    }
}
