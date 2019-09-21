package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game<avabileActivity, availableActivities> {

    // has a relationship.

    private Animal animal;
    private Veterinarian veterinarian;
    private Rescuer rescuer;
    private List<AnimalFood> availableFood;
    private JoyActivity[] availableActivities;

    List<AnimalFood> getAvailableFood = new ArrayList<>();
  //  private void initFood (List<AnimalFood> food1 food2, food3 )
    JoyActivity[] availableActivity =new JoyActivity[5];



    {}

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
