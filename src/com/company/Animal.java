package com.company;

public class Animal {

    private String idNumber;
    private String name;
    private String typeOfAnimal;
    private String breed;
    private String color;
    private String age;
    private String arrivalDate;
    private String status;
    private int lengthOfStay;

    public Animal(String idNumber, String name, String typeOfAnimal, String breed, String color, String age,
                  String arrivalDate, String status) {
        this.idNumber = idNumber;
        this.name = name;
        this.typeOfAnimal = typeOfAnimal;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = status;
        this.lengthOfStay = 0;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
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

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }
}
