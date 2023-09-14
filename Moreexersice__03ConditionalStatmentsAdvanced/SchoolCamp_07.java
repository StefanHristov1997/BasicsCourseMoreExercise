package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double price = 0;

        switch (season) {
            case "Winter":
                switch (group) {
                    case "boys":
                        sport = "Judo";
                        price = (nights * students) * 9.60;
                        break;
                    case "girls":
                        sport = "Gymnastics";
                        price = (nights * students) * 9.60;
                        break;
                    case "mixed":
                        sport = "Ski";
                        price = (nights * students) * 10;
                        break;
                }
                break;
            case "Spring":
                switch (group) {
                    case "boys":
                        sport = "Tennis";
                        price = (nights * students) * 7.20;
                        break;
                    case "girls":
                        sport = "Athletics";
                        price = (nights * students) * 7.20;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        price = (nights * students) * 9.50;
                        break;
                }
                break;
            case "Summer":
                switch (group) {
                    case "boys":
                        sport = "Football";
                        price = (nights * students) * 15;
                        break;
                    case "girls":
                        sport = "Volleyball";
                        price = (nights * students) * 15;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        price = (nights * students) * 20;
                        break;
                }
                break;
        }
        if (students >= 10 && students < 20) {
            price = price * 0.95;
        } else if (students >= 20 && students < 50) {
            price = price * 0.85;
        } else if (students >= 50) {
            price = price * 0.50;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
