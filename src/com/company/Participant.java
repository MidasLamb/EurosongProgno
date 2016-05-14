package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Midas on 14/05/2016.
 */
public class Participant {
    public Participant(File file){
        this.file = file;
        String[] split = file.getName().split("\\.");
        this.name = split[0];
        list = new ParticipantList(file, this);
    }

    private String name;
    private File file;
    private ParticipantList list;
    private double score;

    @Override
    public String toString(){
        return name;
    }

    public int getListLength(){
        return this.list.getLength();
    }

    public void calculateScore(ResultList resultList){
        score = this.list.getScoreBasedOn(resultList);
    }

    public double getScore(){
        return score;
    }

    public String getName(){
        return name;
    }

}
