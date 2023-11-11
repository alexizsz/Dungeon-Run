package com.Alexis.demo;

public class Player implements ICombat {


    String name;
    int strength;
    int agility;
    int intellect;
    int exp;
    int level;
    int health;
    int baseDamage;



    public int getDamage() {
        return baseDamage;
    }

    public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }


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
    public void combatSound(){
        System.out.println("Schwing!");
    }

    @Override
    public void damageTaken() {
        System.out.println("Ouch!");
    }

    @Override
    public void damageGiven() {
        System.out.println("Ha ha!");
    }

    @Override
    public void dyingSound(){
        System.out.println("Aooooouuwww...... ;)");
    }

    public void getStatus() {
        System.out.printf("Name: %s %n", name);
        System.out.printf("Strength: %d %n", strength);
        System.out.printf("Intelligence: %d %n", intellect);
        System.out.printf("Agility: %d %n", agility);
        System.out.printf("Health: %d %n", health);
        System.out.printf("Experience: %d %n", exp);
        System.out.printf("Level: %d %n", level);
        System.out.printf("BaseDamage: %d %n", baseDamage);
    }

}
