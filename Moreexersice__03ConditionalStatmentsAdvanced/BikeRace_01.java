package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class BikeRace_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double juniorsMoney = 0;
        double seniorsMoney = 0;
        double allMoney = 0;

        switch (type) {
            case "trail":
                juniorsMoney = juniors * 5.50;
                seniorsMoney = seniors * 7;
                allMoney = juniorsMoney + seniorsMoney;
                break;
            case "cross-country":
                juniorsMoney = juniors * 8;
                seniorsMoney = seniors * 9.50;
                allMoney = juniorsMoney + seniorsMoney;
                if ((juniors + seniors) >= 50) {
                    allMoney = allMoney * 0.75;
                }
                break;
            case "downhill":
                juniorsMoney = juniors * 12.25;
                seniorsMoney = seniors * 13.75;
                allMoney = juniorsMoney + seniorsMoney;
                break;
            case "road":
                juniorsMoney = juniors * 20;
                seniorsMoney = seniors * 21.50;
                allMoney = juniorsMoney + seniorsMoney;
                break;
        }
        allMoney = allMoney * 0.95;

        System.out.printf("%.2f", allMoney);
    }
}

