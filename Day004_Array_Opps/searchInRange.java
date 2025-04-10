package Day004_Array_Opps;

public class searchInRange {

    public static void findValueInRange(int[] array,int r1,int r2,int target){
        boolean isFound = false;
        for(int i = r1; i<= r2; i++){
            if(array[i] == target){
                isFound = true;
            }
        }

        if(isFound){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        int [] arry = {1,2,3,4};
        int t = 2;

        findValueInRange(arry,0,2,t);
    }
}
