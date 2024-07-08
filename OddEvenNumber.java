
package javaprograms1;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        
        int number = input.nextInt();
        
        if(number%2 != 0){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
}
