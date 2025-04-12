package Day006_Opps;

import java.util.Scanner;

class CalculatorApp{


    public int num1;
    public int num2;
    public char operator;
    public int result; 


    CalculatorApp(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number :");
        num1 = sc.nextInt();

        System.out.println("Enter 2nd number :");
        num2 = sc.nextInt();

        System.out.println("Enter operator");
        operator = sc.next().charAt(0);

    }


    public void perform(){
       if (operator == '+'){
        result = num1 + num2;
       }
       else if (operator == '-'){
        result = num1 - num2;
       }
       else if (operator == '*'){
        result = num1 * num2;
       }
       else if (operator == '/'){
        result = num1 / num2;
       }
       else{
        System.out.println("error");
       }
    }

    public void getResult(){
        System.out.println(result);
       }

}
public class Calculator {
    public static void main(String[] args) {
        
        CalculatorApp cl = new CalculatorApp();
        cl.perform();
        cl.getResult();
    }
}
