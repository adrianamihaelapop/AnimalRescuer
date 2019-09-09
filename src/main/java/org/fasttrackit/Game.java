package org.fasttrackit;

public class Game {

    // has a relationship.

    Animal animal;
    Veterinarian veterinarian;
    Rescuer rescuer;

    public Game ( Animal animal, Veterinarian veterinarian, Rescuer rescuer) {
        this.animal = animal;
        this.veterinarian = veterinarian;
        this.rescuer = rescuer;
    }

}
