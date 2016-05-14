package com.company;

import java.io.File;
import java.util.List;

/**
 * Created by Midas on 14/05/2016.
 */
public class ResultList extends ParticipantList{
    public ResultList(File file, Participant owner) {
        super(file, owner);
    }

    public int getPositionOf(Country c){
        if (list.contains(c))
            return list.indexOf(c);
        return 0;
    }

    @Override
    public String toString(){
        return "Results";
    }

    public double getScore(ParticipantList pl){


        double score = 0;
        for(int i = 0; i < this.getLength(); i++){
            int position = i;
            List<Country> partList = pl.getList();
            if (partList.contains(list.get(i))){

                int distance = Math.abs(position - partList.indexOf(list.get(i)));
                double positionWeight = this.getWeight(i);
                double distanceCoefficient = getDistanceCoefficient(distance);
                score += 100*positionWeight*distanceCoefficient;
            }
            if (i < partList.size() && partList.contains(list.get(i)))
                score += 20;
        }

        if (pl.hasOwner() && pl.getOwner().getName().equals("Jordi"))
            score = score/3;

        return score;
    }

    private double getDistanceCoefficient(int dist){
        if (dist == 0){
            return 1.4;
        }
        double t = 1 / (1 + Math.exp(dist-3));
        if (t < 0)
            return 0;
        return t;
    }

    private double getWeight(double x){
        return 1/(x + 1);
    }



}
