package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hrizantems = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String celebrate = scanner.nextLine();

        double hrizantemsPrice = 0;
        double rosesPrice = 0;
        double laletaPrice = 0;
        double allMoney = 0;
        int flowers = hrizantems + roses + laleta;

        if (celebrate.equals("Y")) {
            switch (season) {
                case "Spring":
                    hrizantemsPrice = hrizantems * 2;
                    rosesPrice = roses * 4.10;
                    laletaPrice = laleta * 2.50;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    allMoney = allMoney + (allMoney * 0.15);
                    if (laleta > 7) {
                        allMoney = allMoney * 0.95;
                    }
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Summer":
                    hrizantemsPrice = hrizantems * 2;
                    rosesPrice = roses * 4.10;
                    laletaPrice = laleta * 2.50;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    allMoney = allMoney + (allMoney * 0.15);
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Autumn":
                    hrizantemsPrice = hrizantems * 3.75;
                    rosesPrice = roses * 4.50;
                    laletaPrice = laleta * 4.15;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    allMoney = allMoney + (allMoney * 0.15);
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Winter":
                    hrizantemsPrice = hrizantems * 3.75;
                    rosesPrice = roses * 4.50;
                    laletaPrice = laleta * 4.15;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    allMoney = allMoney + (allMoney * 0.15);
                    if (roses >= 10) {
                        allMoney = allMoney * 0.90;
                        if (flowers > 20) {
                            allMoney = allMoney * 0.80;
                        }
                    }
                    break;
            }
        } else {
            switch (season) {
                case "Spring":
                    hrizantemsPrice = hrizantems * 2;
                    rosesPrice = roses * 4.10;
                    laletaPrice = laleta * 2.50;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    if (laleta > 7) {
                        allMoney = allMoney * 0.95;
                    }
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Summer":
                    hrizantemsPrice = hrizantems * 2;
                    rosesPrice = roses * 4.10;
                    laletaPrice = laleta * 2.50;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Autumn":
                    hrizantemsPrice = hrizantems * 3.75;
                    rosesPrice = roses * 4.50;
                    laletaPrice = laleta * 4.15;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    if (flowers > 20) {
                        allMoney = allMoney * 0.80;
                    }
                    break;
                case "Winter":
                    hrizantemsPrice = hrizantems * 3.75;
                    rosesPrice = roses * 4.50;
                    laletaPrice = laleta * 4.15;
                    allMoney = hrizantemsPrice + rosesPrice + laletaPrice;
                    if (roses >= 10) {
                        allMoney = allMoney * 0.90;
                        if (flowers > 20) {
                            allMoney = allMoney * 0.80;
                        }
                    }
            }

        }
        allMoney = allMoney + 2;
        System.out.printf("%.2f", allMoney);

    }
}