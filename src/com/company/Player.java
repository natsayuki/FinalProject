package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Player {
    private String name;
    private int x;
    private int y;
    private int prevX = 0;
    private int prevY = 0;
    private LinkedList<LinkedList> map;
    private LinkedList bag = new LinkedList<>();

    private int attack = 5;
    private int strength = 5;
    private int defence = 5;
    private int speed = 5;
    private int health = 50;
    private int maxHealth = 50;
    private int exp = 0;
    private int level = 1;
    private Object hand = null;
    private Object body = null;
    private Object head = null;
    private Object feet = null;
    private boolean isAlive = true;

    private LinkedList antDropTable = new LinkedList<>();
    private LinkedList dragonWormDropTable = new LinkedList<>();
    private LinkedList empireAntDropTable = new LinkedList<>();
    private LinkedList evilLizardDropTable = new LinkedList<>();
    private LinkedList forstyTheSnowManDropTable = new LinkedList<>();
    private LinkedList iceManDropTable = new LinkedList<>();
    private LinkedList lavaDogDropTable = new LinkedList<>();
    private LinkedList lawsDropTable = new LinkedList<>();
    private LinkedList miniSarlaccDropTable = new LinkedList<>();
    private LinkedList petRockDropTable = new LinkedList<>();
    private LinkedList sankeDropTable = new LinkedList<>();
    private LinkedList superFastJellyfishDropTable = new LinkedList<>();


    LinkedList monsterNamesList = new LinkedList(Arrays.asList("Ant", "Dragon Worm", "Empire Ant", "Evil Lizard", "Forsty The Snow Man",
            "Ice Man", "Lava Dog", "Laws", "Mini Sarlacc", "Pet Rock", "Sanke", "Super Fast Jellyfish"));

    LinkedList monsterBook = new LinkedList(Arrays.asList("???", "???", "???", "???", "???", "???", "???", "???", "???", "???", "???", "???"));

    public Player(String name, int x, int y, LinkedList map, LinkedList antDropTable, LinkedList dragonWormDropTable, LinkedList empireAntDropTable,
                  LinkedList evilLizardDropTable, LinkedList forstyTheSnowManDropTable, LinkedList iceManDropTable, LinkedList lavaDogDropTable,
                  LinkedList lawsDropTable, LinkedList miniSarlaccDropTable, LinkedList petRockDropTable, LinkedList sankeDropTable,
                  LinkedList superFastJellyfishDropTable) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.map = map;
        this.antDropTable = antDropTable;
        this.dragonWormDropTable = dragonWormDropTable;
        this.empireAntDropTable = empireAntDropTable;
        this.evilLizardDropTable = evilLizardDropTable;
        this.forstyTheSnowManDropTable = forstyTheSnowManDropTable;
        this.iceManDropTable = iceManDropTable;
        this.lavaDogDropTable = lavaDogDropTable;
        this.lawsDropTable = lawsDropTable;
        this.miniSarlaccDropTable = miniSarlaccDropTable;
        this.petRockDropTable = petRockDropTable;
        this.sankeDropTable = sankeDropTable;
        this.superFastJellyfishDropTable = superFastJellyfishDropTable;
    }

    public boolean inMonsterBook(String name){
        int index = this.monsterNamesList.indexOf(name);
        if(index < 0){
            return false;
        }
        if(this.monsterBook.get(index) == "???"){
            return false;
        }
        return true;
    }

    public void addToMonsterBook(String name){
        int index = this.monsterNamesList.indexOf(name);
        this.monsterBook.set(index, name);
    }

    public void printMonsterBook(){
        for(Object i: this.monsterBook){
            System.out.println(i);
        }
    }

    public void getInfo(String name){
        if(inMonsterBook(name)){
            switch(name){
                case "Ant":
                    Monster ant = new Ant(antDropTable, this);
                    readify(ant);
                    break;
                case "Dragon Worm":
                    Monster dragonWorm = new DragonWorm(dragonWormDropTable, this);
                    readify(dragonWorm);
                    break;
                case "Empire Ant":
                    Monster empireAnt = new EmpireAnt(empireAntDropTable, this);
                    readify(empireAnt);
                    break;
                case "Evil Lizard":
                    Monster evilLizard = new EvilLizard(evilLizardDropTable, this);
                    readify(evilLizard);
                    break;
                case "Forsty The Snow Man":
                    Monster forstyTheSnowMan = new ForstyTheSnowMan(forstyTheSnowManDropTable, this);
                    readify(forstyTheSnowMan);
                    break;
                case "Ice Man":
                    Monster iceMan = new IceMan(iceManDropTable, this);
                    readify(iceMan);
                    break;
                case "Lava Dog":
                    Monster lavaDog = new LavaDog(lavaDogDropTable, this);
                    readify(lavaDog);
                    break;
                case "Laws":
                    Monster laws = new Laws(lawsDropTable, this);
                    readify(laws);
                    break;
                case "Mini Sarlacc":
                    Monster miniSarlacc = new MiniSarlacc(miniSarlaccDropTable, this);
                    readify(miniSarlacc);
                    break;
                case "Pet Rock":
                    Monster petRock = new PetRock(petRockDropTable, this);
                    readify(petRock);
                    break;
                case "Sanke":
                    Monster sanke = new Sanke(sankeDropTable, this);
                    readify(sanke);
                    break;
                case "Super Fast Jellyfish":
                    Monster superFastJellyfish = new SuperFastJellyfish(superFastJellyfishDropTable, this);
                    readify(superFastJellyfish);
                    break;
                default:
                    System.out.println("You should never see this message. Location MONSTERBOOK");
            }
        }
        else{
            System.out.println("No records on " + name);
        }
    }

    public void readify(Monster monster){
        System.out.println(monster.getImage());
        System.out.println(monster.getName() + ":");
        System.out.println("Attack: " + monster.getAttack());
        System.out.println("Health: " + monster.getMaxHealth());
        System.out.println("Level: " + monster.getLevel());
        System.out.println("Strength: " + monster.getStrength());
        System.out.println("Defence: " + monster.getDefence());
        System.out.println("Speed: " + monster.getSpeed());
        System.out.println("Drops: ");
        for(Object i: monster.getDropTable()){
            System.out.println(((Entity)i).getName());
        }

    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public Object getHand() {
        return hand;
    }

    public Object getBody() {
        return body;
    }

    public Object getHead() {
        return head;
    }

    public Object getFeet() {
        return feet;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public LinkedList getBag() {
        return bag;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }

    public int moveY(int amount){
        this.prevY = this.y;
        this.y += amount;
        testPos();
        return this.y;
    }

    public int moveX(int amount){
        this.prevX = this.x;
        this.x += amount;
        testPos();
        return this.x;
    }

    public void testPos(){
        if(
                (this.y < 0) ||
                (this.y == this.map.size()) ||
                (this.x < 0) ||
                (this.x == this.map.get(this.y).size())
                ){
            this.y = this.prevY;
            this.x = this.prevX;
        }
    }

    public int damage(int amount){
        amount -= this.defence;
        if(amount < 0){
            amount = 0;
        }
        this.health -= amount;
        if(this.health <= 0 ){
            this.isAlive = false;
            this.health = 0;
        }
        return amount;
    }

    public Object attack(Monster monster){
        int amount = this.strength + (int)(.5 * this.attack);
        if(random(1, this.attack) != 1){
            return monster.damage(amount);
        }
        return false;

    }

    public LinkedList consume(Consumable item){
        for(Object i: item.getEffects()){
            LinkedList curItem = (LinkedList) i;
            if(curItem.get(0).equals("Health")){
                heal((int)curItem.get(1));
            }
            else if(curItem.get(0).equals("Attack")){
                this.attack += (int)curItem.get(1);
            }
            else if(curItem.get(0).equals("MaxHealth")){
                this.maxHealth += (int)curItem.get(1);
            }
        }
        return item.getEffects();
    }

    public int heal(int amount){
        this.health += amount;
        if(this.health > this.maxHealth){
            this.health = this.maxHealth;
        }
        return amount;
    }

    public boolean equip(Equipable item){
        boolean done = false;
        if(inBag(item)){
            if(item.getType().equals("hand")){
                if(this.hand != null){
                    if(this.hand == item){
                        System.out.println(item.getName() + " already equipped");
                    }
                    else{
                        this.unequip("hand");
                    }
                }
                this.hand = item;
                done = true;
            }
            else if(item.getType().equals("body")){
                if(this.body != null){
                    if(this.body == item){
                        System.out.println(item.getName() + " already equipped");
                    }
                    else{
                        this.unequip("body");
                    }
                }
                this.body = item;
                done = true;
            }
            else if(item.getType().equals("head")){
                if(this.head != null){
                    if(this.head == item){
                        System.out.println(item.getName() + " already equipped");
                    }
                    else{
                        this.unequip("head");
                    }
                }
                this.head = item;
                done = true;
            }
            else if(item.getType().equals("feet")){
                if(this.feet != null){
                    if(this.feet == item){
                        System.out.println(item.getName() + " already equipped");
                    }
                    else{
                        this.unequip("feet");
                    }
                }
                this.feet = item;
                done = true;
            }
            for(Object i: item.getProperties()){
                if(((LinkedList)i).get(0).equals("Health")){
                    this.health += ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Attack")){
                    this.attack += ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("MaxHealth")){
                    this.maxHealth += ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Strength")){
                    this.strength += ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Defence")){
                    this.defence += ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Speed")){
                    this.speed += ((int)((LinkedList)i).get(1));
                }
            }
        }
        return done;

    }

    public void unequip(String type){
        Object done = false;
        if(type.equals("hand")){
            if(this.hand != null){
                done = "hand";
            }
        }
        else if(type.equals("body")){
            if(this.body != null){
                done = "body";
            }
        }
        else if(type.equals("head")){
            if(this.head != null){
                done = "head";
            }
        }
        else if(type.equals("feet")){
            if(this.feet != null){
                done = "feet";
            }
        }
        if(done instanceof String){
            LinkedList properties = new LinkedList();
            if(done == "hand"){
                properties = ((Equipable)this.hand).getProperties();
                this.hand = null;
            }
            else if(done == "body"){
                properties = ((Equipable)this.body).getProperties();
                this.body = null;
            }
            else if(done == "head"){
                properties = ((Equipable)this.head).getProperties();
                this.head = null;
            }
            else if(done == "feet"){
                properties = ((Equipable)this.feet).getProperties();
                this.feet = null;
            }
            for(Object i: properties){
                if(((LinkedList)i).get(0).equals("Health")){
                    this.health -= ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Attack")){
                    this.attack -= ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("MaxHealth")){
                    this.maxHealth -= ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Strength")){
                    this.strength -= ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Defence")){
                    this.defence -= ((int)((LinkedList)i).get(1));
                }
                else if(((LinkedList)i).get(0).equals("Speed")){
                    this.speed -= ((int)((LinkedList)i).get(1));
                }
            }
        }
    }

    public void addToBag(Object item){
        this.bag.add(item);
    }

    public void removeFromBag(Object item){
        this.bag.remove(item);
    }

    public boolean inBag(Object item){
        if(this.bag.contains(item)){
            return true;
        }
        return false;
    }

    public void expUp(int amount){
        this.exp += amount;
        handleLevel();
    }
    public void handleLevel(){
        if(this.exp >= (this.level*50)){
            this.exp = this.exp - this.level*50;
            levelUp(1);
            handleLevel();
        }
    }
    public void levelUp(int amount){
        this.level+= amount;
        System.out.printf("Attack: " + this.attack + " -> ");
        this.attack += Math.ceil((float)this.level*(float)1.5);
        System.out.printf(((Integer)this.attack).toString() + '\n');
        System.out.printf("Max Health " + this.maxHealth + " -> ");
        this.maxHealth += Math.ceil((float)this.level*(float)1.5);
        System.out.printf(((Integer)this.maxHealth).toString() + '\n');
        this.health += Math.ceil((float)this.level*(float)1.5);
    }
    public void die(){
        System.out.println("Oh dear you are dead");
        System.out.println("      /------------------\\       ");
        System.out.println("     |         RIP        |       ");
        System.out.println("     |        "  + getName() + "        |       ");
        System.out.println("     |                    |       ");
        System.out.printf("     |   Attack: " + getAttack() + "   ");
        if((((Integer)getAttack()).toString()).length() == 1){
            System.out.printf("  ");
        }
        else if((((Integer)getAttack()).toString()).length() == 2){
            System.out.printf(" ");
        }
        else if((((Integer)getAttack()).toString()).length() == 4){
            System.out.printf("");
        }
        System.out.printf("   |       \n");
        System.out.printf("     |   Health: " + getMaxHealth() + "  ");
        if((((Integer)getMaxHealth()).toString()).length() == 2){
            System.out.printf("  ");
        }
        else if((((Integer)getMaxHealth()).toString()).length() == 3){
            System.out.printf(" ");
        }
        else if((((Integer)getMaxHealth()).toString()).length() == 4){
            System.out.printf("");
        }
        System.out.printf("   |       \n");
        System.out.printf("     |   Level: " + getLevel() + "  ");
        if((((Integer)getLevel()).toString()).length() == 1){
            System.out.printf("    ");
        }
        else if((((Integer)getLevel()).toString()).length() == 2){
            System.out.printf("   ");
        }
        else if((((Integer)getLevel()).toString()).length() == 3){
            System.out.printf("  ");
        }
        System.out.printf("   |       \n");
        System.out.printf("     |   EXP: " + getExp() + "    ");
        if((((Integer)getExp()).toString()).length() == 1){
            System.out.printf("    ");
        }
        else if((((Integer)getExp()).toString()).length() == 2){
            System.out.printf("   ");
        }
        else if((((Integer)getExp()).toString()).length() == 3){
            System.out.printf("  ");
        }
        else if((((Integer)getExp()).toString()).length() == 4){
            System.out.printf(" ");
        }
        System.out.printf("   |       \n");
        System.out.printf("     |   Strength: " + getStrength() + "");
        if((((Integer)getExp()).toString()).length() == 1){
            System.out.printf("    ");
        }
        else if((((Integer)getStrength()).toString()).length() == 2){
            System.out.printf("  ");
        }
        else if((((Integer)getStrength()).toString()).length() == 3){
            System.out.printf(" ");
        }
        else if((((Integer)getStrength()).toString()).length() == 4){
            System.out.printf("");
        }
        System.out.printf("  |       \n");
        System.out.printf("     |   Defence: " + getDefence() + "");
        if((((Integer)getExp()).toString()).length() == 1){
            System.out.printf("    ");
        }
        else if((((Integer)getDefence()).toString()).length() == 2){
            System.out.printf("   ");
        }
        else if((((Integer)getDefence()).toString()).length() == 3){
            System.out.printf("  ");
        }
        else if((((Integer)getDefence()).toString()).length() == 4){
            System.out.printf(" ");
        }
        System.out.printf("   |       \n");
        System.out.printf("     |   Speed: " + getSpeed() + "  ");
        if((((Integer)getExp()).toString()).length() == 1){
            System.out.printf("    ");
        }
        else if((((Integer)getSpeed()).toString()).length() == 2){
            System.out.printf("   ");
        }
        else if((((Integer)getSpeed()).toString()).length() == 3){
            System.out.printf("  ");
        }
        else if((((Integer)getSpeed()).toString()).length() == 4){
            System.out.printf(" ");
        }
        System.out.printf("   |       \n");
        System.out.println("     |                    |       ");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.exit(1);
    }

    int random(int Min, int Max){
        return Min + (int)(Math.random() * ((Max - Min) + 1));
    }

}
