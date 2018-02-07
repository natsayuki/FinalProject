package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class WaterTile extends Tile{
    private LinkedList superFastJellyfishDropTable;
    private LinkedList lawsDropTable;
    private LinkedList monsters;

    public WaterTile(LinkedList superFastJellyfishDropTable, LinkedList lawsDropTable, Player player) {
        this.superFastJellyfishDropTable = superFastJellyfishDropTable;
        this.lawsDropTable = lawsDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new SuperFastJellyfish(superFastJellyfishDropTable, player), new Laws(lawsDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}