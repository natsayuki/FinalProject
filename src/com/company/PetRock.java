package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class PetRock extends Monster {

    public PetRock(LinkedList dropTable, Player player){
        super.name = "Pet Rock";
        super.attack = 0;
        super.health = 30;
        super.maxHealth = 30;
        super.strength = 0;
        super.defence = 15;
        super.speed = 0;
        super.level = 5;
        super.isAlive = true;
        super.exp = 25;
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
                "                                                                     \n" +
                "                            ,,,,*#%%%*,,,                            \n" +
                "                         *#&&%%%%%*,*%%%&&%%*,.                      \n" +
                "                       *##*                .,*%%&&%%#,.              \n" +
                "                     *##*  .&@@@%#                  .#*            \n" +
                "                   .#&*   .#@@@@@@&*          *#*.     *#*         \n" +
                "                  *#&.    ,%@@@@@@@%,        *@@@@@&(     *##.       \n" +
                "                 ..      *@@@@@@@#.       ,%@@@@@@@*     .       \n" +
                "                .##.        *#%%%%(.        .#@@@@@@@@#     %%       \n" +
                "                ,%,                          .@@@@@@@@%     &%       \n" +
                "                %&                               *#@@#*    ,&*       \n" +
                "               .                                         *%,       \n" +
                "               *%,                                       *&&*        \n" +
                "              ,%#*      .%%%%%%%%%%%%%%%%%%%%(       *#&           \n" +
                "                *##*.                             *&*              \n" +
                "                  #@@#*.                        *#&*.                \n" +
                "                     ,,#%%&&%%%%*,,,,,,,,,,,*#&&*.                   \n" +
                "                                ,,,,,,,,,,,,,.                       \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
