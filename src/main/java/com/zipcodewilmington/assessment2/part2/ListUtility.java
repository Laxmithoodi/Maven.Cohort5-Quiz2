package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import org.h2.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ListUtility {
    private List<Integer> list = new ArrayList<>();

    public Boolean add(Integer i) {
        return list.add(i);

    }


    public Integer size() {
        return list.size();
    }


    public List<Integer> getUnique() {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer i : list) {
            if (!uniqueList.contains(i))
                uniqueList.add(i);

        }
        return uniqueList;
    }


    public String join() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);

            if (i < list.size() - 1)
                str += ", ";
        }

        return str;
    }


    public Integer mostCommon() {
        Integer common = list.get(0);
        int ccommoncount = countOccurance((common));
        for (Integer curentNUmber : list) {
            int currentCount = countOccurance((curentNUmber));
            if (currentCount > ccommoncount) {
                common = curentNUmber;
                ccommoncount = currentCount;

            }
        }

        return common;
    }

    private int countOccurance(Integer valueToCount) {

        int count = 0;

        for (Integer currentValue : list) {

            if (currentValue == valueToCount) {
                count++;
            }

        }
        return count;

    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }

}