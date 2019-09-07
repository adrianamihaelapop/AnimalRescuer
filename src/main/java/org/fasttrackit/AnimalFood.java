package org.fasttrackit;


import java.time.LocalDate;

public class AnimalFood {

    String name;
    //String name2;
    int price;
    int quantity;
    boolean stockAvailability;
    LocalDate expirationDate;
    int calories;
    int calciumLevel;
    int protein;
    int fat;
    int carbs;

    public AnimalFood ( int priece, int quantity){
        price = priece;
        this.quantity = quantity;
    }


}

