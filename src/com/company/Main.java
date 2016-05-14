package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static Countries countries = new Countries();

    public static void main(String[] args) {
        String path = args[0];
        List<Participant> participants = CreateParticipants(path);
        boolean eq = checkForEqualAmountOfGuesses(participants);
        if (!eq){
            System.out.println("Not all list lengths matched.");
            for (Participant p: participants) {
                System.out.println(p.toString() + ": " + p.getListLength());
            }
            return;
        }

        try {
            System.out.println("Please create a file \"results.txt\" in the same folder as your input arguments, then press enter.");
            System.in.read();
        } catch (Exception e){
            e.printStackTrace();
        }
        ResultList results = new ResultList(new File(path + "\\results.txt"), null);


        for (Participant p: participants) {
            p.calculateScore(results);

        }
        participants.sort(new Comparator<Participant>() {
            @Override
            public int compare(Participant o1, Participant o2) {
                return -Double.compare(o1.getScore(), o2.getScore());
            }
        });
        System.out.println("The results are in:");
        int pos = 1;
        for(Participant p: participants){
            System.out.println(pos + ": " + p.getName() + " with " + p.getScore() + " points.");
            pos++;
        }

        System.out.println("Congratulations " + participants.get(0).getName() + "!");

    }


    public static List<Participant> CreateParticipants(String path){
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        ArrayList<Participant> result = new ArrayList<Participant>();
        for (File partFile: listOfFiles) {
            if (!partFile.getName().equals("results.txt"))
                result.add(new Participant(partFile));
        }
        return result;
    }

    public static boolean checkForEqualAmountOfGuesses(List<Participant> parts){
        int check = parts.get(0).getListLength();
        return checkForEqualAmountOfGuessesWith(parts, check);
    }

    public static boolean checkForEqualAmountOfGuessesWith(List<Participant> parts, int check){
        for (Participant p: parts) {
            if (p.getListLength() != check)
                return false;
        }
        return true;
    }
}
