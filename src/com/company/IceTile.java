package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class IceTile extends Tile{
    private LinkedList forstTheSnowManDropTable;
    private LinkedList iceManDropTable;
    private LinkedList monsters;

    public IceTile(LinkedList forstyTheSnowManDropTable, LinkedList iceManDropTable, Player player) {
        this.forstTheSnowManDropTable = forstyTheSnowManDropTable;
        this.iceManDropTable = iceManDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new ForstyTheSnowMan(forstyTheSnowManDropTable, player), new IceMan(iceManDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}