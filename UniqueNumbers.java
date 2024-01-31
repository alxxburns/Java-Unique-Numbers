/* Unique number array Program */
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5]; // Create an integer array of size 5 to store the unique numbers.
        int uniqueCount = 0;

        System.out.print("Enter a number between 10 and 100: ");
        int number = input.nextInt();

        // repeat loop until 5 unique numbers are entered 
        while (uniqueCount < 5) { 
            boolean duplicate = false;
 
            // Iterate through the array and check if the number entered is already present
            for (int i = 0; i < uniqueCount; i++) {
                if (numbers[i] == number) {
                    duplicate = true;
                    break;
                }
            }
            
            // If number is not duplicate then add to array and increment unique count 
            if (!duplicate) {
                numbers[uniqueCount] = number;
                uniqueCount++;

                // display current set of unique numbers 
                System.out.print("Unique numbers: ");
                for (int i = 0; i < uniqueCount; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();
            }

            // when unique count = 5 exit the loop
            if (uniqueCount == 5) {
                break;
            }

            System.out.print("Enter another number between 10 and 100: ");
            number = input.nextInt();
        }

        // display final set of unique numbers entered 
        System.out.println("All unique numbers entered:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(numbers[i]);
        }
    }
}

