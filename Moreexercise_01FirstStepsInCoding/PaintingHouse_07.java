package Moreexercise_01FirstStepsInCoding;

import java.util.Scanner;

public class PaintingHouse_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());


        double side1 = 2 * (x * y) - 2 * (1.5 * 1.5);
        double side2 = 2 * (x * x) - (1.2 * 2);
        double allSide = (side1 + side2) / 3.4;

        double roof1 = (x * y) * 2;
        double roof2 = (x * h/2) * 2;
        double allRoof = (roof1 + roof2) / 4.3;

        System.out.printf("%.2f %n%.2f" , allSide , allRoof);

    }
}
