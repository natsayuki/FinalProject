package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class EmpireAnt extends Monster {

    public EmpireAnt(LinkedList dropTable, Player player){
        super.name = "Empire Ant";
        super.attack = 15;
        super.health = 150;
        super.maxHealth = 150;
        super.strength = 15;
        super.defence = 15;
        super.speed = 10;
        super.level = 10;
        super.isAlive = true;
        super.exp = 100;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                                                     \n" +
                "       .,.                                                           \n" +
                "      ,%&&@*                                                         \n" +
                "      .#&,*@#.                                                       \n" +
                "       ,%, #            .,,,.                                      \n" +
                "       ,%,  *&,      .*@@%#*,/@%                                     \n" +
                "        *&/*#@@@/%*  .,,#@#.                                     \n" +
                "         (&/.   .,#@@%%&@*,.                                       \n" +
                "        *&*        ,%,                                               \n" +
                "      *#&,.,.       *@&@@#*                                          \n" +
                "      &%,%@*. (%(.  ,%,  *#*                                       \n" +
                "     *&* ..   *&%,  ,%,    .#&*                                      \n" +
                "    ,%,.(*.         ,%,       #@*                                    \n" +
                "    .##. #%&.    *&*          #&.                                  \n" +
                "     .@@#    *(.  #            *@@@%%*,,,.                         \n" +
                "        *%%%%%%%%%@@#             %%,  ,,,*##*                       \n" +
                "         .,,,*%&@&&@@#*.        .*.       *#                     \n" +
                "        .@@%%%*,..#&&%%&&%%%%%%%&&*           %&                     \n" +
                "                #&*      #                   *%,                   \n" +
                "              #@*        ./&@#                 ..                  \n" +
                "            *#@#       *##*..#.               #                  \n" +
                "         .#*       .##*      *.             .#&.                 \n" +
                "          .         ,@#          .#&&*.          ,%,                 \n" +
                "                                     *#&%*,,    *#&.                 \n" +
                "                                      .&@&%&&%%%*                  \n" +
                "                                    .#&*.                            \n" +
                "                                .*&.                               \n" +
                "                                (#                                   \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
