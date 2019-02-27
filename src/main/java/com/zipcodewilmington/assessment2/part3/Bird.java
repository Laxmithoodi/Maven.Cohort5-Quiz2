package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements  Animal{
    public String move(String fly) {

        return fly;
    }

    public void setMigrationMonth(String expected) {
       // expected = "August";

    }

    public String getMigrationMonth() {
        return null;
    }
}
