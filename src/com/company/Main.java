package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        * Declarations and such
        */

        Scanner scanner = new Scanner(System.in);
        String input;
        while(true){
            System.out.println("Enter a four letter name for your adventurer");
            input = scanner.nextLine();
            if(input.length() == 4){
                break;
            }
            System.out.println("That name is not 4 letters");
        }

        // Maps

        LinkedList<LinkedList> mapList = new LinkedList<>();
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';','#',';',';',';','%','%','%',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','=','=','=','=','=','=','#','#','#','#','#',';',';',';','%','%',';',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';','#','#','#','#','#','=','=','=','~','~','~','~','=','=','#','#','#',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','=','~','~','~','~','~','~','~','=','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','~','~','~','~','~','~','~','~','=','#','#',';',';',';','%','%','%','%','%','%',';','*','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','~','~','~','~','~','~','~','=','=','#','#',';',';',';','%','%','%','%','%',';',';','*','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','~','~','~','~','~','~','=','=','#','#','#',';',';',';','%','%','%','%',';',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','~','~','~','~','~','~','=','#','#','#','#','#',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';',';','#','=','~','~','~','~','~','=','=','#','#','#','#','#',';',';',';','%','%','%',';',';',';','*','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','=','~','~','~','~','=','#','#','#','#','#',';',';',';','%','%','%','%','%',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';','#','#','#','#','#','=','=','~','~','=','=','#','#','#','#','#',';',';',';','%','%','%','%','%',';',';',';','*','*','*','*')));
        mapList.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','=','=','=','=','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));
        LinkedList<LinkedList> mapList2 = new LinkedList<>();
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','#','#','#','#','#','#','#','#','#','#',';','#',';',';',';','%','%','%',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','#','#','#','=','=','=','=','=','=','#','#','#','#','#',';',';',';','%','%',';',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';','#','#','#','#','#','=','=','=','~','~','~','~','=','=','#','#','#',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','=','~','~','~','~','~','~','~','=','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','~','~','~','~','~','~','~','~','=','#','#',';',';',';','%','%','%','%','%','%',';','*','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';','#','#','#','=','~','~','~','~','~','~','~','=','=','#','#',';',';',';','%','%','%','%','%',';',';','*','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','~','~','~','~','~','~','=','=','#','#','#',';',';',';','%','%','%','%',';',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','~','~','~','~','~','~','=','#','#','#','#','#',';',';',';','%','%','%',';',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';',';','#','=','~','~','~','~','~','=','=','#','#','#','#','#',';',';',';','%','%','%',';',';',';','*','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','=','=','~','~','~','~','=','#','#','#','#','#',';',';',';','%','%','%','%','%',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';','#','#','#','#','#','=','=','~','~','=','=','#','#','#','#','#',';',';',';','%','%','%','%','%',';',';',';','*','*','*','*')));
        mapList2.add(new LinkedList<>(Arrays.asList(';',';',';','#','#','#','#','=','=','=','=','#','#','#','#','#','#',';',';',';','%','%','%','%',';',';',';','*','*','*','*','*')));

        Map map = new Map("Map", mapList, mapList2);

        // Consumables

        LinkedList cakeEffects = new LinkedList<>();
        cakeEffects.add(new LinkedList(Arrays.asList("Health", 5)));
        Consumable cake = new Consumable("cake", cakeEffects);

        LinkedList potionEffects = new LinkedList<>();
        potionEffects.add(new LinkedList(Arrays.asList("Health", 10)));
        Consumable potion = new Consumable("potion", potionEffects);

        LinkedList attackPotionEffects = new LinkedList<>();
        attackPotionEffects.add(new LinkedList(Arrays.asList("Attack", 10)));
        Consumable attackPotion = new Consumable("attack potion", attackPotionEffects);

        LinkedList largePotionEffects = new LinkedList<>();
        largePotionEffects.add(new LinkedList(Arrays.asList("Health", 20)));
        Consumable largePotion = new Consumable("large potion", largePotionEffects);

        LinkedList giantPotionEffects = new LinkedList<>();
        giantPotionEffects.add(new LinkedList(Arrays.asList("Health", 100)));
        Consumable giantPotion = new Consumable("giant potion", giantPotionEffects);

        LinkedList maxHealthPotionEffects = new LinkedList<>();
        maxHealthPotionEffects.add(new LinkedList(Arrays.asList("MaxHealth", 10)));
        maxHealthPotionEffects.add(new LinkedList(Arrays.asList("Health", 10)));
        Consumable maxHealthPotion = new Consumable("max health potion", maxHealthPotionEffects);

        LinkedList carrotEffects = new LinkedList<>();
        carrotEffects.add(new LinkedList(Arrays.asList("Health", 50)));
        carrotEffects.add(new LinkedList(Arrays.asList("Attack", 10)));
        Consumable carrot = new Consumable("carrot", carrotEffects);

        LinkedList consumables = new LinkedList<>(Arrays.asList(cake, potion, attackPotion, largePotion, giantPotion, maxHealthPotion, carrot));

        // Equipables

        // Hand

        LinkedList swordProperties = new LinkedList<>();
        swordProperties.add(new LinkedList(Arrays.asList("Attack", 15)));
        Equipable sword = new Equipable("sword", swordProperties, "hand");

        LinkedList knifeProperties = new LinkedList<>();
        knifeProperties.add(new LinkedList(Arrays.asList("Attack", 10)));
        Equipable knife = new Equipable("knife", knifeProperties, "hand");

        LinkedList stickProperties = new LinkedList<>();
        stickProperties.add(new LinkedList(Arrays.asList("Attack", 5)));
        Equipable stick = new Equipable("stick", stickProperties, "hand");

        LinkedList greatSwordProperties = new LinkedList<>();
        greatSwordProperties.add(new LinkedList(Arrays.asList("Attack", 20)));
        greatSwordProperties.add(new LinkedList(Arrays.asList("MaxHealth", 20)));
        Equipable greatSword = new Equipable("great sword", greatSwordProperties, "hand");

        LinkedList fireRodProperties = new LinkedList<>();
        fireRodProperties.add(new LinkedList(Arrays.asList("Attack", 30)));
        Equipable fireRod = new Equipable("fire rod", fireRodProperties, "hand");

        LinkedList saberProperties = new LinkedList<>();
        saberProperties.add(new LinkedList(Arrays.asList("Attack", 35)));
        Equipable saber = new Equipable("saber", saberProperties, "hand");

        LinkedList iceSpearProperties = new LinkedList<>();
        iceSpearProperties.add(new LinkedList(Arrays.asList("Attack", 15)));
        Equipable iceSpear = new Equipable("ice spear", iceSpearProperties, "hand");

        LinkedList sharkToothProperties = new LinkedList<>();
        sharkToothProperties.add(new LinkedList<>(Arrays.asList("Attack", 1)));
        Equipable sharkTooth = new Equipable("shark tooth", sharkToothProperties, "hand");

        LinkedList dragonSwordProperties = new LinkedList<>();
        dragonSwordProperties.add(new LinkedList<>(Arrays.asList("Attack", 50)));
        Equipable dragonSword = new Equipable("dragon sword", dragonSwordProperties, "hand");

        LinkedList wormSwordProperties = new LinkedList<>();
        wormSwordProperties.add(new LinkedList<>(Arrays.asList("Attack", 1)));
        Equipable wormSword = new Equipable("worm sword", wormSwordProperties, "hand");

        // Body

        LinkedList greyShirtProperties = new LinkedList<>();
        greyShirtProperties.add(new LinkedList<>(Arrays.asList("MaxHealth", 5)));
        greyShirtProperties.add(new LinkedList<>(Arrays.asList("Health", 5)));
        Equipable greyShirt = new Equipable("grey shirt", greatSwordProperties, "body");

        LinkedList chainMailProperties = new LinkedList<>();
        chainMailProperties.add(new LinkedList<>(Arrays.asList("MaxHealth", 10)));
        chainMailProperties.add(new LinkedList<>(Arrays.asList("Health", 10)));
        chainMailProperties.add(new LinkedList<>(Arrays.asList("Attack", 5)));
        Equipable chainMail = new Equipable("chain mail", chainMailProperties, "body");

        LinkedList abSuitProperties = new LinkedList<>();
        abSuitProperties.add(new LinkedList<>(Arrays.asList("MaxHealth", 5)));
        abSuitProperties.add(new LinkedList<>(Arrays.asList("Health", 5)));
        abSuitProperties.add(new LinkedList<>(Arrays.asList("Strength", 5)));
        Equipable abSuit = new Equipable("ab suit", abSuitProperties, "body");

        LinkedList exoSuitProperties = new LinkedList<>();
        exoSuitProperties.add(new LinkedList<>(Arrays.asList("MaxHealth", 30)));
        exoSuitProperties.add(new LinkedList<>(Arrays.asList("Health", 30)));
        exoSuitProperties.add(new LinkedList<>(Arrays.asList("Strength", 30)));
        exoSuitProperties.add(new LinkedList<>(Arrays.asList("Attack", 30)));
        Equipable exoSuit = new Equipable("exo suit", exoSuitProperties, "body");

        // Head

        LinkedList bikeHelmetProperties = new LinkedList<>();
        bikeHelmetProperties.add(new LinkedList<>(Arrays.asList("Defence", 5)));
        Equipable bikeHelmet = new Equipable("bike helmet", bikeHelmetProperties, "head");

        // Feet

        LinkedList leadNikeShoesProperties = new LinkedList<>();
        leadNikeShoesProperties.add(new LinkedList<>(Arrays.asList("Defence", 15)));
        leadNikeShoesProperties.add(new LinkedList<>(Arrays.asList("MaxHealth", 15)));
        leadNikeShoesProperties.add(new LinkedList<>(Arrays.asList("Health", 15)));
        leadNikeShoesProperties.add(new LinkedList<>(Arrays.asList("Speed", -15)));
        Equipable leadNikeShoes = new Equipable("lead nike shoes", leadNikeShoesProperties, "feet");




        LinkedList equipables = new LinkedList<>(Arrays.asList(sword, knife, stick, greatSword, fireRod, saber, iceSpear, sharkTooth,
                dragonSword, wormSword, greyShirt, chainMail, abSuit, exoSuit, bikeHelmet, leadNikeShoes));

        LinkedList entities = new LinkedList<>(Arrays.asList(cake, potion, attackPotion, largePotion, giantPotion, maxHealthPotion, carrot,
                sword, knife, stick, greatSword, fireRod, saber, iceSpear, sharkTooth, dragonSword, wormSword, greyShirt, chainMail,
                abSuit, exoSuit, bikeHelmet, leadNikeShoes));


        // Monsters
        LinkedList petRockDropTable = new LinkedList<>(Arrays.asList(cake, bikeHelmet));
        LinkedList sankeDropTable = new LinkedList<>(Arrays.asList(sword, cake, cake, cake, cake));

        LinkedList antDropTable = new LinkedList<>(Arrays.asList(knife, stick,  stick, stick, potion, potion));
        LinkedList evilLizardDropTable = new LinkedList<>(Arrays.asList(potion, potion, potion, saber, abSuit));

        LinkedList lawsDropTable = new LinkedList<>(Arrays.asList(sharkTooth, largePotion));
        LinkedList superFastJellyfishDropTable = new LinkedList<>(Arrays.asList(greatSword, greatSword, attackPotion, leadNikeShoes));

        LinkedList miniSarlaccDropTable = new LinkedList<>(Arrays.asList(cake, greyShirt));
        LinkedList empireAntDropTable = new LinkedList<>(Arrays.asList(maxHealthPotion, saber, saber, saber));

        LinkedList dragonWormDropTable = new LinkedList<>(Arrays.asList(dragonSword, wormSword, wormSword, wormSword));
        LinkedList lavaDogDropTable = new LinkedList<>(Arrays.asList(giantPotion, fireRod, fireRod));

        LinkedList iceManDropTable = new LinkedList<>(Arrays.asList(iceSpear, chainMail));
        LinkedList forstyTheSnowManDropTable = new LinkedList<>(Arrays.asList(iceSpear, iceSpear, carrot, exoSuit));
        // Player

        Player player = new Player(input, 0, 0, mapList2, antDropTable, dragonWormDropTable, empireAntDropTable, evilLizardDropTable,
                forstyTheSnowManDropTable, iceManDropTable, lavaDogDropTable, lawsDropTable, miniSarlaccDropTable,
                petRockDropTable, sankeDropTable, superFastJellyfishDropTable);

        // Tiles

        RockTile rockTile = new RockTile(sankeDropTable, petRockDropTable, player);

        GrassTile grassTile = new GrassTile(antDropTable, evilLizardDropTable, player);

        WaterTile waterTile = new WaterTile(superFastJellyfishDropTable, lawsDropTable, player);

        SandTile sandTile = new SandTile(empireAntDropTable, miniSarlaccDropTable, player);

        LavaTile lavaTile = new LavaTile(lavaDogDropTable, dragonWormDropTable, player);

        IceTile iceTile = new IceTile(forstyTheSnowManDropTable, iceManDropTable, player);


        /**
        * Main Loop
        */

        handleTile(map.getTile(player), grassTile, rockTile, waterTile, sandTile, lavaTile, iceTile, player, consumables);

        while(true){
            input = scanner.nextLine();
            boolean look = false;
            switch(input.toLowerCase()){
                case "north":
                case "n":
                    player.moveY(-1);
                    System.out.println("You head north");
                    look = true;
                    break;
                case "south":
                case "s":
                    player.moveY(1);
                    System.out.println("You head south");
                    look = true;
                    break;
                case "west":
                case "w":
                    player.moveX(-1);
                    System.out.println("You head west");
                    look = true;
                    break;
                case "east":
                case "e":
                    player.moveX(1);
                    System.out.println("You head east");
                    look = true;
                    break;
                case "map":
                case "m":
                    map.addCharacter(player);
                    map.print();
                    break;
                case "look":
                case "l":
                    look = true;
                    break;
                case "debug":
                case "d":
                    System.out.println("debug command:");
                    input = scanner.nextLine();
                    switch(input.toLowerCase()){
                        case "coordinates":
                        case "xy":
                            System.out.println(((Integer)player.getX()).toString() + ' ' + ((Integer)player.getY()).toString());
                        case "damage":
                        case "d":
                            System.out.println("how much damage?");
                            int amount = scanner.nextInt();
                            player.damage(amount);
                            System.out.println("Player damaged for " + ((Integer)amount).toString());
                            break;
                        case "heal":
                        case "h":
                            System.out.println("how much heal?");
                            amount = scanner.nextInt();
                            player.heal(amount);
                            System.out.println("Player healed for " + ((Integer)amount).toString());
                            break;
                        case "expup":
                        case "e":
                            System.out.println("how much exp");
                            input = scanner.nextLine();
                            player.expUp(Integer.valueOf(input));
                            break;
                        case "levelup":
                        case "l":
                            System.out.println("How many levels");
                            amount = scanner.nextInt();
                            player.levelUp(amount);
                            break;
                        case "addtobag":
                        case "a":
                            input = scanner.nextLine();
                            boolean added = false;
                            for(Object i: entities){
                                if(i instanceof Entity){
                                    if(((Entity)i).getName().equals(input)){
                                        added = true;
                                        player.addToBag(i);
                                        System.out.println(((Entity)i).getName() + " added to bag");
                                    }
                                }
                            }
                            if(!added){
                                System.out.println("No such item");
                            }
                            break;
                        case "attack":
                            amount = scanner.nextInt();
                            player.setAttack(amount);
                            break;
                        case "health":
                            System.out.println("set health to what?");
                            input = scanner.nextLine();
                            player.setMaxHealth(Integer.valueOf(input));
                            break;
                        case "die":
                            player.die();
                        case "head":
                            System.out.println(((Equipable)player.getHead()).getName());
                            break;
                        case "hand":
                            System.out.println(((Equipable)player.getHand()).getName());
                            break;
                        case "goto":
                        case "g":
                            String x = scanner.nextLine();
                            System.out.println("X");
                            String y = scanner.nextLine();
                            System.out.println("Y");
                            player.moveX(Integer.valueOf(x));
                            player.moveY(Integer.valueOf(y));
                            break;
                        default:
                            System.out.println("Not valid debugging command");
                    }
                    break;
                case "consume":
                case "c":
                    System.out.println("What item do you want to consume");
                    input = scanner.nextLine();
                    for(Object i: consumables){
                        if(input.equals(((Consumable)i).getName())){
                            LinkedList effects = player.consume((Consumable)i);
                            System.out.printf("Consumed " + ((Consumable)i).getName() + ' ');
                            for(Object j: effects){
                                if(effects.indexOf(j) > 0){
                                    System.out.printf(" and ");
                                }
                                System.out.printf("for " + ((LinkedList)(j)).get(1) + ' ' + ((LinkedList)(j)).get(0));
                                if(effects.indexOf(j) == effects.size()-1){
                                    System.out.printf("\n");
                                }
                            }
                            player.removeFromBag((Consumable)i);
                        }
                    }
                    break;
                case "equip":
                case "q":
                    System.out.println("What do you want to equip?");
                    input = scanner.nextLine();
                    boolean equipped = false;
                    for(Object i: equipables){
                        if(((Equipable)i).getName().equals(input)){
                            if(player.equip((Equipable)i)){
                                equipped = true;
                                System.out.println("Equipped " + ((Equipable)i).getName());
                            }
                        }
                    }
                    if(!equipped){
                        System.out.println("No such item as " + input + " in your bag");
                    }
                    break;
                case "inventory":
                case "i":
                    boolean none = true;
                    Object hand = player.getHand();
                    if(hand != null){
                        System.out.println(((Equipable)hand).getName());
                        none = false;
                    }
                    Object body = player.getBody();
                    if(body != null){
                        System.out.println(((Equipable)body).getName());
                        none = false;
                    }
                    Object head = player.getHead();
                    if(head != null){
                        System.out.println(((Equipable)head).getName());
                        none = false;
                    }
                    Object feet = player.getFeet();
                    if(feet != null){
                        System.out.println(((Equipable)feet).getName());
                        none = false;
                    }
                    if(none){
                        System.out.println("nothing equipped");
                    }
                    break;
                case "bag":
                case "b":
                    if(player.getBag().size() > 0){
                        for(Object i: player.getBag()){
                            System.out.println(((Entity)i).getName());
                        }
                    }
                    else{
                        System.out.println("Your bag is empty");
                    }
                    break;
                case "unequip":
                case "u":
                    System.out.println("What item slot do you want to unequip");
                    input = scanner.nextLine();
                    if(input.equals("hand")){
                        System.out.println("Unequipped " + ((Equipable)(player.getHand())).getName());
                        player.unequip("hand");
                    }
                    break;
                case "check":
                case "k":
                    System.out.println(player.getName());
                    System.out.println("Attack: " + player.getAttack());
                    System.out.println("Strength " + player.getStrength());
                    System.out.println("Defence " + player.getDefence());
                    System.out.println("Health: " + player.getHealth() + '/' + player.getMaxHealth());
                    System.out.println("Speed " + player.getSpeed());
                    System.out.println("Level: " + player.getLevel());
                    System.out.println("EXP: " + player.getExp());
                    break;
                case "drop":
                case "p":
                    System.out.println("What item do you want to drop");
                    input = scanner.nextLine();
                    boolean dropped = false;
                    for(Object i: player.getBag()){
                        if(((Entity)i).getName().equals(input)){
                            player.removeFromBag((Entity)i);
                            System.out.println("Dropped " + ((Entity)i).getName());
                            dropped = true;
                        }
                    }
                    if(!dropped){
                        System.out.println("No such item as " + input);
                    }
                    break;
                case "examine":
                case "x":
                    System.out.println("What item do you want to examine");
                    input = scanner.nextLine();
                    boolean done = false;
                    for(Object i: player.getBag()){
                        if(((Equipable)i).getName().equals(input)){
                            ((Equipable)i).examine();
                            done = true;
                        }
                    }
                    if(!done){
                        System.out.println("No such item as " + input);
                    }
                    break;
                case "monsterbook":
                case "o":
                    player.printMonsterBook();
                    System.out.println("What monster would you like to read about?");
                    input = scanner.nextLine();
                    player.getInfo(input);
                    break;
                case "help":
                case "?":
                    System.out.println("Commands:");
                    System.out.println("[n]orth - Move your character north");
                    System.out.println("[s]outh - Move your character south");
                    System.out.println("[e]ast - Move your character east");
                    System.out.println("[w]est - Move your character west");
                    System.out.println("[m]ap - Prints out the map");
                    System.out.println("[i]nventory - Prints equipped items");
                    System.out.println("[b]ag - Prints out all items in your bag");
                    System.out.println("[l]ook - Observes your surroundings");
                    System.out.println("[d]ebug - Don't worry about it");
                    System.out.println("[c]onsume - Prompts you to consume an item from your bag");
                    System.out.println("e[q]uip - Prompts you to equip an item from your bag");
                    System.out.println("[u]nequip - Prompts you to unequip an item slot");
                    System.out.println("chec[k] - Prints out your current stats");
                    System.out.println("dro[p] - Prompts you to drop an item from your inventory");
                    System.out.println("m[o]nsterbook - Prints out your monster book");
                    System.out.println("help/? - You know");
                default:
                    System.out.println("That command is not recognized. Type 'help' or '?' for a list of commands");
            }
            if(look){
                handleTile(map.getTile(player), grassTile, rockTile, waterTile, sandTile, lavaTile, iceTile, player, consumables);
            }
        }
    }
    public static void handleTile(char tile, GrassTile grassTile, RockTile rockTile, WaterTile waterTile, SandTile sandTile,
                                  LavaTile lavaTile, IceTile iceTile, Player player, LinkedList consumables){
        Object result = null;
        switch(tile){
            case '#':
                System.out.println("You are on a grass tile");
                result = grassTile.handle();
                break;
            case ';':
                System.out.println("You are standing on a rock tile");
                result = rockTile.handle();
                break;
            case '~':
                System.out.println("You are floating in a water tile");
                result = waterTile.handle();
                break;
            case '=':
                System.out.println("You are standing on a sand tile");
                result = sandTile.handle();
                break;
            case '%':
                System.out.println("You are standing on a lava tile");
                result = lavaTile.handle();
                break;
            case '*':
                System.out.println("You are standing on a ice tile");
                result = iceTile.handle();
                break;
            default:
                System.out.println("uhhhhh you should never get this message");
        }
        if(!(result instanceof Boolean)){
            fight((Monster)result, player, consumables);
        }
    }
    public static void fight(Monster monster, Player player, LinkedList consumables){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A wild " + monster.getName() + " has appeared");
        if(!(player.inMonsterBook(monster.getName()))){
            System.out.println("Discovered a new monster! Recorded in monster book.");
            player.addToMonsterBook(monster.getName());
        }
        boolean turn = false;
        if(player.getSpeed() >= monster.getSpeed()){
            turn = true;
        }
        boolean run = false;
        while(monster.isAlive() && player.isAlive()){
            if(turn){
                System.out.println("What action will you take?");
                String input = scanner.nextLine();
                switch(input.toLowerCase()){
                    case "attack":
                    case "a":
                        Object result = player.attack(monster);
                        if(result instanceof Boolean){
                            System.out.println("Missed " + monster.getName());
                        }
                        else{
                            System.out.println("Damaged " + monster.getName() + " for " + result);
                        }
                        turn = false;
                        break;
                    case "check":
                    case "k":
                        System.out.println(player.getName());
                        System.out.println("Attack: " + player.getAttack());
                        System.out.println("Strength " + player.getStrength());
                        System.out.println("Defence " + player.getDefence());
                        System.out.println("Health: " + player.getHealth() + '/' + player.getMaxHealth());
                        System.out.println("Speed " + player.getSpeed());
                        System.out.println("Level: " + player.getLevel());
                        System.out.println("EXP: " + player.getExp());
                        break;
                    case "stats":
                    case "s":
                        System.out.println(monster.getName());
                        System.out.println("Attack: " + monster.getAttack());
                        System.out.println("Health: " + monster.getHealth() + '/' + monster.getMaxHealth());
                        System.out.println("Level: " + monster.getLevel());
                        System.out.println("Strength: " + monster.getStrength());
                        System.out.println("Defence: " + monster.getDefence());
                        System.out.println("Speed " + monster.getSpeed());
                        break;
                    case "consume":
                    case "c":
                        System.out.println("What item will you consume?");
                        input = scanner.nextLine();
                        boolean consumed = false;
                        for(Object i: consumables){
                            if(((Consumable)i).getName().equals(input) && player.inBag(input)){
                                consumed = true;
                                System.out.println("Consumed " + ((Consumable)i).getName() + " for " + player.consume((Consumable)i));

                            }
                        }
                        if(!consumed){
                            System.out.println("No such item as " + input + " in your bag");
                        }
                        turn = false;
                        break;
                    case "run":
                    case "r":
                        monster.damage(99999999);
                        run = true;
                        break;
                    case "help":
                    case "?":
                        System.out.println("Battle Commands:");
                        System.out.println("[a]ttack - Attack the enemy");
                        System.out.println("chec[k] - Prints out your current stats");
                        System.out.println("[s]ats - Prints out the enemy's stats");
                        System.out.println("[c]onsume - Prompts you to consume an item from your bag");
                        System.out.println("[r]un - Flees the battle");
                        System.out.println("help/? - You know");
                        break;
                    default:
                        System.out.println("Not a recognized command. Type 'help' or '?' for a list of commands");
            }

            }
            if(!turn && monster.isAlive()){
                Object result = monster.attack(player);
                if(result instanceof Boolean){
                    System.out.println(monster.getName() + " missed");
                }
                else{
                    System.out.println(monster.getName() + " hit you for " + result);
                }
                turn = true;
            }
        }
        if(player.isAlive() && !run){
            System.out.println("You have slain " + monster.getName());
            monster.reset();
            int exp = monster.handle();
            System.out.println("Gained " + exp + " EXP");
            player.expUp(exp);
        }
        else if(run){
            System.out.println("You run away from the " + monster.getName());
            monster.reset();
        }
        else{
            player.die();
        }
    }
}