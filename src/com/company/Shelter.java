package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animals;

    public Shelter(ArrayList<Animal> animals) {
        this.animals = new ArrayList<Animal>();
    }

    public void showAllAnimals(){
        for (Animal animals: animals){
            animals.printDetails();
        }
    }

    public void addAnAnimal(Animal animal){
        animals.add(animal);
        System.out.println("You've added a(n) to the shelter:  " + animal.getName());
        System.out.println(animals.size());
    }

    public void removeAnimal(String idNumber){
        for (int i = 0; i < animals.size(); i++){
            if (idNumber.equalsIgnoreCase(animals.get(i).getIdNumber())){
                System.out.println("You just removed an animal from the shelter.  The information is:  ");
                Animal removedAnimal = animals.remove(i);
                showAllAnimals();
            } else {
                System.out.println("Sorry.  Couldn't find that animal in the shelter.");
            }
        }
    }

}
