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

        Integer[] arr = {index};
        Collections.rotate(Arrays.asList(array), index);
        return arr;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer[] count = new Integer[array1.length + array2.length];




        Map<Integer, Integer> lookup = new HashMap<>();
        for (int key : count) {
            if(lookup.containsKey(key)) {
                lookup.put(key, lookup.get(key) + 1);
            } else {
                lookup.put(key, 1);
            }
        }

        return valueToEvaluate;
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




//        return null;
//    }
//}
