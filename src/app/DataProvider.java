package app;

import java.util.Scanner;

public class DataProvider {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        int count;
        while (true) {
            System.out.print("How many words do you want to enter? ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: enter a number.");
                scanner.nextLine();
                continue;
            }

            count = scanner.nextInt();
            scanner.nextLine();

            if (count <= 0) {
                System.out.println("Error: number must be greater than 0.");
                continue;
            }

            break;
        }

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.print("Enter your word " + (i + 1) + ": ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Error: text cannot be empty.");
                    continue;
                }

                if (input.matches(".*\\d.*")) {
                    System.out.println("Numbers are not allowed");
                    continue;
                }

                words[i] = input;
                break;
            }
        }

        return words;
    }
}