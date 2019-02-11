package com.company;

import java.util.Scanner;

public class Start {

    public void appStart(){

        Shelter shelter = new Shelter();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the adoption agency.  What would you like to do today?\n");
        System.out.println("There are some fantastic animals already in our shelter.\n");
        System.out.println("[1] View list of current animals in the shelter.\n");
        System.out.println("[2] Search for animals by ID number.\n");
        System.out.println("[3] Search for animals by their status eg, Available, Adoption Pending, Foster Care, Adopted.\n");
        System.out.println("[4] Add an animal to the shelter.\n");

        userInput = scanner.nextLine();

        switch(userInput){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;

        }

    }
}
