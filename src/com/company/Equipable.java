package com.company;

import java.util.LinkedList;

public class Equipable extends Entity {
    private String name;
    private LinkedList properties;
    private String type;

    public Equipable(String name, LinkedList properties, String type) {
        this.name = name;
        super.name = name;
        this.properties = properties;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public LinkedList getProperties() {
        return properties;
    }

    public String getType() {
        return type;
    }

    public void examine(){
        System.out.println(this.name + ':');
        for(Object i: this.properties){
            System.out.printf(((LinkedList)i).get(0) + ": ");
            System.out.printf(((LinkedList)i).get(1) + "\n");
        }
    }
}
