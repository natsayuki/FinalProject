package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class DragonWorm extends Monster {

    public DragonWorm(LinkedList dropTable, Player player){
        super.name = "Dragon Worm";
        super.attack = 10;
        super.health = 200;
        super.maxHealth = 200;
        super.strength = 10;
        super.defence = 15;
        super.speed = 15;
        super.level = 15;
        super.isAlive = true;
        super.exp = 100;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "\n" +
                "\n" +
                "                                                                     \n" +
                "                                     .,#%%%%%%%%*.                   \n" +
                "                              #&@&%%%%#.       .#@%                  \n" +
                "                            #*                .(.                \n" +
                "                          .##*           ,,.      .                \n" +
                "                         *&@.            *#@#*      *&*              \n" +
                "                        *&*                 #*     #&.             \n" +
                "                       ,%,             .(@@&%&@@*  ,%*             \n" +
                "                       #@,      #%%#*,%*(&/.   .*&&%.            \n" +
                "                *#@@&@@&%&&&%%&@#*.*#@&@&,,,         .*%%%%%%(       \n" +
                "            *#&(@@&%&&(@%,.*/##*    .#(       *#%&*     %&       \n" +
                "           ,%&,..#&*  .@&,.,@@, #&*.         .*#*,.       *&,      \n" +
                "           ,%%  .##*    *@#,,,    *#*  *#&,.            ,%,      \n" +
                "           ,%@*   #&&%#,*@%,         *&@&*.                 .##.     \n" +
                "             .#&,,,..,,.            .          %@*   .#* .*    \n" +
                "                .,,,*@@*               .(&.       *@@#*.#&. *&&    \n" +
                "                       #&.                .*,.     &%*#&(&@#,%@,   \n" +
                "                       .##*                 #@@@%#*. %&  *@@@@*/&*   \n" +
                "                         #                 *&**#%%%%%.   ..,@@&&*  \n" +
                "                          .##.                #&.               *%(  \n" +
                "                            &&                 *%,                   \n" +
                "                             *               ..                  \n" +
                "                              %&                #@%                  \n" +
                "                              ,%*               *&%                  \n" +
                "                               *              %@#                  \n" +
                "                                *&*             %%,                  \n" +
                "                                  &&*           %%,                  \n" +
                "                                  .#&*          %%,                  \n" +
                "                                    ,&*         %%,                  \n" +
                "                                    *@#         %%,                  \n" +
                "                                   .#@#.       *@%,                  \n" +
                "                                     .*%%%%%%%%#.                    \n" +
                "                                                                     \n" +
                "                                                                     \n";
    }
}
