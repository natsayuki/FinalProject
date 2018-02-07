package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class LavaTile extends Tile{
    private LinkedList lavaDogDropTable;
    private LinkedList dragonWormDropTable;
    private LinkedList monsters;

    public LavaTile(LinkedList lavaDogDropTable, LinkedList dragonWormDropTable, Player player) {
        this.lavaDogDropTable = lavaDogDropTable;
        this.dragonWormDropTable = dragonWormDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new LavaDog(lavaDogDropTable, player), new DragonWorm(dragonWormDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}