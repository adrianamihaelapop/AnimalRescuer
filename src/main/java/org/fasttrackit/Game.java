package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game<avabileActivity, availableActivities> {

    // has a relationship.

    private Animal animal;
    private Veterinarian veterinarian;
    private Rescuer rescuer;

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

    public void start() {
        initFood();
        initActivities();
        showFoods();
        showsActivity();
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

}
