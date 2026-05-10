package app;

import java.util.Scanner;

public class DataProvider {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many words do you want to enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter your words " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        return words;
    }
}