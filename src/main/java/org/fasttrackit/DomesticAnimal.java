package org.fasttrackit;


// is-a relationship.
public class DomesticAnimal extends Animal {
    public DomesticAnimal(int health, int hunger, int sleep){
        super( health,  hunger,  sleep);
    }

  private boolean hasOwner;
  private boolean isVaccinated;
  private int strength;
  private boolean isFriendly;

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }
}


//animale -> animale domestice -> pisici, cai