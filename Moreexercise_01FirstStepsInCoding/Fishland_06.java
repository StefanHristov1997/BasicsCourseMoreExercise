package Moreexercise_01FirstStepsInCoding;

import java.util.Scanner;

public class Fishland_06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());


        double pricePalamud = (priceSkumriq + priceSkumriq * 0.6) * kgPalamud;

        double priceSafrid = (priceCaca + priceCaca * 0.80) * kgSafrid;

        double priceMidi = kgMidi * 7.50;

        double priceForAll = pricePalamud + priceSafrid + priceMidi;

        System.out.printf("%.2f", priceForAll);}
}
