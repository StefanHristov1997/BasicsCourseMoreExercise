package Moreexersice_02ConditionaStatments;

import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        double tillHolidays = holidays * 127;
        double workDays = 365 - holidays;
        double tillWorkDays = workDays * 63;
        double fullMinutes = tillHolidays + tillWorkDays;
        double minutesLeft = 30000 - fullMinutes;
        double hours = Math.abs(minutesLeft / 60);
        double minutes = Math.abs(minutesLeft % 60);

        if (fullMinutes > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",Math.floor(hours), minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(hours), minutes);
        }
    }
}
