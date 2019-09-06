package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    {
        Animal animal = new Animal();
        animal.name = "Yiti";
        animal.hungerLevel = 1-5;
        animal.needMedicalServices = true;
        animal.needForGames = 1-12;
        animal.needForSleep = 13;
        animal.age = 1-24;
        animal.favActivity = "Purring";
        animal.mood = 1-7;
        animal.favFood = "Meat and fruits";


        Rescuer rescuer = new Rescuer();
        rescuer.name = "Tom";
        rescuer.coins = 5000;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Meat";
        animalFood.name2 = "milk";
        animalFood.quantity = 20;
        animalFood.expirationDate = LocalDate.of(2020, 03,17);
        animalFood.value = 500;
        animalFood.stockAvailability = true;

        JoyActivity joyActivity = new JoyActivity();
        joyActivity.mame = "Purring";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Augustus";
        veterinarian.specialization = "Doctor, medical man, catLover";




    }

}
