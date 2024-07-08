
package javaprograms1;

import java.util.Scanner;

public class MultiplicationTable_NestedforLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial number: ");
        int m = input.nextInt();
        
        System.out.print("Enter ending number: ");
        int n = input.nextInt();
        
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+ " X " +j+ " = " +i*j);
            }
            
            System.out.println();
        }
    }
}
