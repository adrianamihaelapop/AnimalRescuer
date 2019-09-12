package org.fasttrackit;

public class Horse extends DomesticAnimal {
   private String horseBreed;
   private boolean needsNewHorseshoe;

    public Horse(int health, int hunger, int sleep){
        super( health,  hunger,  sleep);
    }

    public void makesSounds(){
        System.out.println("ageuigynaweigy");
    }

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    public boolean isNeedsNewHorseshoe() {
        return needsNewHorseshoe;
    }

    public void setNeedsNewHorseshoe(boolean needsNewHorseshoe) {
        this.needsNewHorseshoe = needsNewHorseshoe;
    }
}
