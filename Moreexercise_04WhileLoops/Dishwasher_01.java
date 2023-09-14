package Moreexercise_04WhileLoops;

import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int preparats = Integer.parseInt(scanner.nextLine());
        int quantity = preparats * 750;
        int dishes = 0;
        int dishesCount = 0;
        int allDishes = 0;
        int allTengers = 0;
        boolean isNotEnought = false;

        while (quantity >= 0) {
            String command = scanner.nextLine();
            dishesCount++;
            if (command.equals("End")) {
                break;
            } else if (dishesCount % 3 == 0) {
                dishes = Integer.parseInt(command);
                allTengers = allTengers + dishes;
                quantity = quantity - (dishes * 15);
            } else {
                dishes = Integer.parseInt(command);
                allDishes = allDishes + dishes;
                quantity = quantity - (dishes * 5);
            }
            if (quantity < 0){
                isNotEnought = true;
            }
        }
        if(isNotEnought){
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(quantity));
        }else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",allDishes,allTengers);
            System.out.printf("Leftover detergent %d ml.",quantity);
        }
    }
}