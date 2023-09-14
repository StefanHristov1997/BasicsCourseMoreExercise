package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String location = "";
        double vacationPrice = 0;

        if (budget <= 1000) {
            place = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    vacationPrice = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    vacationPrice = budget * 0.45;
                    break;
            }
        } else if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    vacationPrice = budget * 0.80;
                    break;
                case "Winter":
                    location = "Morocco";
                    vacationPrice = budget * 0.60;
                    break;
            }
        } else {
            place = "Hotel";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    vacationPrice = budget * 0.90;
                    break;
                case "Winter":
                    location = "Morocco";
                    vacationPrice = budget * 0.90;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f",location,place,vacationPrice);
    }
}
