import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter four numbers (or type 'exit' to quit): ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            int number;
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit' to quit.");
                continue;
            }

            if (number < 1000 || number > 9999) {
                System.out.println("Please enter a four-digit number.");
                continue;
            }

            // Extract digits
            int fourthDigit = number % 10;
            int thirdDigit = (number / 10) % 10;
            int secondDigit = (number / 100) % 10;
            int firstDigit = (number / 1000) % 10;


            if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Not lucky number");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
