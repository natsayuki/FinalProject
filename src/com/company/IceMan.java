package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class IceMan extends Monster {

    public IceMan(LinkedList dropTable, Player player){
        super.name = "Ice Man";
        super.attack = 50;
        super.health = 500;
        super.maxHealth = 500;
        super.strength = 200;
        super.defence = 45;
        super.speed =  100;
        super.level = 25;
        super.isAlive = true;
        super.exp = 750;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                         .*#%%%%%%%%#.      ,,                       \n" +
                "                       *##*.        *    ,@@@&*.                   \n" +
                "                       &%   ,,       %%     *&/*&@%                  \n" +
                "                      ,%,  ,@#  ,%%, *&,     ,@@@&*                  \n" +
                "                      ,%,   .    *(. ,%,      ##/&&                  \n" +
                "                      .   .,,,,,,. ,%*         .#&*                \n" +
                "             ..        ,%*  .,,,,,,.  ,%,       *&@(#@#              \n" +
                "             *@@*        #&&%%.       *%,    .#@#*    **           \n" +
                "               .&&.      .#@&%@@%%%%%&@,    &&.        .#&*          \n" +
                "                 .#&&*   #         .#%, *&*            *@@.        \n" +
                "                    *  %%,          ,@##              *##*       \n" +
                "                      *&&@%,           &@&*                 *&*      \n" +
                "                        .&%,          ,@#                     #@@.   \n" +
                "                         %%,         ,%#.                            \n" +
                "                         %%,         #&.                             \n" +
                "                         #         &%                              \n" +
                "                         ,%@&%&&%%**#%,                              \n" +
                "                         *&&   .,*%%&&*                              \n" +
                "                        *.         &&                              \n" +
                "                       ,%*           ,%,                             \n" +
                "                       #&.            *@#                            \n" +
                "                       %%              #@,                           \n" +
                "                      .               *%,                          \n" +
                "                     .##.                &%,                         \n" +
                "                     *&,                 ((.                         \n" +
                "                     &&                                              \n" +
                "                   .##.                                              ";
    }

}
