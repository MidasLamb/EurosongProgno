package com.company;

/**
 * Created by Midas on 14/05/2016.
 */
public class Country {
    public Country(int number, String name){
        this.numberInSequence = number;
        this.name = name;
    }

    private int numberInSequence;
    private String name;

    @Override
    public String toString(){
        return name + " (" + numberInSequence + ") ";
    }
}
