package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Midas on 14/05/2016.
 */
public class ResultListTest {

    @org.junit.Test
    public void testGetScore() throws Exception {
        ResultList res;
        ParticipantList p1, p2;

        res = new ResultList(new File("C:\\Users\\Midas\\Desktop\\Participants\\results.txt"), null);
        p1 = createList(1,2,3);
        p2 = createList(3,2,1);

        System.out.println(p1.getScoreBasedOn(res));
        System.out.println(p2.getScoreBasedOn(res));
        assertTrue(p1.getScoreBasedOn(res) > p2.getScoreBasedOn(res));

        p1 = createList(1,3,2);
        p2 = createList(3,2,1);

        assertTrue(p1.getScoreBasedOn(res) > p2.getScoreBasedOn(res));

        p1 = createList(1,25,26);
        p2 = createList(26,2,3);

        System.out.println(p1.getScoreBasedOn(res));
        System.out.println(p2.getScoreBasedOn(res));
        assertTrue(p1.getScoreBasedOn(res) >= p2.getScoreBasedOn(res));

        p1 = createList(1,24,25,26);
        p2 = createList(26,2,3,4);

        assertTrue(p1.getScoreBasedOn(res) <= p2.getScoreBasedOn(res));

        p1 = createList(1,24,25,26);
        p2 = createList(26,2,3,4);

        assertTrue(p1.getScoreBasedOn(res) <= p2.getScoreBasedOn(res));

        p1 = createList(2);
        p2 = createList(3);

        assertTrue(p1.getScoreBasedOn(res) > p2.getScoreBasedOn(res));

        p1 = createList(1,24,25,26);
        p2 = createList(26,2,3,1);

        System.out.println();
        System.out.println(p1.getScoreBasedOn(res));
        System.out.println(p2.getScoreBasedOn(res));
        assertTrue(p1.getScoreBasedOn(res) <= p2.getScoreBasedOn(res));

        p1 = createList(1,2,25,26);
        p2 = createList(4,2,3,1);

        System.out.println();
        System.out.println(p1.getScoreBasedOn(res));
        System.out.println(p2.getScoreBasedOn(res));
        assertTrue(p1.getScoreBasedOn(res) <= p2.getScoreBasedOn(res));



    }

    private ParticipantList createList(int... list){
        ArrayList<Country> al = new ArrayList<>();
        for (int i = 0; i < list.length; i++){
            Country c = Main.countries.getCountry(list[i]);
            al.add(c);
        }
        return new ParticipantList(al);
    }
}