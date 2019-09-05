package org.fasttrackit;

import java.lang.reflect.Type;

public class Animal {

   String name;
   double needForSleep;
   double hungerLevel;
   int needForGames;
   boolean needMedicalServices;
   int age;
   int mood;
   String favFood;
   String favActivity;

   // has a relationship.
   AnimalFood animalFood;
   JoyActivity joyActivity;
   Veterinarian veterinarian;
   Rescuer rescuer;
   Game game;

   public double getNeedForSleep (double DurationInHours) {
            return needForSleep;
   }

   public double setNeedForGames( double time ) {
           return time;
   }

   public void setNeedMedicalServices(boolean needMedicalServices ) {
      this.needMedicalServices = needMedicalServices;
   }

   public void setHungerLevel (double food, double meat, double milk, double fruits )




   {

   }


}
