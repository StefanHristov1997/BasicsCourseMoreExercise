package Moreexersice__03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class Match_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticket = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (ticket.equals("VIP")) {
            ticketPrice = 499.99;
        } else if (ticket.equals("Normal")) {
            ticketPrice = 249.99;
        }

        double transport = 0;

        if (people >= 1 && people <= 4) {
            transport = budget - (budget * 0.75);
        } else if (people >= 5 && people <= 9) {
            transport = budget - (budget * 0.60);
        } else if (people >= 10 && people <= 24) {
            transport = budget - (budget * 0.50);
        } else if (people >= 25 && people <= 49) {
            transport = budget - (budget * 0.40);
        } else {
            transport = budget - (budget * 0.25);
        }

        double result = people * ticketPrice;

        if (result <= transport) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(result - transport));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(result - transport));
        }
    }
}


