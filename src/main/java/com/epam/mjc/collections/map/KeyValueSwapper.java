package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
       HashMap result=new HashMap();
        result.putAll(sourceMap);
        return result;
    }
}
