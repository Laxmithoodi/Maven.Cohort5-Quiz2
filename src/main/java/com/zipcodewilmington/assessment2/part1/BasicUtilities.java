package com.zipcodewilmington.assessment2.part1;


public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {


        return value<=7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
//        Integer i= 5;
//       Integer j =7;
//
//
//        if(valueToEvaluate>=i && valueToEvaluate<=j)
//            return true;
//        else
        return valueToEvaluate >=5 && valueToEvaluate<=7;
    }

    public Boolean startsWith(String string, Character character) {
//        Character ch =  Character.toLowerCase(character);
//
//    if(string.startsWith(String.valueOf(character)))
//        return true;
//
//    else
        String lowercaseString = string.toLowerCase();
        String charlowercase = character.toString().toLowerCase();


        return lowercaseString.startsWith(charlowercase) ;
    }
}
