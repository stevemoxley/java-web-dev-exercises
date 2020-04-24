package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = testString.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();

        for (char symbol : charactersInString ) {
            if(characterCounts.containsKey(symbol))
            {
                int currentCount = characterCounts.get(symbol) + 1;
                characterCounts.put(symbol, currentCount);
            }else{
                characterCounts.put(symbol, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

