package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        int x =5;

        if(value>x){
            return true;
        }else
        return false;
    }

    public Boolean isLessThan7(Integer value) {
        Integer x = 7;

        if(value < x) {
            return true;
        }else

        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Integer i= 5;
       Integer j =7;


        if(valueToEvaluate>i && valueToEvaluate<j){
            return true;
        }else
        return false;
    }

    public Boolean startsWith(String string, Character character) {

    if ((string.startsWith("character"))){
        return true;
    }else
        return false ;
    }
}
