package com.teamtreehouse.funfacts;


import java.util.Random;

/**
 * Created by benjakuben on 7/31/14.
 */
public class GenerateSentnce {
    private static final String TAG = com.teamtreehouse.funfacts.GenerateSentnce.class.getSimpleName();

    // Method (abilities: things the object can do)
    public static String getSentence(String[] sentences) {

        String sentence = "";

        // Randomly select a sentence
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(sentences.length);
        sentence = sentences[randomNumber];
        sentence = sentence.replaceAll("[0123456789.]","").trim()+".";
        return sentence;

    }
}
