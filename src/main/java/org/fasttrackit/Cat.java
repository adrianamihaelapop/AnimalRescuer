package org.fasttrackit;

public class Cat extends DomesticAnimal {

    private String catBreed;

    public Cat(int health, int hunger, int sleep, String catBreed) {
        super(health, hunger, sleep);
        this.catBreed = catBreed;
    }

    //getter method, setter method
    //getter
    public String getCatBreed() {
        return catBreed;
    }

    //setter
    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public void meow() {
        System.out.println("MEOWWWWWW");
    }

    public void purr() {
        System.out.println("PPURRRRRRR");
    }

    public void showState() {
        System.out.println("Your cat is feeling great! ");
    }
}
