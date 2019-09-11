package org.fasttrackit;



public class Rescuer {

    String name;
    double coins;

    public  Rescuer (String name, double coins) {
        this.name = name;
        this.coins = coins;
    }

    public  void  feedTheAnimal (Animal animal, AnimalFood food, Rescuer rescuer) {

        System.out.println( rescuer + " just gave some " + food + "meat" + animal + " result decrease in hunger level" ); }


    public void caressedTheAnimal ( Animal animal, Rescuer rescuer){
        System.out.println ( animal + " just gave some joy activity from: " + rescuer +  " is now purring and feel much happier ");
    }


}
