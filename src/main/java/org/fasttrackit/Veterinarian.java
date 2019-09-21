package org.fasttrackit;

public class Veterinarian {

    private String name;
    private String specialization;
    private String workSchedule;
    private boolean worksCheaply;

    public Veterinarian(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void diagnoses(String name, String diagnose) {
        System.out.println(name + " was diagnosed to be ill of " + diagnose);
    }

    public void givesPrescription(String medicine) {
        System.out.println(name + " recommends taking " + medicine);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public boolean isWorksCheaply() {
        return worksCheaply;
    }

    public void setWorksCheaply(boolean worksCheaply) {
        this.worksCheaply = worksCheaply;
    }
}
