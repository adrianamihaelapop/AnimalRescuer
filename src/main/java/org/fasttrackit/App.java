package org.fasttrackit;

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
        animalFood.expirationDate = 2-7-2020;
        animalFood.value = 500;
        animalFood.stockAvailability = true;

        JoyActivity joyActivity = new JoyActivity();
        joyActivity.mame = "Purring";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Augustus";
        veterinarian.specialization = "Doctor, medical man, catLover";

        Game game = new Game();
        game.rescuer = "the rescuer helps the animal to play";
        game.animal = " guided by the instructions given by the rescuer";
        game.veterinarian = "takes care of the animal in case of an accident";


    }

}
