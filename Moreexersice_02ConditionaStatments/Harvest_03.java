package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine());
        double Y = Double.parseDouble(scanner.nextLine());
        int Z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grape = X * Y;
        double wine = (grape * 0.40) / 2.5;
        double less = Z - wine;
        double more = (wine - Z) / workers;


        if (wine < Z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(less));
        } else {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.printf("\n%.0f liters left -> %.0f liters per person.", Math.ceil(wine - Z), Math.ceil(more));
        }
    }
}