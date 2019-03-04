package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] merge1 = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, merge1, 0, array1.length);
        System.arraycopy(array2, 0, merge1, array1.length, array2.length);

        return merge1;
    }



    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] result = new Integer[array.length];

        for(int i = 0; i < array.length; i++){
          result [(i+(array.length-index)) % array.length ] = array[i];
        }

        return result;


    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {



        int n = array1.length;
        int a2 = array2.length;
        Integer numberOfOccurences = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i].equals(valueToEvaluate)) {
                numberOfOccurences = numberOfOccurences + 1;

            }

        }
        for (int i = 0; i < a2; i++) {
            if (array2[i].equals(valueToEvaluate)) {
                count = count + 1;
            }
        }
        numberOfOccurences=numberOfOccurences+count;
        return numberOfOccurences;

    }




    public Integer mostCommon(Integer[] array) {

        int count = 1, tempCount;
        int popular = array[0];
        int temp = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            temp = array[i];
            tempCount = 0;
            for (int j = 1; j < array.length; j++) {
                if (temp == array[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }


}


