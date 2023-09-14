package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String duringTime = scanner.nextLine();

        double price = 0;

        if (duringTime.equals("day") && n < 20) {
            price = 0.70 + (n * 0.79);
            System.out.printf("%.2f", price);
        } else if (duringTime.equals("night") && n < 20) {
            price = 0.70 + (n * 0.90);
            System.out.printf("%.2f", price);
        } else if (duringTime.equals("day") && n < 100) {
            price = n * 0.09;
            System.out.printf("%.2f", price);
        } else if (duringTime.equals("night") && n < 100) {
            price = n * 0.09;
            System.out.printf("%.2f", price);
        } else {
            price = n * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}
