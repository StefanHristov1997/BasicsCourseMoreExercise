package Moreexercise_04WhileLoops;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int countForC = 0;
        int countForN = 0;
        int countFor0 = 0;

        StringBuilder word = new StringBuilder();

        while (!command.equals("End")) {
            char letter = command.charAt(0);

            if (Character.isLetter(letter)) {

                if (letter == 'c') {
                    if (countForC > 0) {
                        word.append(letter);
                    } else {
                        countForC++;
                        if (countForC > 0 && countFor0 > 0 && countForN > 0) {
                            System.out.print(word + " ");
                            countForC = 0;
                            countForN = 0;
                            countFor0 = 0;
                            word.delete(0, word.length());
                        }

                        command = scanner.nextLine();
                        continue;

                    }

                } else if (letter == 'n') {
                    if (countForN > 0) {
                        word.append(letter);
                    } else {
                        countForN++;
                        if (countForC > 0 && countFor0 > 0 && countForN > 0) {
                            System.out.print(word + " ");
                            countForC = 0;
                            countForN = 0;
                            countFor0 = 0;
                            word.delete(0, word.length());
                        }

                        command = scanner.nextLine();
                        continue;
                    }

                } else if (letter == 'o') {
                    if (countFor0 > 0) {
                        word.append(letter);
                    } else {
                        countFor0++;
                        if (countForC > 0 && countFor0 > 0 && countForN > 0) {
                            System.out.print(word + " ");
                            countForC = 0;
                            countForN = 0;
                            countFor0 = 0;
                            word.delete(0, word.length());
                        }
                        command = scanner.nextLine();
                        continue;
                    }
                } else {
                    word.append(letter);
                }
            } else {
                command = scanner.nextLine();
                continue;
            }
            command = scanner.nextLine();
        }
    }
}
