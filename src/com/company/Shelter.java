package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animals;
    private Animal foundAnimal;
    private IDNumber idNumber = new IDNumber();


    public Shelter() {
        this.animals = new ArrayList<Animal>();
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
        animal.setIdNumber(idNumber.incrementer());
        animals.add(animal);
        System.out.println("You've added a(n) to the shelter:  " + animal.getName());
        System.out.println(animals.size());

    }

    public void removeAnimal(int idNumber) {
        for (int i = 0; i < animals.size(); i++) {
            if (idNumber == animals.get(i).getIdNumber()) {
                Animal removedAnimal = animals.remove(i);
                System.out.println("You just removed an animal from the shelter.  The information is:  " + removedAnimal);
                showAllAnimals();
            } else {
                System.out.println("Sorry.  Couldn't find that animal in the shelter.");
            }
        }
    }

}
