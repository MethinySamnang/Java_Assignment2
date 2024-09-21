import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        while (integers.size() < 5) {
            try {
                System.out.print("Please enter a non-negative integer: ");
                int number = scanner.nextInt();

                // Check for negative numbers
                if (number < 0) {
                    System.out.println("Error: Please enter a non-negative integer.");
                } else {
                    integers.add(number);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Sort the list in ascending order
        Collections.sort(integers);


        System.out.println("The integers in ascending order are: " + integers);

        scanner.close();
    }
}
