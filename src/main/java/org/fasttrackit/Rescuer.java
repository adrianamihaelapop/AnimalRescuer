package org.fasttrackit;



public class Rescuer {

   private String name;
   private double coins;

    public  Rescuer (String name, double coins) {
        this.name = name;
        this.coins = coins;
    }

    public  void  feedTheAnimal (String animal, double food, String rescuer) {

        System.out.println( rescuer + " just gave some " + food + "meat" + animal + " result decrease in hunger level" ); }


    public void caressedTheAnimal (String animal, double rescuer){
        System.out.println ( animal + " just gave some joy activity from: " + rescuer +  " is now purring and feel much happier ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }
}
