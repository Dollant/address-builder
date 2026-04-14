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
        String billCity = readRequired(keyboard, "Billing City: ");
        String billState = readState(keyboard, "Billing State: ");
        String billZip = readZip(keyboard, "Billing Zip (5 digits): ");

        sb.append("Billing Address:\n");
        sb.append(billStreet).append("\n");
        sb.append(billCity).append(", ").append(billState).append(" ").append(billZip).append("\n\n");

        String shipStreet = readRequired(keyboard, "Shipping Street: ");
        String shipCity = readRequired(keyboard, "Shipping City: ");
        String shipState = readState(keyboard, "Shipping State (2 letters): ");
        String shipZip = readZip(keyboard, "Shipping Zip (5 digits): ");

        sb.append("Shipping Address:\n");
        sb.append(shipStreet).append("\n");
        sb.append(shipCity).append(", ").append(shipState).append(" ").append(shipZip);

        System.out.println("\nCustomer Information");
        System.out.println(sb.toString());
    }

    private static String readRequired(Scanner keyboard, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = keyboard.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be blank. T_T\nPlease try again!.\n");
        }
    }

    private static String readState(Scanner keyboard, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = keyboard.nextLine().trim().toUpperCase();
            if (input.matches("[A-Z]{2}")) {
                return input;
            }
            System.out.println("State must be EXACTLY 2 letters! (e.g., TX). Please try again. ^-^\n");
        }
    }

    private static String readZip(Scanner keyboard, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = keyboard.nextLine().trim();
            if (input.matches("\\d{5}")) {
                return input;
            }
            System.out.println("Zip must be exactly 5 digits. Please try again.\n");
        }
    }
}