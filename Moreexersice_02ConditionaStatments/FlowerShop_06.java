package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int magnols = Integer.parseInt(scanner.nextLine());
        int zumbils = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double magnolsPrice = magnols * 3.25;
        double zumbilsPrice = zumbils * 4;
        double rosesPrice = roses * 3.50;
        double cactusPrice = cactus * 8;

        double sumPrice = magnolsPrice + zumbilsPrice + rosesPrice + cactusPrice;
        double finalPrice = sumPrice - (sumPrice * 0.05);

        double diff = Math.abs(finalPrice - present);

        if (finalPrice >= present) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
    }
}
