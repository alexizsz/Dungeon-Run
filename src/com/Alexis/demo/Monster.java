package com.Alexis.demo;

import java.util.ArrayList;
import java.util.Random;

public class Monster implements ICombat{


    ArrayList<String> monsters = new ArrayList<>(12);

    


    int strength;
    int agility;
    int intellect;
    int level;
    int health;
    int damage;

    public Monster(int strength, int agility, int intellect, int level, int health, int damage) {
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.level = level;
        this.health = health;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void combatSound() {
        System.out.println("Slap!");
    }

    @Override
    public void damageTaken() {
        System.out.println("HNYAAAA!!");
    }

    @Override
    public void damageGiven() {
        System.out.println("hyaaaa!");
    }

    @Override
    public void dyingSound() {
        System.out.println("aaaaaaaaaaaah!!");
    }
}
