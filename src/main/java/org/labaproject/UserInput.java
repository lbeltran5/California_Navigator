package org.labaproject;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String promptCity(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public String promptTransportationMode() {
        System.out.print("Preferred mode of transportation (car/transport): ");
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}

