package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Map.Entry<Integer, Integer> e : functionMap.entrySet()) {
            if(e.getValue()==requiredValue){
                return true;
        }
        }
    return false;
    }
    private HashMap calculateFunctionMap(List<Integer> sourceList) {
        HashMap result=new HashMap();
        for (Integer integer : sourceList) result.put(integer, 5 * integer + 2);
        return result;
    }
}
