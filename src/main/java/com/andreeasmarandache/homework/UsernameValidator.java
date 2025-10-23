package com.andreeasmarandache.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        boolean usernameValid;
        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            usernameValid = true;
            boolean usernameHasSpace = false;
            boolean usernameHasDigit = false;

            for (int i = 0; i < username.length(); i++) {
                char character = username.charAt(i);
                if (character == ' ') {
                    usernameHasSpace = true;
                    break;
                }
                if (Character.isDigit(character)) {
                    usernameHasDigit = true;
                }
            }

            if (usernameHasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                usernameValid = false;
                continue;
            }

            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                usernameValid = false;
                continue;
            }

            if (!usernameHasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                usernameValid = false;
                continue;
            }

            System.out.println("Username acceptat: " + username);

        } while (!usernameValid);

        scanner.close();
    }
}


