
package javaprograms1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        
        System.out.println("Sum of digits: " +sum);
    }
}
