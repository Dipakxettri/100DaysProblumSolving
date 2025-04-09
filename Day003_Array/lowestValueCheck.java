package Day003_Array;

public class lowestValueCheck {
  public static void main(String[] args) {
    int [] arry = {1,2,3,4};

        int lowest = 1000000;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < lowest){
                lowest = arry[i];
            }
        }
        System.out.println(lowest);
  }  
}
