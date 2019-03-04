package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {

    private Integer input;

   // Integer input =0;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {

        return input % 3 ==0;
    }


    public Boolean isTang() {

        return input % 5 ==0;
    }



    public Boolean isWuTang() {

        return isWu() && isTang() ;
    }


}
