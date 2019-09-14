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
        animal.setName( " Yiti");
        animal.setHungerLevel( 1-5);
        animal.setNeedForGames( 1-12);
        animal.setNeedForSleep( 13);
        animal.setAge( 1-24);
        animal.setMood( 1-7);
        animal.setFavFood( "Meat and fruits");
        System.out.println( animal.getHealthState() + " " + animal.getHungerLevel() + " " + animal.getNeedForSleep());
        System.out.println( "Animal objet " + animal.toString());

       Cat cat1 = new Cat(4,5,65, "rasa de pisica");
       cat1.setName( "Yiti");
       cat1.setHungerLevel( 1-4);
       cat1.setCatBreed("new cat breed");
        System.out.println(cat1.getCatBreed());


        System.out.println(animal.getHealthState() + " "  + animal.getHungerLevel() + " " + animal.getNeedForSleep());

       Horse horse = new Horse(1,2,3);
       horse.setName ("Felix");
       horse.setHasOwner ( false);
       horse.setVaccinated ( true);
              System.out.println( horse.getHealthState() + " " + horse.getHungerLevel() + " " + horse.getNeedForSleep());


        Rescuer rescuer = new Rescuer ( "Tom", 4000 );
        System.out.println( rescuer.getName() + " " + rescuer.getCoins() );
        rescuer.setName( " Tom ");
        rescuer.setCoins( 5000 );
        rescuer.feedTheAnimal(cat1.getName(), 4.1, "ground beef");
        rescuer.caressedTheAnimal(horse.getName(), 7.8);
        System.out.println( rescuer.getName() + " " + rescuer.getCoins() );

        AnimalFood animalFood = new AnimalFood(200, 7 );
        animalFood.setName( "Meat");
        animalFood.setQuantity( 20 );
        animalFood.setExpirationDate( LocalDate.of(2020, 3, 17 ));
        animalFood.setPrice( 500 );
        animalFood.setStockAvailability(true);
        System.out.println(animalFood.getPrice() + " " + animalFood.getQuantity());

        JoyActivity joyActivity = new JoyActivity(" ping pong", 3);
        joyActivity.mame = "ping pong";
        System.out.println( joyActivity.mame + " " + joyActivity.requiredTimePerActivity);

        Veterinarian veterinarian = new Veterinarian("Augustus", "Veterinarian");
        System.out.println( veterinarian.getName() + "" + " " + veterinarian.getSpecialization());
        veterinarian.diagnoses(horse.getName(), "cancer");


        DomesticAnimal domesticAnimal = new Cat(10, 7, 8, " cat breed " );
        domesticAnimal.setStrength(10);
        domesticAnimal.setFriendly( true);
        domesticAnimal.setVaccinated(true);
                System.out.println( domesticAnimal.getHealthState() + " " + domesticAnimal.getHungerLevel() + " " + domesticAnimal.getNeedForSleep() );

        Game game = new Game(animal, veterinarian, rescuer);
        game.setRescuer ( rescuer);
        game.setAnimal ( animal );
        game.setVeterinarian ( veterinarian );
          System.out.println( game.getRescuer () + animal.getName() +" " + game.getAnimal() + animal.getName() + " " + game.getVeterinarian() + veterinarian.getName());

        System.out.println( " Overriding starts HERE");
        animal.showState();
        domesticAnimal.showState();
        cat1.showState();
        horse.showState();

        System.out.println( "polymorphism");
        Animal domesicAnimal1 = new DomesticAnimal(4, 6, 8);
        Animal cat = new Cat( 5,7,14, "Maine Coon");
        Animal horse1 = new Horse( 4, 3, 1);
       domesicAnimal1.showState();
       cat.showState();
       horse1.showState();
    }



}
