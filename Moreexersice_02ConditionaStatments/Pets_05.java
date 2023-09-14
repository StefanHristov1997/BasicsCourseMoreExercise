package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());
        double turtle = Double.parseDouble(scanner.nextLine());

        double dogFood = days * dog;
        double catFood = days * cat;
        double turtleFood = (days * turtle) / 1000;

        double foodForAll = dogFood + catFood + turtleFood;
        double diff = Math.abs(foodLeft - foodForAll);

        if (foodLeft >= foodForAll) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));
        }
    }
}
