package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());

        double kmForMonth = 0;
        double kmForSeason = 0;
        double kmAfterRent = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometers <= 5000) {
                    kmForMonth = kilometers * 0.75;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <= 10000) {
                    kmForMonth = kilometers * 0.95;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <=20000){
                    kmForMonth = kilometers * 1.45;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                }
                break;
            case "Summer":
                if (kilometers <= 5000) {
                    kmForMonth = kilometers * 0.90;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <= 10000) {
                    kmForMonth = kilometers * 1.10;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <=20000){
                    kmForMonth = kilometers * 1.45;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                }
                break;
            case "Winter":
                if (kilometers <= 5000) {
                    kmForMonth = kilometers * 1.05;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <= 10000) {
                    kmForMonth = kilometers * 1.25;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                } else if (kilometers <=20000){
                    kmForMonth = kilometers * 1.45;
                    kmForSeason = kmForMonth * 4;
                    kmAfterRent = kmForSeason * 0.90;
                }
                break;
        }
        System.out.printf("%.2f",kmAfterRent);
    }
}
