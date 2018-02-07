package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Map {
    private LinkedList<LinkedList> map = new LinkedList<>();
    private LinkedList<LinkedList> clearMap = new LinkedList<>();
    private String name;

    public Map(String name, LinkedList mapNew, LinkedList mapNew2) {
        this.name = name;
        this.map = mapNew;
        this.clearMap = mapNew2;
    }

    public LinkedList<LinkedList> getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public void addCharacter(Player player){
        int y = 0;
        int x = 0;
        boolean done = false;
        for(Object i: this.map){
            x = 0;
            for(Object a: (LinkedList) i){
                if((char) a == '@'){
                    done = true;
                    break;
                }
                x++;
            }
            if(done){
                break;
            }
            y++;
        }
        if(done){
            this.map.get(y).set(x, this.clearMap.get(y).get(x));
        }
        this.map.get(player.getY()).set(player.getX(), '@');
    }

    public void print(){
        for(Object i: this.map){
            System.out.println(i.toString().replace("[", "").replace("]", "").replace(",", ""));
        }
    }

    public char getTile(Player player){
        return (char) this.clearMap.get(player.getY()).get(player.getX());
    }
}
