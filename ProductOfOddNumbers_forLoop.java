
package javaprograms1;

import java.util.Scanner;

public class ProductOfOddNumbers_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial number: ");
        int m = input.nextInt();
        
        System.out.print("Enter ending number: ");
        int n = input.nextInt();
        
        int product = 1;
        for (int i = m; i <= n; i++) {
            if (i%2 != 0) {
                product = product * i;
            }
        }
        
        System.out.println("The product of odd numbers between "+m+" to "+n+" is: " +product);
    }
}
