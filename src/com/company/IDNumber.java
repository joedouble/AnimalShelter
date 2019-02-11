package com.company;

public class IDNumber {

    private int idNumber = 0;

    public int incrementer(){
        idNumber++;
        return this.idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
