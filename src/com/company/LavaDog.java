package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class LavaDog extends Monster {

    public LavaDog(LinkedList dropTable, Player player){
        super.name = "Lava Dog";
        super.attack = 15;
        super.health = 200;
        super.maxHealth = 200;
        super.strength = 35;
        super.defence = 25;
        super.speed = 65;
        super.level = 15;
        super.isAlive = true;
        super.exp = 150;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "              (%#*                                                   \n" +
                "              *#@@*                                                \n" +
                "               .@&/#*                           .,,                \n" +
                "                ** .*&&*,.                    .#&**%&&(.           \n" +
                "                  #&&*   ,*#&*,*%%%%%%%%%%%%%&@&((%* #&*         \n" +
                "                    *@@(.     ,,,,.                %@*    #@#.       \n" +
                "                      ,&*                                 *.       \n" +
                "                       &%                          %@%%%&@@&         \n" +
                "                       %%                          ,*,,*#@#*         \n" +
                "                       %%  ..   .#@@@.  .,.  *@&%%%%%*,,,.           \n" +
                "                       %&.*&&(@@. *&*,%@@#%@.                      \n" +
                "                       ,%#&%  #@%,   %&*#@@%                       \n" +
                "                        .@@#  .#%,   .#@&                            \n" +
                "                                       (%.                           \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
