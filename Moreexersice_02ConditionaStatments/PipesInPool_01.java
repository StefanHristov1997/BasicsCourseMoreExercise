package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double firstP1 = H * P1;
        double secondP2 = H * P2;

        double waterPool = firstP1 + secondP2;
        double waterPoolPercent = (waterPool / V) * 100;
        double firstP1InPercent = (firstP1 / waterPool) * 100;
        double secondP2InPercent = (secondP2 / waterPool) * 100;

        char percent = '%';
        double overFlows = waterPool - V;

        if (waterPool <= V) {
            System.out.printf("The pool is %.02f%c full. Pipe 1: %.02f%c. Pipe 2: %.02f%c.", waterPoolPercent, percent, firstP1InPercent, percent, secondP2InPercent, percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, overFlows);
        }
    }
}
