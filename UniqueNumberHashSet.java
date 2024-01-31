/* Unique Numbers Hash Set program */
import java.util.Scanner;
import java.util.HashSet;

public class UniqueNumberHashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create a HashSet to store the unique numbers entered
        HashSet<Integer> numbers = new HashSet<>();

        // repeat the process until 5 unique numbers entered
        while (numbers.size() < 5) {
            System.out.print("Enter a number between 10 and 100: ");
            int number = input.nextInt();

            // check if number between 10 and 100
            if (number < 10 || number > 100) {
                System.out.println("Number must be between 10 and 100.");
                continue;
            }

            // add the number to the HashSet and check if it is duplicate
            if (numbers.add(number)) {
                System.out.print("Unique numbers: ");
                for (int n : numbers) {
                    System.out.print(n + " ");
                }
                System.out.println();
            } else {
                System.out.println("Duplicate number, try again.");
            }
        }

        // display the final set of unique numbers
        System.out.println("All unique numbers entered:");
        for (int n : numbers) { 
        	System.out.print(n + " ");
        }
    }
}