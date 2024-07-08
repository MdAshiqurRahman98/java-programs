
package javaprograms1;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any character: ");
        char ch = input.next().charAt(0);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}
