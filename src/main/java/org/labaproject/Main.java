package org.labaproject;

public class Main {
        public static void main(String[] args) {
            UserInput userInput = new UserInput();

            System.out.println("Welcome to the California Travel Planner!");

            String startingCity = userInput.promptCity("Enter the starting city: ");
            String destinationCity = userInput.promptCity("Enter the destination city: ");
            String preferredTransport = userInput.promptTransportationMode();

            userInput.close();

            // Validate and process the user input
            processUserInput(startingCity, destinationCity, preferredTransport);
        }

        private static void processUserInput(String startingCity, String destinationCity, String preferredTransport) {
            // Here, you can invoke your DAO classes to fetch relevant data from the database
            // You can use the startingCity, destinationCity, and preferredTransport variables to query the data
            // Perform further processing based on the retrieved data and user's preferences
            // Implement your business logic here
        }
    }
