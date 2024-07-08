package javaprograms1;

import java.util.Scanner;

public class PrimeNumber_forLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any positive integer: ");
        int number = input.nextInt();

        int count = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " isn't a Prime Number.");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " isn't a Prime Number.");
            }
        }
    }
}
