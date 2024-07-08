
package javaprograms1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        
        if (sum == number) {
            System.out.println(number+ " is an armstrong number.");
        }
        else {
            System.out.println(number+ " isn't an armstrong number."); 
        }
    }
}
