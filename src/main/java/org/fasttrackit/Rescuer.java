package org.fasttrackit;



public class Rescuer {

    String name;
    double coins;

    public  Rescuer (String name, double coins) {
        this.name = name;
        this.coins = coins;
    }

    public  void  feedTheAnimal (String animalName, double hungerLevel, String meat ) {

        System.out.println( name + " just gave some " + meat + animalName + " result " + hungerLevel + " decrease in hunger level" ); }


    public void caressedTheAnimal ( String animalName, double needToBeCaressed){
        System.out.println( animalName + " just gave some joy activity is now purring and feel much happier. His need to be caressed was at level " + needToBeCaressed );
    }


}
