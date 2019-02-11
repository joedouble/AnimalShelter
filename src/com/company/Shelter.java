package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Shelter {

    private ArrayList<Animal> animals;
    private Animal foundAnimal;
    private IDNumber idNumber = new IDNumber();
    private int bank;
    private Scanner scanner = new Scanner(System.in);
    private String userInput;
    private int userInputInt;


    public Shelter() {
        this.animals = new ArrayList<Animal>();
        this.bank = 150000;
    }

    public void decreaseBy5000() {
        bank -= 5000;
        System.out.println("The bank balance is:  " + this.bank);
    }

    public void addBy5000() {
        bank += 5000;
        System.out.println("The bank balance is:  " + this.bank);
    }

    public void editAnimal(Animal animal) {
        animal.printDetails();
        System.out.println("what value would you like to edit of this animal.\n" +
                "[1] Name\n" +
                "[2] Breed\n" +
                "[3] Color\n" +
                "[4] Age\n" +
                "[5] Status\n");
        userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                System.out.println("What would you like the new name to be?");
                userInput = scanner.nextLine();
                animal.setName(userInput);
                System.out.println("The animal has been updated.  The new name is:  " + animal.getName());
                break;
            case "2":
                System.out.println("What is the breed of the animal?");
                userInput = scanner.nextLine();
                animal.setBreed(userInput);
                System.out.println("The animal has been updated.  The new breed is:  " + animal.getBreed());
                break;
            case "3":
                System.out.println("What is the color of the animal?");
                userInput = scanner.nextLine();
                animal.setColor(userInput);
                System.out.println("The animal has been updated.  The new name is:  " + animal.getColor());
                break;
            case "4":
                System.out.println("What is the age of the animal?");
                userInput = scanner.nextLine();
                animal.setAge(userInput);
                System.out.println("The animal has been updated.  The new name is:  " + animal.getAge());
                break;
            case "5":
                System.out.println("What is the status of the animal? eg, Available, Adoption Pending, Foster Care, " +
                        "Adopted.");
                userInput = scanner.nextLine();
                animal.setStatus(userInput);
                System.out.println("The animal has been updated.  The new status is:  " + animal.getStatus());
                break;
            default:
                System.out.println("We couldn't find that selection. Please try again.");
                break;
        }

    }

    public void animalsByStatus(String status) {
        for (int i = 0; i < animals.size(); i++) {
            if (status.equalsIgnoreCase(animals.get(i).getStatus())) {
                System.out.println("Below are the animals with a status: ");
                animals.get(i).printDetails();
            } else {
                System.out.println("Sorry.  We couldn't find any animals with that status.");
            }
        }
    }

    public void animalsByLengthOfStay() {
        System.out.println("The animals that have been here 6 months or longer are: ");
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getLengthOfStay() >= 6) {
                animals.get(i).printDetails();
            }
        }
    }


    public Animal searchByID(int idNumber) {
        for (int i = 0; i < animals.size(); i++) {
            if (idNumber == animals.get(i).getIdNumber()) {
                System.out.println("Here's the animal you're looking for:  ");
                foundAnimal = animals.get(i);
                showAllAnimals();
            } else {
                System.out.println("Sorry.  Couldn't find that animal in the shelter.");
            }

        }
        return foundAnimal;
    }

    public void showAllAnimals() {
        for (Animal animals : animals) {
            animals.printDetails();
        }
    }

    public void addAnAnimal(Animal animal) {

        //TODO Need to figure out why this isn't working as expected.  (Off by one)
        if (animals.size() < 75 && this.bank > 5000) {
            System.out.println("The size of the array is:  " + animals.size());
            animal.setIdNumber(idNumber.incrementer());
            animals.add(animal);
            System.out.println("You've added a(n) to the shelter:  " + animal.getName());
            System.out.println("The new size of the array is " + animals.size());
            System.out.println(animals);
            decreaseBy5000();
        } else {
            System.out.println("We're out of space.  We can't take any more animals.");
        }

    }

    public void removeAnimal(int idNumber) {
        for (int i = 0; i < animals.size(); i++) {
            if (idNumber == animals.get(i).getIdNumber()) {
                Animal removedAnimal = animals.remove(i);
                System.out.println("You just removed an animal from the shelter.  The information is:  " + removedAnimal);
                showAllAnimals();
                addBy5000();
            } else {
                System.out.println("Sorry.  Couldn't find that animal in the shelter.");
            }
        }
    }

    public int getBank() {
        System.out.println(this.bank);
        return this.bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }
}
