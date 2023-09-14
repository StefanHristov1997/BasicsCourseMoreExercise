package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class FuelTankPart2_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gasPrice = 0.93;
        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;
        double tankPrice = 0;

        if (card.equals("Yes")) {
            switch (fuel) {
                case "Gas":
                    gasPrice = gasPrice - 0.08;
                    tankPrice = quantity * gasPrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
                case "Gasoline":
                    gasolinePrice = gasolinePrice - 0.18;
                    tankPrice = quantity * gasolinePrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
                case "Diesel":
                    dieselPrice = dieselPrice - 0.12;
                    tankPrice = quantity * dieselPrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
            }
        } else {
            switch (fuel) {
                case "Gas":
                    tankPrice = quantity * gasPrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
                case "Gasoline":
                    tankPrice = quantity * gasolinePrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
                case "Diesel":
                    tankPrice = quantity * dieselPrice;
                    if (quantity > 20 && quantity <= 25) {
                        tankPrice = tankPrice - (tankPrice * 0.08);
                    } else if (quantity > 25) {
                        tankPrice = tankPrice - (tankPrice * 0.10);
                    }
                    break;
            }
        }
        System.out.printf("%.2f lv.", tankPrice);
    }
}