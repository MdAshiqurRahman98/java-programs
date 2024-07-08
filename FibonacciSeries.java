
package javaprograms1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any positive integer: ");
        int number = input.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.print(first+ " " +second);
        
        for (int i = 3; i <= number; i++) {
            int fibo = first + second;
            System.out.print(" " +fibo);
            first = second;
            second = fibo;
        }
        
        System.out.println();
    }
}
