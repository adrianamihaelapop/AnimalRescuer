package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)

    {
        Animal animal = new Animal(5, 8, 9 );
        animal.name = "Yiti";
        animal.hungerLevel = 1-5;
        animal.needForGames = 1-12;
        animal.needForSleep = 13;
        animal.age = 1-24;
        animal.mood = 1-7;
        animal.favFood = "Meat and fruits";

       Cat cat1 = new Cat(4,5,65, "rasa de pisica");
       cat1.name = "Yiti";
       cat1.hungerLevel = 1-4;
       cat1.setCatBreed("new cat breed");
        System.out.println(cat1.getCatBreed());


        System.out.println(animal.healthState + " "  + animal.hungerLevel + " " + animal.needForSleep);

       Horse horse = new Horse(1,2,3);
       horse.name = "Felix";
       horse.hasOwner = false;
       horse.isVaccinated = true;


        Rescuer rescuer = new Rescuer( "Tom", 4000 );
        System.out.println( rescuer.name + " " + rescuer.coins );
        rescuer.name = "Tom";
        rescuer.coins = 5000;
        rescuer.feedTheAnimal(cat1.name, 4.1, "ground beef");
        rescuer.caressedTheAnimal(horse.name, 7.8);
        System.out.println( rescuer.name + " " + rescuer.coins );

        AnimalFood animalFood = new AnimalFood(200, 7 );
        animalFood.name = "Meat";
        //animalFood.name2 = "milk";
        //animalFood.quantity = 20;
        animalFood.expirationDate = LocalDate.of(2020, 03,17);
        animalFood.price = 500;
        animalFood.stockAvailability = true;
        System.out.println(animalFood.price + " " + animalFood.quantity);

        JoyActivity joyActivity = new JoyActivity();
        joyActivity.mame = "ping pong";

        Veterinarian veterinarian = new Veterinarian("Augustus", "Veterinarian");
        System.out.println( veterinarian.name + "" + " " + veterinarian.specialization);


        veterinarian.diagnoses(horse.name, "cancer");




    }

}
