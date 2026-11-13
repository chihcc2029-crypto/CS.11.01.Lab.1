import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        // Set up a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and store their age as an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the minimum pages using the 100 minus age rule
        int minPages = 100 - age;

        // Display the result
        System.out.println(age + "-year olds should read at least " + minPages + " pages before giving up on a book.");

        // Close the scanner
        scanner.close();
    }
}