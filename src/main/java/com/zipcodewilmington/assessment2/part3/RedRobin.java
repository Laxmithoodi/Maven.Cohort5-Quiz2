package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return "red";
    }

    public RedRobin() {

        this.setMigrationMonth("August");
        this.getMigrationMonth();
    }
}
