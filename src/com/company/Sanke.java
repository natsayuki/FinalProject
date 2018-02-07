package com.company;

import java.util.LinkedList;

public class Sanke extends Monster {

    public Sanke(LinkedList sankeDropTable, Player player) {
        super.name = "Sanke";
        super.attack = 5;
        super.health = 25;
        super.maxHealth = 25;
        super.strength = 10;
        super.defence = 5;
        super.speed = 5;
        super.level = 5;
        super.isAlive = true;
        super.exp = 30;
        super.dropTable = sankeDropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "                                                                     \n" +
                "                         .(%*.                                       \n" +
                "                          *#@&&@#*                                   \n" +
                "                           ...#&%#*                                \n" +
                "                            *#&*  .*#&*                            \n" +
                "                         %@@%%%%. .#@@#*#%%%%*                     \n" +
                "                          *#&&*,   .,,,       #&*                    \n" +
                "                              ,*&@*          ..                  \n" +
                "                                  .*##*         *&&                  \n" +
                "                                     *##.        .##.                \n" +
                "                                      .         .                \n" +
                "                                        *@#*       .##*              \n" +
                "                                          *#@&%%*    *&*             \n" +
                "                                               *@#*    &&*           \n" +
                "                                  ,,,,,,,,.     .#@,    *&*          \n" +
                "                       .,*#%&&%%%%*,,,,,,*#&&%*, .#@#    *         \n" +
                "                    .*#&&%#*.               ,*%&&%&@@,    %&         \n" +
                "                  /&&,.                            #@,    *&,        \n" +
                "                #&*.                               ,%,    ,%,        \n" +
                "              .##.            #@&%%%(              ,%,    ,%,        \n" +
                "              &&            .#&*                   ,%,    ,%,        \n" +
                "             ,%,            .##.                   *&,    ,%,        \n" +
                "             ,%,             .@@#*                 %%     ,%,        \n" +
                "             ,@#              .,#&&%%#*.           %%     ,%,        \n" +
                "               *&*                   .,#%%&&%%*,,,/&*     *&,        \n" +
                "                *#&&&*                        ,,,,,      *         \n" +
                "                     #*                              *&&           \n" +
                "                       *##*.                         *##*            \n" +
                "                         .*#%%&*.                 *              \n" +
                "                                .,#&&%%*,,,. .,,*#&%#                \n" +
                "                                       ,,,*#%#,,,.                   \n" +
                "                                                                     ";
    }

}
