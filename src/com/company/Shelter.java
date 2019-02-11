package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animals;
    private Animal foundAnimal;
    private IDNumber idNumber = new IDNumber();
    private int bank;


    public Shelter() {
        this.animals = new ArrayList<Animal>();
        this.bank = 150000;
    }

    public void decreaseBy5000(){
        bank-=5000;
        System.out.println("The bank balance is:  " + this.bank);
    }

    public void addBy5000(){
        bank+=5000;
        System.out.println("The bank balance is:  " + this.bank);
    }

    //TODO Work on editing animal.
//    public void editAnimal(Animal animal){
//        System.out.println("Would you like");
//
//        Animal foundAnimal
//    }

    public void animalsByStatus(String status){
        for (int i = 0; i < animals.size(); i++) {
            if(status.equalsIgnoreCase(animals.get(i).getStatus())){
                System.out.println("Below are the animals with a status: ");
                animals.get(i).printDetails();
            } else {
                System.out.println("Sorry.  We couldn't find any animals with that status.");
            }
        }
    }

    public void animalsByLengthOfStay(){
        System.out.println("The animals that have been here 6 months or longer are: ");
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).getLengthOfStay() >= 6) {
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
        if(animals.size() < 75  && this.bank > 5000) {
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
