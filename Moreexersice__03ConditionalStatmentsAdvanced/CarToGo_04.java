package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas = "";
        double carPrice = 0;
        String type = "";

        if (budget <= 100) {
            clas = "Economy class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    carPrice = budget * 0.35;
                    break;
                case "Winter":
                    type = "Jeep";
                    carPrice = budget * 0.65;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            clas = "Compact class";
            switch (season) {
                case "Summer":
                    type = "Cabrio";
                    carPrice = budget * 0.45;
                    break;
                case "Winter":
                    type = "Jeep";
                    carPrice = budget * 0.80;
                    break;
            }
        } else {
            clas = "Luxury class";
            type = "Jeep";
            carPrice = budget * 0.90;
        }

        System.out.printf("%s\n", clas);
        System.out.printf("%s - %.2f", type, carPrice);
    }
}
