package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MyImmutableClass {
    private final String name ;

    private final List<String> petName;

    MyImmutableClass(String name, List<String> petName) {
        this.name = name;
        this.petName = petName;
    }

    public String getName() {
        return name;
    }

    public List<String> getPetName() {
        return new ArrayList<>(petName);
    }
}

class Main {
    public static void main(String[] args) {
        MyImmutableClass myImmutableClass = new MyImmutableClass("Divya", Collections.singletonList("Dog"));
        System.out.println(myImmutableClass.getName());
        System.out.println(myImmutableClass.getPetName());
        System.out.println(myImmutableClass.getPetName().add("cat"));
        System.out.println(myImmutableClass.getPetName());
    }
}
