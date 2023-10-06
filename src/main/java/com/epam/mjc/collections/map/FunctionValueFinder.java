package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if(functionMap.containsValue(requiredValue)){
            return true;
        }
        else {
            return false;
        }
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        Iterator<Integer> iterator = sourceList.iterator();
        while (iterator.hasNext()){
            int key = iterator.next();
            int value = 5 * key + 2;
            resultMap.put(key, value);
        }
        return resultMap;
    }
}
