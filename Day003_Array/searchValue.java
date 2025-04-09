package Day003_Array;

public class searchValue {
    public static void main(String[] args) {
        int [] arry = {1,2,3,4};
        int target = 2;

        boolean isFound = false;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i] == target){
                isFound = true;
            }
        }

        if(isFound){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
    }
}
