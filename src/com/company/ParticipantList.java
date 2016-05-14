package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Midas on 14/05/2016.
 */
public class ParticipantList {
    public ParticipantList(File file, Participant owner){
        this.owner = owner;
        length = 0;
        list = new ArrayList<Country>();
        stringList = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String nextline = reader.readLine();
            while (nextline != null){
                length++;
                list.add(Main.countries.getCountry(Integer.parseInt(nextline)));
                stringList.add(nextline);
                nextline = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ParticipantList(List<Country> ctries){
        this.list = new ArrayList<>();
        list.addAll(ctries);
    }

    protected ArrayList<Country> list;
    protected ArrayList<String> stringList;
    protected int length;
    protected Participant owner;

    public double getScoreBasedOn(ResultList res){
        return res.getScore(this);
    }


    @Override
    public String toString(){
        if (owner != null)
            return owner.toString() + "'s list";
        else
            return "List";
    }

    public int getLength(){
        return length;
    }

    public int getPositionOf(Country c){
        if (list.contains(c))
            return list.indexOf(c);
        return 0;
    }

    public List<Country> getList(){
        return this.list;
    }

    public boolean hasOwner(){
        return this.owner != null;
    }

    public Participant getOwner(){
        return this.owner;
    }
}
