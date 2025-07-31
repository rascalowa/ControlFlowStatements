import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfNumbers = 0;
        int counter = 1;

         while (counter <= 5) {
             System.out.println("Enter number #" + counter + ":");
             String input = scanner.nextLine();

             try {
                 double number = Double.parseDouble(input);
                 counter++;
                 sumOfNumbers += number;
             } catch (NumberFormatException e) {
                System.out.println("Please enter valid number");
            }
         }

        System.out.println("Sum of the 5 numbers: " + sumOfNumbers);
    }
}