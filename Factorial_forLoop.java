
package javaprograms1;

import java.util.Scanner;

public class Factorial_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any positive integer: ");
        int number = input.nextInt();
        
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact = fact * i;
        }
        
        System.out.println("Factorial of "+number+" is: " +fact);
    }
}
