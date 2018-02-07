package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class GrassTile extends Tile{
    private LinkedList antDropTable;
    private LinkedList evilLizardDropTable;
    private LinkedList monsters;

    public GrassTile(LinkedList antDropTable, LinkedList evilLizardDropTable, Player player) {
        this.antDropTable = antDropTable;
        this.evilLizardDropTable = evilLizardDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new Ant(antDropTable, player), new EvilLizard(evilLizardDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}
