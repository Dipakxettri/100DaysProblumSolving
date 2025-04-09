package Day002;

import java.util.Scanner;
public class guessTheNumberGame {
    public static void main(String[] args) {
        System.out.println("  Game");

        Scanner sc = new Scanner(System.in);
        

        int ans = 8;

        boolean isRun = true;
        while(isRun){
            System.out.print("Guess the number between 1 to 10:");
        int ask = sc.nextInt();
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
}
