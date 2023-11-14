package com.Alexis.demo;
import static com.Alexis.demo.Colors.*;
public class Player implements ICombat {


    String name;
    int strength;
    int agility;
    int intellect;
    int exp;
    int level;
    int health;
    int baseDamage;


    public void updateXP(int newXP){
        exp += newXP;
        while(exp >= 100){
            levelUp();
            System.out.println("You have gained a level!");
            exp -= 100;
        }
    }

    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setStrength(this.getStrength() + 1);
        this.setHealth(this.getHealth() + 3);
        this.setAgility(this.getAgility() + 1);
        this.setIntellect(this.getIntellect());
    }

    public int getDamage() {
        return baseDamage + strength;
    }

    /*public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }*/


    public Player(int strength, int agility, int intellect, int exp, int level, int health, int baseDamage) {
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.exp = exp;
        this.level = level;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getExp(int exp) {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Player(String name) {
        this.name = name;
    }
    @Override
    public void combatSound() {
        System.out.println(GREEN + getName() + " attacks : Schwing!" + RESET);
    }
    @Override
    public void damageTaken() {
        System.out.println(GREEN + getName() + ": Ouch!" + RESET);
    }
    @Override
    public void damageGiven() {
        System.out.println(GREEN + getName() + ": Ha ha!" + RESET);
    }
    @Override
    public void dyingSound(){
        System.out.println(GREEN + getName() + ": Aooooouuwww...... ;)" + RESET);
    }
    public void getStatus() {
        System.out.printf(BLACK_BACKGROUND_BRIGHT + BLACK_BOLD + "Name: %s %n", name);
        System.out.printf("Strength: %d %n", strength);
        System.out.printf("Intelligence: %d %n", intellect);
        System.out.printf("Agility: %d %n", agility);
        System.out.printf("Health: %d %n", health);
        System.out.printf("Experience: %d %n", exp);
        System.out.printf("Level: %d %n", level);
        System.out.printf("BaseDamage: %d %n", baseDamage);
        System.out.println(RESET);
    }
    public void takeDamage(int damage) {
        setHealth( getHealth() - damage );
    }


}
