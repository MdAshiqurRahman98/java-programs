
package javaprograms1;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Celcius: ");
        double celcius = input.nextDouble();
        
        double fahrenheit = 1.8 * celcius + 32;
        System.out.println("Fahrenheit: " +fahrenheit);
    }
}
