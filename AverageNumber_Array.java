
package javaprograms1;

import java.util.Scanner;

public class AverageNumber_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[5];
        double sum = 0;
        System.out.print("Enter five numbers: ");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        
        System.out.println("The sum is: " +sum);
        System.out.println("The average is: " +sum/numbers.length);
        
    }
}
