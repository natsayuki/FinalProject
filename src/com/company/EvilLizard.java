package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class EvilLizard extends Monster {

    public EvilLizard(LinkedList dropTable, Player player){
        super.name = "Evil Lizard";
        super.attack = 5;
        super.health = 15;
        super.maxHealth = 15;
        super.strength = 10;
        super.defence = 5;
        super.speed = 30;
        super.level = 4;
        super.isAlive = true;
        super.exp = 20;
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
                "                                                                     \n" +
                "                   .,,,,,,,,.                                        \n" +
                "         .(%%%&&%%%#*,,*//**%%%%%%&&&%%.                             \n" +
                "            .,#&.    %@@@%          *&&*.                          \n" +
                "       .(%%%%#,,*(@@@@@. .               *#&&%*,,.                   \n" +
                "            .*(#@@@.                        ,,*#%&&*,              \n" +
                "         #&@&%*,                                     ,*&&&*          \n" +
                "        .%&@                                          .*&&*.       \n" +
                "             *%&,,,,,,,#(.                                /&@#.    \n" +
                "                 .,,,,,,,&%,    ,.              #@@%%%%%%%%%%%.      \n" +
                "                        .. *@@@%*##       (#  ,%%                  \n" +
                "                       .##. &&  &@@@*     %@#.,%&                  \n" +
                "                       &&*/&*  ,@@*  &&     %@@# ,%,                 \n" +
                "                     #@@&*,.   ,&*    *%,  .*#@&@*                 \n" +
                "                     .,.        .     .  *%,  ,/&%,                \n" +
                "                                       *&(#&.    ,%%,                \n" +
                "                                        ,@@%       .                 \n" +
                "                                        ,@%,                         \n" +
                "                                         #(.                         \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
