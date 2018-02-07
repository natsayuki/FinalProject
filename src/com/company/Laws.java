package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Laws extends Monster {

    public Laws(LinkedList dropTable, Player player){
        super.name = "Laws";
        super.attack = 5;
        super.health = 75;
        super.maxHealth = 75;
        super.strength = 50;
        super.defence = 15;
        super.speed = 150;
        super.level = 15;
        super.isAlive = true;
        super.exp = 125;
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
                "                .,.                                                  \n" +
                "                #@@@&*,.                                             \n" +
                "                 *@%%&&%%#.                                    .   \n" +
                "                #@&&@#*    .#%%%&&%#*.                        *#@@%  \n" +
                "                (&&%&@@#*          .*&&*.                   *#@#*%@. \n" +
                "                    .#&*    (%%%%%(  *##*,              .*   ,%, \n" +
                "                    ,@#,*&@@. .*%%%#*    .,*&&%%*,.    *#&@#     ,%, \n" +
                "                     .,,,(&@@#                 .*#%%%%%#*.       ,%, \n" +
                "                         %@@@*                                 ,%, \n" +
                "                           *&&@@#*                               ,%, \n" +
                "               *%#,*#%%%(.,,,..,*##*.                            ,%, \n" +
                "              ,%/*@@&*,&@@@@@@%%@@%#*                            %&  \n" +
                "              #@@&%%%*,.                                         %%  \n" +
                "               *&&*                                              %%  \n" +
                "                  #&&*,.                                         %%  \n" +
                "                    *%%&&*,.                                     %%  \n" +
                "                         ,*#&&*,,.                               %%  \n" +
                "                              ,,*#%&&%%%%%%%%%%%%#*,,,,,,.       %%  \n" +
                "                                                 .,,,,,*#%@@#*   %%  \n" +
                "                                                            /&, .  \n" +
                "                                                            ,%*.*%,  \n" +
                "                                                             ,%(%*   \n" +
                "                                                             ,@@@.   \n" +
                "                                                             .%#*    \n" +
                "                                                                     ";
    }

}
