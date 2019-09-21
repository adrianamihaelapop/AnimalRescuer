package org.fasttrackit;


import java.lang.reflect.Method;

public class Rescuer {

    private String name;
    private double coins;

    public Rescuer(String name, double coins) {
        this.name = name;
        this.coins = coins;
    }

    //public void feedTheAnimal(String animal, double food, String rescuer) {
//
    //    System.out.println(rescuer + " just gave some " + food + "meat" + animal + " result decrease in hunger level");
    //}
    public void feedTheAnimal(Animal x) {

        //     Animal y = new Animal( 2,6,8);
        //     y = x;
        //   int z = x.getHungerLevel();
        //   z = z - 1;
        //   x.setHungerLevel(z);

        x.setHungerLevel(x.getHungerLevel() - 1);
        System.out.println(x.getHungerLevel() + " the new hunger level. ");


    }


    public void caressedTheAnimal(Animal x) {
        x.setNeedForGames(x.getNeedForGames() - 1);
        System.out.println(x.getNeedForGames() + " new need for games level. ");
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
