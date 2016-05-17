package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Midas on 14/05/2016.
 */
public class Countries {
    public Countries(){
        countrylist.put(1,new Country(1, "Belgium"));
        countrylist.put(2,new Country(2, "Czech Republic"));
        countrylist.put(3,new Country(3, "Netherlands"));
        countrylist.put(4,new Country(4, "Azerbaijan"));
        countrylist.put(5,new Country(5, "Hungary"));
        countrylist.put(6,new Country(6, "Italy"));
        countrylist.put(7,new Country(7, "Israel"));
        countrylist.put(8,new Country(8, "Bulgaria"));
        countrylist.put(9,new Country(9, "Sweden"));
        countrylist.put(10,new Country(10, "Germany"));
        countrylist.put(11,new Country(11, "France"));
        countrylist.put(12,new Country(12, "Poland"));
        countrylist.put(13,new Country(13, "Australia"));
        countrylist.put(14,new Country(14, "Cyprus"));
        countrylist.put(15,new Country(15, "Serbia"));
        countrylist.put(16,new Country(16, "Lithuania"));
        countrylist.put(17,new Country(17, "Croatia"));
        countrylist.put(18,new Country(18, "Russia"));
        countrylist.put(19,new Country(19, "Spain"));
        countrylist.put(20,new Country(20, "Latvia"));
        countrylist.put(21,new Country(21, "Ukraine"));
        countrylist.put(22,new Country(22, "Malta"));
        countrylist.put(23,new Country(23, "Georgia"));
        countrylist.put(24,new Country(24, "Austria"));
        countrylist.put(25,new Country(25, "United Kingdom"));
        countrylist.put(26,new Country(26, "Armenia"));

        for (Map.Entry<Integer, Country> e : countrylist.entrySet()) {
            countryStringList.put(e.getValue().getName(), e.getValue());
        }
    }
    private Map<Integer, Country> countrylist = new HashMap<Integer,Country>();
    private Map<String, Country> countryStringList = new HashMap<String, Country>();

    public Country getCountry(int i){
        return countrylist.get(i);
    }

    public Country getCountry(String name){
        return countryStringList.get(name);
    }

}
