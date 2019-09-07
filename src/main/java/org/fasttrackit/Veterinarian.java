package org.fasttrackit;

public class Veterinarian {

    String name;
    String specialization;
    String workSchedule;
    boolean worksCheaply;

    public Veterinarian ( String name, String specialization) {
        this.name = name;
        this.specialization =specialization;   }

    public void diagnoses (String name, String diagnose){
        System.out.println(name + " was diagnosed to be ill of " +  diagnose);
    }

    public void givesPrescription ( String medicine){
        System.out.println(name + " recommends taking " + medicine);
    }

}
