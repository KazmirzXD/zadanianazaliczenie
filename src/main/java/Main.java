import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store the 5 numbers
        int sum = 0;
        double average;

        // Input: Get 5 numbers from the user
        System.out.println("Podaj 5 liczb:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum
        for (int number : numbers) {
            sum += number;
        }

        // Calculate average
        average = (double) sum / numbers.length;

        // Output: Display the sum and average
        System.out.println("Suma liczb: " + sum);
        System.out.println("Średnia liczb: " + average);

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}