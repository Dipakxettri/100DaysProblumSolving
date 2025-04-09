package Day002;

public class oneDArraySum {
    public static void main(String[] args) {
        int [] arry = {1,2,3,4};
        int sum = 0;
        
        for(int i = 0; i<arry.length; i++){
            sum += arry[i];
        }

        System.out.println(sum);
    }
}
