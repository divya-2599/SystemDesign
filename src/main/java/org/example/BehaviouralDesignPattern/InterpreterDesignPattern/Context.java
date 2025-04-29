package org.example.BehaviouralDesignPattern.InterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String stringvariable, int value) {
        contextMap.put(stringvariable, value);
    }

    public int get(String context) {
        return contextMap.get(context);
    }
}
