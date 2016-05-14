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
        countrylist.put(1,new Country(1, "België"));
        countrylist.put(2,new Country(2, "Tsjechië"));
        countrylist.put(3,new Country(3, "Nederland"));
        countrylist.put(4,new Country(4, "Azerbeidzjan"));
        countrylist.put(5,new Country(5, "Hongarije"));
        countrylist.put(6,new Country(6, "Italië"));
        countrylist.put(7,new Country(7, "Israël"));
        countrylist.put(8,new Country(8, "Bulgarije"));
        countrylist.put(9,new Country(9, "Zweden"));
        countrylist.put(10,new Country(10, "Duitsland"));
        countrylist.put(11,new Country(11, "Frankrijk"));
        countrylist.put(12,new Country(12, "Polen"));
        countrylist.put(13,new Country(13, "Australië"));
        countrylist.put(14,new Country(14, "Cyprus"));
        countrylist.put(15,new Country(15, "Servië"));
        countrylist.put(16,new Country(16, "Litouwen"));
        countrylist.put(17,new Country(17, "Kroatië"));
        countrylist.put(18,new Country(18, "Rusland"));
        countrylist.put(19,new Country(19, "Spanje"));
        countrylist.put(20,new Country(20, "Letland"));
        countrylist.put(21,new Country(21, "Oekraïne"));
        countrylist.put(22,new Country(22, "Malta"));
        countrylist.put(23,new Country(23, "Georgië"));
        countrylist.put(24,new Country(24, "Oostenrijk"));
        countrylist.put(25,new Country(25, "Verenigd Koninkrijk"));
        countrylist.put(26,new Country(26, "Armenië"));


    }
    private Map<Integer, Country> countrylist = new HashMap<Integer,Country>();

    public Country getCountry(int i){
        return countrylist.get(i);
    }

}
