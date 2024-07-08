package javaprograms1;

import java.util.Arrays;

public class SecondLargestNumber_Array {

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

        // The second largest number will be the second last element in the sorted array
        int secondLargestNumber = distinctNumbers[distinctNumbers.length - 2];

        System.out.println("The second largest number is: " + secondLargestNumber);
    }
}
