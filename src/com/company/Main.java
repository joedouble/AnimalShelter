package com.company;

public class Main {

    public static void main(String[] args) {

        Shelter shelter1 = new Shelter();
        Shelter shelter2 = new Shelter();
        Animal dog = new Animal("Joe", "Dog", "Husky", "Black", "4", "10/12/2019", "Available", 7);
        Animal cat = new Animal("Kareem", "Cat", "Longhair", "Calico", "3", "08/02/2019", "Adopted", 4);
        Animal rabbit = new Animal("Nada", "Rabbit", "Longhair", "Calico", "3", "08/02/2019", "Foster Care", 8);



        shelter1.addAnAnimal(dog);
        shelter2.addAnAnimal(rabbit);
        shelter1.addAnAnimal(cat);

        System.out.println("This is bank 1:");
        shelter1.getBank();
        System.out.println("This is bank 2:");
        shelter2.getBank();

    }
}
