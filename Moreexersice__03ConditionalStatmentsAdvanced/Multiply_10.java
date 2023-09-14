package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Multiply_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = 0;
        boolean number = true;

        while (number) {
            double number1 = Double.parseDouble(scanner.nextLine());
            if (number1 < 0) {
                System.out.println("Negative number!");
                number = false;
                break;
            }
            result = number1 * 2;
            System.out.printf("Result: %.2f\n", result);
        }
    }
}
