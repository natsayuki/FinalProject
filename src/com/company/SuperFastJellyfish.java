package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class SuperFastJellyfish extends Monster {

    public SuperFastJellyfish(LinkedList dropTable, Player player){
        super.name = "Super Fast Jellyfish";
        super.attack = 100;
        super.health = 300;
        super.maxHealth = 300;
        super.strength = 50;
        super.defence = 10;
        super.speed = 9001;
        super.level = 25;
        super.isAlive = true;
        super.exp = 200;
        super.dropTable = dropTable;
        super.player = player;
        super.image = "                                               .,*#%%%#.             \n" +
                "                                  ,,,#%%%#(&&%%%*,,   *@%,           \n" +
                "                               .&&*,,.   %@&           *&%           \n" +
                "                                         (&@@@@@%%%%%&&%%%&@#*       \n" +
                "                                        *&,,,,,,,,,.     .&@.      \n" +
                "                                      .#&.                   *@#.    \n" +
                "                                  ,*#.                      %%,    \n" +
                "                                #&*,.  .,.                    %%,    \n" +
                "                              #@*    #&&%%%%&@#*              %%,    \n" +
                "                            *##*   **       #@*             *&%    \n" +
                "                         .#@#*   .&&(.#@@@@#   ..           #@%    \n" +
                "                         ,%&     ,%, ,%@@@@%    %%,           &&*    \n" +
                "                         ,%%     ,%, .#@@#*    *.         #&*      \n" +
                "                         %&*      &@#       *#            &%       \n" +
                "                       (&@#.       *#%&*#&*.            *##.       \n" +
                "                     .#&*               .,.     ,,*%%#*  ,&*         \n" +
                "                    *@&                       .##*,..&&  *%,         \n" +
                "                  .#@/.     .((.              ,%,.((.*&,,%#.         \n" +
                "                  &@#         #&*             ,%*... .(&,          \n" +
                "                ./@&*           #*           *&,*@@@@#           \n" +
                "              *##*.*#.          #@@%#,.         .,,*#%,            \n" +
                "           #&&*.      .#*           .#@*         &&              \n" +
                "         #&*          .,,(&@*.           .*#(.     *##.              \n" +
                "      *#&*        .(&,,.  #@&%*,               .##*                \n" +
                "     **         #        .*(&&&%#.          *#&.                 \n" +
                "     ..         &@*          .@@.   .#%&*   *##*                   \n" +
                "             .&&*           #&*       .@&*#@&&                     \n" +
                "              .           *##*      *&&*                             \n" +
                "                        *@&*      #@@*                               \n" +
                "                       (%*       ,@#.                                \n" +
                "                                .((.                                 \n" +
                "                                                                     \n" +
                "                                                                     \n" +
                "                                                                     ";
    }

}
