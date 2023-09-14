package Moreexercise_01FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double h1 = (h * 100) - 100;
        h1 = Math.floor(h1 / 70);

        double w2 = Math.floor(w * 100 / 120);
        double workPlaces = h1 * w2 - 3;

        System.out.printf("%.0f", workPlaces);

    }

}

