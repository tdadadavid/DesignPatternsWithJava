package com.company.Document;

import java.util.HashMap;
import java.util.Map;

public class Properties <T, E>{

    // Hashmap that the properties and the Value
    private final HashMap<String, E> map = new HashMap<>();

    public Properties(){
    }

    public Properties(Map<String, E> prop){
        this.map.putAll(prop);
    }

    public Properties<T, E> setValue(String property, E value){
        map.put(property, value);
        return this;
    }

    public HashMap<String, E> getState(){
        return map;
    }

}
