package Day004_Array_Opps;

import java.util.Scanner;

public class rockPaperSeasers{

    public static void game(){

        System.out.println("Enter 1 for Rock/nEnter 2 for Paper/nEnter 3 for Searers");
        Scanner sc = new Scanner(System.in);

        System.out.println("Computer Choice his/her choice");
        int computerC = 2;

        System.out.println("Enter your choice :");
        int playerC = sc.nextInt();

          // Determine the winner
          if (playerC == computerC) {
            System.out.println("It's a tie!");
        } else if ((playerC == 1 && computerC == 3) || 
                   (playerC == 2 && computerC == 1) || 
                   (playerC == 3 && computerC == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
    public static void main(String[] args) {
        game();

    }
}
