package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following info:");

        String fullName = readRequired(keyboard, "Full name: ");
        sb.append(fullName).append("\n\n");

        String billStreet = readRequired(keyboard, "Billing street: ");
        String billCity   = readRequired(keyboard, "Billing City: ");
        String billState  =
        String billZip    =


    }

    private static String readRequired(Scanner keyboard, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = keyboard.nextLine().trim();
            if(!input.isEmpty()) {
                return input;
            }
        }

    }
}
