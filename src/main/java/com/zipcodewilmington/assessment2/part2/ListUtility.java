package com.zipcodewilmington.assessment2.part2;

import org.h2.util.StringUtils;

import java.util.List;
import java.util.StringJoiner;

public class ListUtility {
    public Boolean add(int i) {


        for(int j=0; j < i; j++) {

               j = i;

                return true;
            }


        return false;
    }

    public Integer size() {
        return null;
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
       // String join = StringUtils.join(joinList, "+");
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("");
        String joined = joiner.toString();
        return joined;
    }

    public Integer mostCommon() {
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
        return null;
    }
}
