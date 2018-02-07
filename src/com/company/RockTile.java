package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class RockTile extends Tile{
    private LinkedList sankeDropTable;
    private LinkedList petRockDropTable;
    private LinkedList monsters;

    public RockTile(LinkedList sankeDropTable, LinkedList petRockDropTable, Player player) {
        this.sankeDropTable = sankeDropTable;
        this.petRockDropTable = petRockDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new Sanke(sankeDropTable, player), new PetRock(petRockDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}