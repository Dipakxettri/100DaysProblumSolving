

import java.util.Scanner;
class percentageCalculator{

        Scanner sc = new Scanner(System.in);
    
    public float getTotal(){
        System.out.println("Enter the marks of maths: ");
        float maths = sc.nextInt();

        System.out.println("Enter the marks of DSA: ");
        float dsa = sc.nextInt();

        System.out.println("Enter the marks of C Programming: ");
        float c = sc.nextInt();

        System.out.println("Enter the marks of Java: ");
        float java = sc.nextInt();

        float totalMarksMarks = 400;
        float totalMarks = maths + dsa + java + c;

        float percentage = (totalMarksMarks/totalMarks) * 100;


        return percentage;
    }

    public void getPercentage(){

    }
}
public class percentageCalc {
    public static void main(String[] args) {
        
        percentageCalculator pc = new percentageCalculator();

        System.out.println("  Your Total Percentage is " + pc.getTotal());
    }
}
