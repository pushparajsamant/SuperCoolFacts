package com.funfacts.pushparaj.funfacts;

import java.util.Random;

/**
 * Created by Pushparaj on 19/9/2014.
 */
public class FactBook {
    static String factList[] = new String[]{"Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."};
    String colorCodes[] = {"#39add1","#3079ab","#c25975","#e15258","#f9845b","#838cc7"};
    static public String getFact(){
        int random;
        String newFact = "";

        Random randomize = new Random();
        random = randomize.nextInt(factList.length);
        newFact = factList[random];
        return newFact;
    }

}
