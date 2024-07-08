package javaprograms1;

public class PrimeNumber_WithoutUserInput {

    public static void main(String[] args) {
        int number = 7;

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
