package com.company;

import java.util.LinkedList;

public abstract class Tile {
    LinkedList monsters;

    abstract Object handle();
    int random(int Min, int Max){
        return Min + (int)(Math.random() * ((Max - Min) + 1));
    }
}
