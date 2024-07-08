
package javaprograms1;

import java.util.Arrays;

public class SecondLargestAndLowestNumber_Array {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 1, 9, 11, 7, 5};
        
        // Remove duplicates and sort the array
        int[] sortedArray = Arrays.stream(numbers).distinct().sorted().toArray();
        
        int secondLargestNumber = sortedArray.length > 1 ? sortedArray[sortedArray.length - 2] : null;
        int secondLowestNumber = sortedArray.length > 1 ? sortedArray[1] : null;
        
        System.out.println("The second largest number is: " +secondLargestNumber);
        System.out.println("The second lowest number is: " +secondLowestNumber);
    }
}
