package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game<avabileActivity, availableActivities> {

    // has a relationship.

    private Animal animal;
    private Veterinarian veterinarian;
    private Rescuer rescuer;
    private Cat cat;
    private Horse horse;

    private List<AnimalFood> availableFoods = new ArrayList<>();
    private JoyActivity[] activities = new JoyActivity[6];



    List<AnimalFood> getAvailableFood = new ArrayList<>();

    private void initFood() {
        for (int i = 0; i < 3; i++) {
            AnimalFood food = new AnimalFood(ThreadLocalRandom.current().nextInt(1, 10), ThreadLocalRandom.current().nextInt(1, 10));
            food.setName(" food" + i);
            availableFoods.add(food);
            // System.out.println(food.getName());
        }

    }

    public void showFoods() {
        for (int i = 0; i < availableFoods.size(); i++) {
            System.out.println(availableFoods.get(i).getName());
        }
    }
    //public String readAnimalName() {
    //    System.out.println("Please type a name for your animal and press Enter.");
    //    Scanner scanner = new Scanner(System.in);
    //    String animalName = scanner.nextLine();
    //    System.out.println("Your vehicle's name is: " +animalName);
    //    return animalName;

    public void start() {
        initFood();
        initActivities();
        showFoods();
        showsActivity();
        initAnimal();
        initRescuer();
    }


    private void initAnimal() {
        Cat cat = new Cat(5, 8, 7, "Maine coon");

    }

    private void initRescuer() {
        Rescuer rescuer = new Rescuer("Tom", 30.7);
        System.out.println("Your name is:");
        String readRescuerName;
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        System.out.println("Your name is: " );
    }

    private void initActivities() {
        for (int i = 0; i < activities.length; i++) {
            JoyActivity activity = new JoyActivity("activity" + i, ThreadLocalRandom.current().nextDouble());
            activities[i] = activity;
            //System.out.println(activity.name);}
        }

    }

    public void showsActivity() {
        for (int i = 0; i < activities.length; i++) {
            System.out.println(activities[i].name);


        }
    }


    public Game(Animal animal, Veterinarian veterinarian, Rescuer rescuer) {
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.rescuer = rescuer;


    }


    {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }
}
