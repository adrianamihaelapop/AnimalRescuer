package org.fasttrackit;

public class JoyActivity {

    String mame;
    double requiredTimePerActivity;
    Animal animalParticipant;
    Rescuer humanParticipant;

    public JoyActivity (String mame, double requiredTimePerActivity) {
        this.mame = mame;
        this.requiredTimePerActivity = requiredTimePerActivity;
    }

}
