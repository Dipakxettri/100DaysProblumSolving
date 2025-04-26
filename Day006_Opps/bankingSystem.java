package Day006_Opps;


import java.util.Scanner;

class BankSystem {
    public int iD;
    public int balance;

    private void setID(int id) {
        this.iD = id;
    }

    public void deposite(int money) {
        balance = money;
    }

    public void withDraw(int value){
        if(value <= balance ){
            balance = balance - value;
        }
        else{
            System.out.println("cant able to withdraw due to unsuffecient amount");
        }
    }

    public void getBalance() {
        System.out.println("Balance: "+ balance);
    }

}

class DeepakAccount extends BankSystem {

}

public class bankingSystem {
    public static void main(String[] args) {
        DeepakAccount a1 = new DeepakAccount();
        Scanner sc = new Scanner(System.in);
 
        
 
        while(true){
         System.out.println("Enter\n1: see Balance\n2: Deposite\n3: With Draw\n :");
        int func = sc.nextInt();
        if(func == 1){
         a1.getBalance();
        }
 
        else if(func == 2){
         System.out.println("Enter money you want to deposite :");
         int money = sc.nextInt();
         a1.deposite(money);
        }
 
        else if(func == 3){
         System.out.println("Enter money you want to with draw :");
         int money = sc.nextInt();
         a1.withDraw(money);
        }
        }
    }
}