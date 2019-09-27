package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
    Scanner scanner = new Scanner(System.in);

    List<AnimalFood> getAvailableFood = new ArrayList<>();

    private void initFood() {

        AnimalFood food = new AnimalFood(ThreadLocalRandom.current().nextInt(1, 10), ThreadLocalRandom.current().nextInt(1, 10));
        for (int i = 0; i < 3; i++) {

            food.setName(" food" + i);
           availableFoods.add(food);
                    }
    }

   public void showFoods() {
       for (int i = 0; i < availableFoods.size(); i++) {
           System.out.println(availableFoods.get(i).getName());

    }}

    private void initAnimal() {
        System.out.println("Please type which animal  would you like to create and press Enter.");
        String animalName = scanner.nextLine();

        if (animalName.equals("cat")) {
            Animal animal = new Cat(1, 2, 3, "sth");
        } else if (animalName.equals("horse")) {
            Animal animal = new Horse(1, 2, 3);
        } else {
            Animal animal = new DomesticAnimal(1, 2, 3);
        }

        System.out.println("choose animal's age");
        animal.setAge(scanner.nextInt());
        System.out.println("animal's age is: " + animal.getAge());
    }

    private void nameAnimal() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("choose the animal's name");
        animal.setName(scanner2.nextLine());
        System.out.println("animal's name is " + animal.getName());
    }

    public void start() {
        // initFood();
        // initActivities();
        // showFoods();
        // showsActivity();
        initAnimal();
        nameAnimal();
        initRescuer();
        requireFeeding();


    }


    private void initRescuer() {
        Scanner scanner1 = new Scanner(System.in);
        Rescuer rescuer = new Rescuer("test", 30.7);
        System.out.println("type your name: ");

        // what would be an invalid input for name / String?
        try {
            rescuer.setName(scanner1.nextLine());
            System.out.println("your name is: " + rescuer.getName());
        } catch (InputMismatchException e) {
            System.out.println("name isn't saved");
        }

        try {
            System.out.println("introduce your age");
            rescuer.age = scanner1.nextInt();
            System.out.println("your age is: " + rescuer.age);
        } catch (InputMismatchException e) {
            System.out.println("age must be an int");
            initRescuer();
        }
    }

    private void requireFeeding() {
        System.out.println("please feed the animal! Choose the food type ");
       // showFoods();
        //for ()


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
