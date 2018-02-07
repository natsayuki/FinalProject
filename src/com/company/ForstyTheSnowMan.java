package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class ForstyTheSnowMan extends Monster {

    public ForstyTheSnowMan(LinkedList dropTable, Player player){
        super.name = "Forsty The Snow Man";
        super.attack = 200;
        super.health = 1000;
        super.maxHealth = 1000;
        super.strength = 300;
        super.defence = 250;
        super.speed = 100;
        super.level = 50;
        super.isAlive = true;
        super.exp = 1500;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                             .*#%%%%%%#.                             \n" +
                "                       .#@&%%%*,     .,#@#*                          \n" +
                "                       ,%,               #                         \n" +
                "        .#*            %&  .&&(.      .%%/%&                         \n" +
                "         &@*           %%     .   *#%%&(, ,%,                        \n" +
                "          **         %&     ..  ,,*&@@@@@@@&%#,.         *&@#.     \n" +
                "           %@@*.       #@#*   %@%%*,,#@&/#@@@@@@@%,       #@#*       \n" +
                "         #*.*#     *#&&%,.  ,,,,. *&        .#%@@&@@(.       \n" +
                "       ,%#*      *&&&&*    .*#&&%#*,,/&(#&   *#,.     #&&(.    \n" +
                "                  .(&&.          .,,,,.  .@@@@*           *#&(.  \n" +
                "                  ,%&                        .                     \n" +
                "                  ,%&                       .##.                     \n" +
                "                  ,%@/.                     #@#*                     \n" +
                "                 .*#*.               *#&*.*##.                   \n" +
                "                 *%,   .,#%%%%&&%%#*,,,#&&(.    &&*                  \n" +
                "                ,%,               .,,,,,.       .#&.                 \n" +
                "                .##.                             ,%,                 \n" +
                "                 ,&*                             ,%*                 \n" +
                "                  *#&*                            ,%,                \n" +
                "                    *,.                         ,%,                \n" +
                "                      *@&                         ,%,                \n" +
                "                     ,%/*.                      ,%,                \n" +
                "                     %&  *#&*                     ,%,                \n" +
                "                    .     #&.                  ./%,                \n" +
                "                    *%,      *.            .,*@&/                  \n" +
                "                   *&,         .#%&&&%%%&&%%%#,,#        .       \n" +
                "                   *#%%%%&&&*,                  .#&.    .*&&*        \n" +
                "                          .*%%.                  .##..*&&&*.         \n" +
                "                                                  ,@*              ";
    }

}
