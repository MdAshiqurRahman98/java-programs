// Password matching

package javaprograms1;

import java.util.Scanner;

public class EqualsMethod {
    public static void main(String[] args) {
        String password1 = "12345abc";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password2 = input.next();
        
        if (password1.equals(password2) == true) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Something went wrong. Try again.");
        }
    }
}
