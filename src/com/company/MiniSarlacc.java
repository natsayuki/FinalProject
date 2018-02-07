package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class MiniSarlacc extends Monster {

    public MiniSarlacc(LinkedList dropTable, Player player){
        super.name = "Mini Sarlacc";
        super.attack = 15;
        super.health = 100;
        super.maxHealth = 150;
        super.strength = 20;
        super.defence = 15;
        super.speed = 10;
        super.level = 10;
        super.isAlive = true;
        super.exp = 100;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                            ,,                                       \n" +
                "                           ,@@#*                                     \n" +
                "                  #@@%(     %&@&*                                  \n" +
                "                  ,%&*#.  #&.  .*                                \n" +
                "                   *&, *#*,##.  *#&*                               \n" +
                "                   ,%*   .*##(&* .,.,@@.                             \n" +
                "                    *&*     .*@@*(%(..#&*                            \n" +
                "                     &%        .       #&.                           \n" +
                "                     %%                .##.                          \n" +
                "                     %@.                ..                         \n" +
                "                     *##.                %%,                         \n" +
                "                       &&                *&%                         \n" +
                "                       .##.              ,%%                         \n" +
                "                         &&*              *&,                        \n" +
                "                       .,/&@.              *%,                       \n" +
                "             .,,,,#&@&%%#,/&*              ,&/,,,,,,,,,,,.           \n" +
                "         .(&,,,,,.       ,%,             ,&/,,,,,,,,,,*#@&*        \n" +
                "         ,%*               ,%,             ,%,            ,/%,       \n" +
                "         ,%,               .(.             .(.             ,%,       \n" +
                "         .##*                                              *%,       \n" +
                "           *&@*,                                        .*         \n" +
                "             .,*%%%%%%%%%%%&&%%%%%%%%%%%%%%%%%%%%%%%%&&%%#           \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
