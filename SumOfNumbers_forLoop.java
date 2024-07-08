
package javaprograms1;

import java.util.Scanner;

public class SumOfNumbers_forLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial number: ");
        int m = input.nextInt();
        
        System.out.print("Enter ending number: ");
        int n = input.nextInt();
        
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("The sum of "+m+" to "+n+" is: " +sum);
    }
}
