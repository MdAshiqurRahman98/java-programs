
package javaprograms1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum*10 + r;
            temp = temp / 10;
        }
        
        if (sum == number) {
            System.out.println(number+ " is a Palindrome number.");
        }
        else {
            System.out.println(number+ " isn't a Palindrome number."); 
        }
    }
}
