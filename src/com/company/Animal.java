package com.company;

public class Animal {

    private int idNumber;
    private String name;
    private String typeOfAnimal;
    private String breed;
    private String color;
    private String age;
    private String arrivalDate;
    private String status;
    private String lengthOfStay;

    public Animal(String name, String typeOfAnimal, String breed, String color, String age,
                  String arrivalDate, String status, String lengthOfStay) {
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = status;
        this.lengthOfStay = lengthOfStay;
    }

    public void printDetails() {
        System.out.println("The animal ID number is: " + this.idNumber +
                "\nThe animal name is: " + this.name +
                "\nThe type of animal is:  " + this.typeOfAnimal +
                "\nThe breed of the animal is:  " + this.breed +
                "\nThe color of the animal is:  " + this.color +
                "\nThe age of the animal is:  " + this.age +
                "\nThe arrival date of the animal is:  " + this.arrivalDate +
                "\nThe status of the animal is:  " + this.status +
                "\nThe length of stay is:  " + this.lengthOfStay + " months.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", typeOfAnimal='" + typeOfAnimal + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", status='" + status + '\'' +
                ", lengthOfStay=" + lengthOfStay +
                '}';
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(String lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
}
