package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> resultMap = new HashMap<>();
        for(Integer key: sourceMap.keySet()){
            if(resultMap.containsKey(sourceMap.get(key))){
                if(key < resultMap.get(sourceMap.get(key))){
                    resultMap.put(sourceMap.get(key), key);
                }
            }
            else{
                resultMap.put(sourceMap.get(key), key);
            }
        }
        return resultMap;
    }
}
