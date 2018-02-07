package com.company;

import java.util.LinkedList;

public abstract class Monster {
    String name = "name";
    String image = " ";
    int health = 0;
    int attack = 0;
    int strength = 0;
    int defence = 0;
    int speed = 0;
    int maxHealth = 0;
    boolean isAlive = true;
    int level = 0;
    int exp = 0;
    Player player;
    LinkedList dropTable = new LinkedList<>();

    public LinkedList getDropTable() {
        return dropTable;
    }

    public String getImage() {
        return image;
    }

    public Object attack(Player player){
        int amount = this.strength + (int)(.5 * this.attack);
        if(random(1, this.attack) != 1){
            return player.damage(amount);
        }
        return false;

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

    int handle(){
       if(random(1, 3) == 1 ){
           int number = random(0, this.dropTable.size()-1);
           player.addToBag(this.dropTable.get(number));
           System.out.println(this.name + " dropped a " + ((Entity)this.dropTable.get(number)).getName() + ". Added to bag");
       }
       return this.exp;
    }

    void reset(){
        this.health = this.maxHealth;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAlive(){
        return this.isAlive;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getLevel() {
        return level;
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

    int random(int Min, int Max){
        return Min + (int)(Math.random() * ((Max - Min) + 1));
    }
}
