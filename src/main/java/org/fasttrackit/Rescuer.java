package org.fasttrackit;


import java.lang.reflect.Method;
import java.util.Scanner;

public class Rescuer {

    private String name;
    private double coins;
    public int age;

    public Rescuer(String name, double coins) {
        this.name = name;
        this.coins = coins;
    }

    public String readAnimalName() {
        System.out.println("Please type a name for your animal and press Enter.");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        System.out.println("Your vehicle's name is: " + animalName);
        return animalName;
    }
        public void feedTheAnimal(String animal, double food, String rescuer) {

            System.out.println(rescuer + " just gave some " + food + "meat" + animal + " result decrease in hunger level");
        }
        public void feedTheAnimal (Animal x, AnimalFood y){



            x.setHungerLevel(x.getHungerLevel() - 1);
            System.out.println(x.getHungerLevel() + " the new hunger level. ");

            if (x.getFavFood() == y.getName()) {
                x.setMood(x.getMood() + 1);
            }
            System.out.println(x.getMood() + " new happiness level ");


        }


        public void caressedTheAnimal (Animal x, JoyActivity y){
            x.setNeedForGames(x.getNeedForGames() - 1);
            System.out.println(x.getNeedForGames() + " new need for games level. ");
            if (x.getFavActivity() == y.name) {
                x.setMood(x.getMood() + 2);

            } else {
                x.setMood(x.getMood() + 1);
            }
            System.out.println(x.getMood() + " happiness level changed");
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getCoins () {
            return coins;
        }

        public void setCoins ( double coins){
            this.coins = coins;
        }

    }
