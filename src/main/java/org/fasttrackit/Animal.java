package org.fasttrackit;

import java.lang.reflect.Type;

public class Animal
{

  private String name;
  private int age;
  private int healthState;
  private int hungerLevel;
  private int needForSleep;
  private int mood;
  private String favFood;
  private int needForGames;


   public Animal(int health, int hunger, int sleep){
   healthState = health;
   hungerLevel = hunger;
   needForSleep = sleep;
}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getHealthState() {
      return healthState;
   }

   public void setHealthState(int healthState) {
      this.healthState = healthState;
   }

   public int getHungerLevel() {
      return hungerLevel;
   }

   public void setHungerLevel(int hungerLevel) {
      this.hungerLevel = hungerLevel;
   }

   public int getNeedForSleep() {
      return needForSleep;
   }

   public void setNeedForSleep(int needForSleep) {
      this.needForSleep = needForSleep;
   }

   public int getMood() {
      return mood;
   }

   public void setMood(int mood) {
      this.mood = mood;
   }

   public String getFavFood() {
      return favFood;
   }

   public void setFavFood(String favFood) {
      this.favFood = favFood;
   }

   public int getNeedForGames() {
      return needForGames;
   }

    public void setNeedForGames(int needForGames) {
      this.needForGames = needForGames;
   }


   public void animalJoyActivity ( ) {
       System.out.println( " Meooowaw");
   };

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthState=" + healthState +
                ", hungerLevel=" + hungerLevel +
                ", needForSleep=" + needForSleep +
                ", mood=" + mood +
                ", favFood='" + favFood + '\'' +
                ", needForGames=" + needForGames +
                '}';
    }
    public void showState () {
        System.out.println( "Animal is feeling great! .. too great");
    }

}
