package com.Alexis.demo;

public class Player implements ICombat {


    String name;
    int strength;
    int agility;
    int intellect;
    int exp;
    int level;
    int health;
    int damage;



    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public Player(String name, int strength, int agility, int intellect, int exp, int level, int health, int damage) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.exp = exp;
        this.level = level;
        this.health = health;
        this.damage = damage;
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

    public void dyingSound(){
        System.out.println("Aooooouuwww...... ;)");
    }
}
