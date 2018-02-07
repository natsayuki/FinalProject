package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Ant extends Monster {

    public Ant(LinkedList dropTable, Player player){
        super.name = "Ant";
        super.attack = 3;
        super.health = 10;
        super.maxHealth = 10;
        super.strength = 2;
        super.defence = 3;
        super.speed = 5;
        super.level = 3;
        super.isAlive = true;
        super.exp = 15;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "            .,.                                                      \n" +
                "           /&@&%&@*                                                \n" +
                "       .(&&*.     .*#                                              \n" +
                "       ,%,.(.   ((   *##.                                            \n" +
                "      ,%@, .(%%%.     .&&@&%%%%%%%&                                \n" +
                "        *,,,,.     /&@#           *%.                            \n" +
                "          .,,,*#&@@@@#*                &&                            \n" +
                "                #*.                  *##.                          \n" +
                "              .#&*                      ,@#.                         \n" +
                "              ,%,                        %%,                         \n" +
                "              ,%,                       ,&*                          \n" +
                "             ./&*                      *##*,,,,,,,.                  \n" +
                "          *@@*#*.                ,*@@%%#,,,,*#&                \n" +
                "         #@#*     #&*           *#&@@*.          #@,               \n" +
                "         ,.          .*&@&%%%%%%@@@#*              .##.              \n" +
                "                      *       %&                  ,%,              \n" +
                "                     %@.      .,&%                  .              \n" +
                "                    *&*    .@@%#&%                   %%              \n" +
                "                  .#&.      .   %%                  .              \n" +
                "                   ..           %&                  *%,              \n" +
                "                                #@#*.              #&*               \n" +
                "                                  .*#&*,. .,,*&&&*                 \n" +
                "                                       .,/&@#*,,                     \n" +
                "                                         ,%%                         \n" +
                "                                         ,%%                         \n" +
                "                                         .((                         \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
