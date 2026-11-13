import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Store the user's input as an integer

        // Apply the general rule, 7 plus half of the user's age
        int minimumAge = 7 + (age / 2);

        // Print out the final result
        System.out.println(age + "-year olds should date somebody who is at least " + minimumAge + " years old.");

        scanner.close();
    }
}
