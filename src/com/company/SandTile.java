package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class SandTile extends Tile{
    private LinkedList empireAntDropTable;
    private LinkedList miniSarlaccDropTable;
    private LinkedList monsters;

    public SandTile(LinkedList empireAntDropTable, LinkedList miniSarlacDropTable, Player player) {
        this.empireAntDropTable = empireAntDropTable;
        this.miniSarlaccDropTable = miniSarlaccDropTable;
        this.monsters = new LinkedList<>(Arrays.asList(new EmpireAnt(empireAntDropTable, player), new MiniSarlacc(miniSarlaccDropTable, player)));
    }

    @Override
    Object handle() {
        if(random(1, 3) == 1){
            return this.monsters.get(random(0, this.monsters.size() - 1));
        }
        return false;
    }
}