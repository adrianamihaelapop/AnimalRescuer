package org.fasttrackit;

import javax.lang.model.element.Name;
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
        System.out.println( animal.healthState + " " + animal.hungerLevel + " " + animal.needForSleep);

       Cat cat = new Cat(4,5,65, "rasa de pisica");
       cat.name = "Yiti";
       cat.hungerLevel = 1-4;
       cat.setCatBreed("new cat breed");
        System.out.println(cat.getCatBreed());


        System.out.println(animal.healthState + " "  + animal.hungerLevel + " " + animal.needForSleep);

       Horse horse = new Horse(1,2,3);
       horse.name = "Felix";
       horse.hasOwner = false;
       horse.isVaccinated = true;
        System.out.println( horse.healthState + " " + horse.hungerLevel + " " + horse.needForSleep);


        Rescuer rescuer = new Rescuer( "Tom", 4000 );
        System.out.println( rescuer.name + " " + rescuer.coins );
        rescuer.name = "Tom";
        rescuer.coins = 5000;
        rescuer.feedTheAnimal ( 4.3, cat, "ground beef");
        rescuer.caressedTheAnimal (horse.name, 7.8);
        System.out.println (rescuer.name + " " + rescuer.coins );

        AnimalFood animalFood = new AnimalFood(200, 7 );
        animalFood.name = "Meat";
        animalFood.quantity = 20;
        animalFood.expirationDate = LocalDate.of(2020, 3,17);
        animalFood.price = 500;
        animalFood.stockAvailability = true;
        System.out.println(animalFood.price + " " + animalFood.quantity);

        JoyActivity joyActivity = new JoyActivity(" ping pong", 3);
        joyActivity.mame = "ping pong";
        System.out.println( joyActivity.mame + " " + joyActivity.requiredTimePerActivity);

        Veterinarian veterinarian = new Veterinarian("Augustus", "Veterinarian");
        System.out.println( veterinarian.name + "" + " " + veterinarian.specialization);
        veterinarian.diagnoses(horse.name, "cancer");


        DomesticAnimal domesticAnimal = new DomesticAnimal(10, 7, 8);
        domesticAnimal.strength = 10;
        domesticAnimal.isFriendly = true;
        domesticAnimal.isVaccinated = true;
        System.out.println( domesticAnimal.healthState + " " + domesticAnimal.hungerLevel + " " + domesticAnimal.needForSleep );

        Game game = new Game(animal, veterinarian, rescuer);
        game.rescuer = rescuer;
        game.animal = animal;
        game.veterinarian = veterinarian;
        System.out.println( game.rescuer.name + " " + game.animal.name + " " + game.veterinarian.name);


    }

}
