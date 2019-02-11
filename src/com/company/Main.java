package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter myShelter = new Shelter();
        Animal dog = new Animal("Joe", "Dog", "Husky", "Black", "4", "10/12/2019", "Available", 7);
        Animal cat = new Animal("Kareem", "Cat", "Longhair", "Calico", "3", "08/02/2019", "Adopted", 4);
        Animal rabbit = new Animal("Nada", "Rabbit", "Longhair", "Calico", "3", "08/02/2019", "Foster Care", 8);



        myShelter.addAnAnimal(dog);
        myShelter.addAnAnimal(rabbit);
        myShelter.addAnAnimal(cat);

        myShelter.animalsByStatus("Adopted");

        myShelter.animalsByLengthOfStay();

    }
}
