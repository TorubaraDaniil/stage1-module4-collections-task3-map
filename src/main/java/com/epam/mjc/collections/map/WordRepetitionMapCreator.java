package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] splitSentence = sentence.split("[ .,]+");
        List<String> words = new LinkedList<>();
        for (String word: splitSentence) {
            String wordLC = word.toLowerCase();
            words.add(wordLC);
        }
        HashMap<String, Integer> newHashMap = new HashMap<>();
        for (String word: words) {
            if (newHashMap.containsKey(word)){
                newHashMap.put(word, (newHashMap.get(word) + 1));
            }
            if(!newHashMap.containsKey(word) && word.length() > 0){
                newHashMap.put(word, 1);
            }
        }
        return newHashMap;
    }
}

