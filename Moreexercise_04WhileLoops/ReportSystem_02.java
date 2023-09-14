package Moreexercise_04WhileLoops;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int paymentsCount = 1;

        int sumOfCash = 0;
        int sumOfCard = 0;

        int countCashPayments = 0;
        int countCardPayments = 0;
        boolean isMoneyEnough = false;

        while (!command.equals("End")) {
            int priceProduct = Integer.parseInt(command);

            if (paymentsCount % 2 != 0) {
                if (priceProduct > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    countCashPayments++;
                    sumOfCash += priceProduct;
                    System.out.println("Product sold!");
                }
            } else {
                if (priceProduct < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    countCardPayments++;
                    sumOfCard += priceProduct;
                    System.out.println("Product sold!");
                }
            }

            if (sumOfCash >= sum || sumOfCard >= sum) {
                isMoneyEnough = true;
                break;
            }

            paymentsCount++;
            command = scanner.nextLine();
        }
        double avgCash = 0;
        double avgCard = 0;

        if (countCashPayments > 0 && countCardPayments == 0) {
            avgCash = sumOfCash * 1.0 / countCashPayments;
            avgCard = 0;
        } else if (countCardPayments > 0 && countCashPayments == 0) {
            avgCard = sumOfCard * 1.0 / countCardPayments;
            avgCash = 0;
        } else {
            avgCash = sumOfCash * 1.0 / countCashPayments;
            avgCard = sumOfCard * 1.0 / countCardPayments;
        }


        if (isMoneyEnough) {
            System.out.printf("Average CS: %.2f\n", avgCash);
            System.out.printf("Average CC: %.2f\n", avgCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}

