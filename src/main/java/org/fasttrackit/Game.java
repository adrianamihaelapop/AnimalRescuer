package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Animal animal;
    private Veterinarian veterinarian;
    private Rescuer rescuer;
    private Cat cat;
    private Horse horse;
    private JoyActivity activity;

    private List<AnimalFood> availableFoods = new ArrayList<>();
    private JoyActivity[] activities = new JoyActivity[6];
    Scanner scanner = new Scanner(System.in);

    List<AnimalFood> getAvailableFood = new ArrayList<>();

    public Game() {
    }

    private void initFood() {


        for (int i = 0; i < 3; i++) {
            AnimalFood food = new AnimalFood(ThreadLocalRandom.current().nextInt(1, 10), ThreadLocalRandom.current().nextInt(1, 10));
            food.setName(" food" + i);
            availableFoods.add(food);
        }
    }

    public void showFoods() {
        for (int i = 0; i < availableFoods.size(); i++) {
            System.out.println(i + 1 + "" + availableFoods.get(i).getName());

        }
    }

    private void initAnimal() {
        System.out.println("Please type which animal would you like to create and press Enter.");
        String animalName = scanner.nextLine();


        if (animalName.equals("cat")) {
            animal = new Cat(10, 2, 3, "sth");
            animal.setMood(6);
            animal.setFavFood(availableFoods.get(0).getName());
            animal.setFavActivity(activities[3].name);
        } else if (animalName.equals("horse")) {
            animal = new Horse(8, 6, 3);
            animal.setFavFood(availableFoods.get(1).getName());
            animal.setFavActivity(activities[2].name);
        } else {
            animal = new DomesticAnimal(5, 5, 3);
            animal.setFavFood(availableFoods.get(2).getName());
            animal.setFavActivity(activities[4].name);
        }
        System.out.println(animal.getHealthState());
        System.out.println("choose animal's age");
        animal.setAge(scanner.nextInt());
        System.out.println("animal's age is: " + animal.getAge());
    }

    private void nameAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose the animal's name");
        animal.setName(scanner.nextLine());
        System.out.println("animal's name is " + animal.getName());
    }

    public void start() {
        initFood();
        //showFoods();
        initActivities();
        // showsActivity();
        initAnimal();
        nameAnimal();
        initRescuer();


        long t = System.currentTimeMillis();
        long end = t + 15000;
        while (System.currentTimeMillis() < end) {
            requireFeeding();
            requireActivity();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(animal.getMood() + " " + animal.getHungerLevel());


    }


    private void initRescuer() {
        Scanner scanner = new Scanner(System.in);
        rescuer = new Rescuer("test", 30.7);
        System.out.println("type your name: ");

        // what would be an invalid input for name / String?
        try {
            rescuer.setName(scanner.nextLine());
            System.out.println("your name is: " + rescuer.getName());
        } catch (InputMismatchException e) {
            System.out.println("name isn't saved");
        }

        try {
            System.out.println("introduce your age");
            rescuer.age = scanner.nextInt();
            System.out.println("your age is: " + rescuer.age);
        } catch (InputMismatchException e) {
            System.out.println("age must be an int");
            initRescuer();
        }
    }

    private void requireFeeding() {
        showFoods();
        System.out.println("please feed the animal! Choose the food type ");
        Scanner scanner = new Scanner(System.in);
        int userFoodChoice = scanner.nextInt();
        // switch (userFoodChoice) {
        //   case 1:
        rescuer.feedTheAnimal(animal, availableFoods.get(userFoodChoice - 1));
        //}

        //for ()


    }

    private void initActivities() {
        for (int i = 0; i < activities.length; i++) {
            activity = new JoyActivity("activity" + i, ThreadLocalRandom.current().nextDouble());
            activities[i] = activity;
            //System.out.println(activity.name);}
        }

    }

    public void showsActivity() {
        for (int i = 0; i < activities.length; i++) {
            System.out.println(i + 1 + " " + activities[i].name);


        }
    }

    public void requireActivity() {
        showsActivity();
        System.out.println("Please choose animal activity: ");
        Scanner scanner = new Scanner(System.in);
        int userActivityChoice = scanner.nextInt();
        rescuer.caressedTheAnimal(animal, activities[userActivityChoice - 1]);
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
