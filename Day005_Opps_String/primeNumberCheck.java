package Day005_Opps_String;

import java.util.PrimitiveIterator;

public class primeNumberCheck {
    public static void main(String[] args) {
        int num = 2;
        boolean isPrime = true;

        if(num <= 1){
            System.out.println("Not Prime");
        }
        else{
            for (int i = 2; i < num; i++) {
                if (num%i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("Prime");
            }

            else{
                System.out.println("Not Prime");
            }
        }
    }
}
