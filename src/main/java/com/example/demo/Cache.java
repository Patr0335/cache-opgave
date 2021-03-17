package com.example.demo;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;



public class Cache {

    HashMap<Integer, String> hashMap = new HashMap<>();


    public Cache(HashMap<Integer, String> hashMap) {
        this.hashMap = hashMap;
    }


    public String get(Integer key) {
        return hashMap.get(key);
    }
    public String set(Integer key, String value) {
        return hashMap.put(key, value);
    }
    public Boolean has(Integer Key) {
        return hashMap.containsKey(Key);

    }
}


