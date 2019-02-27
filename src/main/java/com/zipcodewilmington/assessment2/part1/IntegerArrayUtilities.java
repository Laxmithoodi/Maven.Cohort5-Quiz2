package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public Integer[] range(int start, int stop) {



        return null;
    }





    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0]+array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {



        return array[0]*array[1];
    }
}
