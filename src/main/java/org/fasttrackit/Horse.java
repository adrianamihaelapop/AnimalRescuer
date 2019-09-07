package org.fasttrackit;

public class Horse extends DomesticAnimal {
    String horseBreed;
    boolean needsNewHorseshoe;

    public Horse(int health, int hunger, int sleep){
        super( health,  hunger,  sleep);
    }

    public void makesSounds(){
        System.out.println("ageuigynaweigy");
    }
}
