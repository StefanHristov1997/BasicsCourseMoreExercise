package Moreexersice_02ConditionaStatments;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());


        if (fuelType.equals("Diesel")) {
            if (quantity < 25) {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            } else {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            }
        } else if (fuelType.equals("Gasoline")) {
            if (quantity < 25) {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            } else {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            }
        } else if (fuelType.equals("Gas")) {
            if (quantity < 25) {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            } else {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
