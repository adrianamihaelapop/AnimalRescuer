package org.fasttrackit;


// is-a relationship.
public class DomesticAnimal extends Animal {
    public DomesticAnimal(int health, int hunger, int sleep){
        super( health,  hunger,  sleep);
    }

    boolean hasOwner;
    boolean isVaccinated;
    int strength;
    boolean isFriendly;



}


//animale -> animale domestice -> pisici, cai