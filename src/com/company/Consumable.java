package com.company;

import java.util.LinkedList;

public class Consumable extends Entity {
    private String name;
    private LinkedList effects;

    public Consumable(String name, LinkedList effects) {
        super.name = name;
        this.name = name;
        this.effects = effects;
    }

    public String getName() {
        return name;
    }

    public LinkedList getEffects() {
        return effects;
    }
}
