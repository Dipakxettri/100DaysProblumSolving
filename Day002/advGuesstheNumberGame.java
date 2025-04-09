package Day002;

import java.util.Scanner;
public class advGuesstheNumberGame {


    // Title
    public static void title() {
        System.out.println("      Game ");
    }

    // generate ans
    public static int generateAns(int a){
        int ans = a;
        return ans;
    }

    // input
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess The number: ");
        int ask = sc.nextInt();
        return ask;
    }

    // main Fuction to run game
    public static void runGame(){
        title();
        boolean isRun = true;
        while(isRun){
            int ans = generateAns(2);
            int ask = input();
            if(ask == ans){
                System.out.println("You Win");
                isRun = false;
            }
    
            else if(ask > ans){
                System.out.println("Enter less number");
            }
    
            else if(ask < ans){
                System.out.println("Enter higher number");
            }
    
            else{
                System.out.println("Enter correct number");
            }
            
        }
       
    }
    public static void main(String[] args) {
        runGame();
    }
}
