package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter myShelter = new Shelter();
        Animal dog = new Animal("Joe", "Dog", "Husky", "Black", "4", "10/12/2019", "Available", 2);
        Animal cat = new Animal("Kareem", "Cat", "Longhair", "Calico", "3", "08/02/2019", "Adopted", 4);

        myShelter.addAnAnimal(dog);

        myShelter.showAllAnimals();

        myShelter.addAnAnimal(cat);

        myShelter.showAllAnimals();

        myShelter.searchByID(1);


    }
}
