package com.company;

import java.util.Scanner;

public class Start {

    public void appStart() {

        Shelter shelter = new Shelter();
        Scanner scanner = new Scanner(System.in);
        String userInput;
        int userInputInt;
        Animal tempAnimal;

        do {
            System.out.println("Welcome to the adoption agency.  What would you like to do today?\n");
            System.out.println("There are some fantastic animals already in our shelter.\n");
            System.out.println("[1] View list of current animals in the shelter.\n");
            System.out.println("[2] Search for animals by ID number.\n");
            System.out.println("[3] Search for animals by their status eg, Available, Adoption Pending, Foster Care, " +
                    "Adopted.\n");
            System.out.println("[4] Add an animal to the shelter.\n");
            System.out.println("[5] Remove an animal from the shelter.\n");

            userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("You've chosen to view all the animals in the shelter.\n");
                    System.out.println("Here are all the animals:");
                    shelter.showAllAnimals();
                    break;
                case "2":
                    System.out.println("You've chosen to search for an animal by ID.\n");
                    System.out.println("Please enter the ID number of the animal you'd like to view.\n");
                    userInputInt = scanner.nextInt();

                    tempAnimal = shelter.searchByID(userInputInt);

                    System.out.println("Would you like to edit this animal? [Y] or [N]\n");
                    userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("y")) {
                        shelter.editAnimal(tempAnimal);
                    }

                    break;
                case "3":
                    System.out.println("You've chosen to search for a(n) animal(s) by its status.\n");
                    System.out.println("Please enter the status of the animal eg, Available, Adoption Pending, Foster " +
                            "Care, Adopted\n");
                    userInput = scanner.nextLine();

                    shelter.animalsByStatus(userInput);

                    break;
                case "4":
                    shelter.addAnAnimal();

                    break;
                case "5":
                    System.out.println("Here are all of the animals in the shelter.\n");
                    shelter.showAllAnimals();
                    System.out.println("Please enter the ID number of the animal you'd like to remove.\n");
                    userInputInt = scanner.nextInt();

                    shelter.removeAnimal(userInputInt);

                    break;

            }
        } while (true);
    }
}
