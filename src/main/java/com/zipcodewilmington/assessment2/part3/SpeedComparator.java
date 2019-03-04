package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal animal1, Animal animal2) {

        Integer animal1Speed = animal1.getSpeed();
        Integer animal2Speed = animal2.getSpeed();

        return animal2Speed.compareTo(animal1Speed);

//        if (animal1.getSpeed() == animal2.getSpeed()) {
//            return 0;
//        } else if (animal1.getSpeed() > animal2.getSpeed()) {
//            return -1;
//        } else
//            return 1;
    }
}
