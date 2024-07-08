package javaprograms1;

import java.util.Arrays;

public class SecondLowestNumber_Array {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 1, 9, 11, 7, 5};

        // Check if the array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array does not have enough elements.");
            return;
        }

        // Remove duplicates
        int[] distinctNumbers = Arrays.stream(numbers).distinct().toArray();

        // Check again if the array has at least two distinct elements
        if (distinctNumbers.length < 2) {
            System.out.println("Array does not have enough distinct elements.");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(distinctNumbers);

        // The second lowest number will be the second element in the sorted array
        int secondLowestNumber = distinctNumbers[1];

        System.out.println("The second lowest number is: " + secondLowestNumber);
    }
}
