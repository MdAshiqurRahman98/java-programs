
package javaprograms1;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        double large = (number1>number2) ? number1 : number2;
        System.out.println("Large number: " +large);
    }
}
