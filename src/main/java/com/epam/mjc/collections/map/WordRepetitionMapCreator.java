package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if(sentence.contains(".")){
            sentence=sentence.substring(0,sentence.length()-1);
        }
        String[] words = sentence.split("[,\\s]+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
       if(!sentence.isEmpty()){
        for (String word : words)
        {
            word= word.toLowerCase();
            if (!wordToCount.containsKey(word))
            {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }}
    return wordToCount;
    }
}
