package com.Alexis.demo;

import java.util.Random;
import static com.Alexis.demo.Colors.*;
public class Monster implements ICombat{

    int strength;
    int level;
    int health;
    int baseDamage;
    int givesExp;

    public void levelUp(){
        this.setLevel(level + 1);
        this.setStrength(this.getStrength() + 1);
        this.setHealth(this.getHealth() + 3);
        this.setDamage(this.getDamage() + 1);
    }
    public Monster(int strength, int level, int health, int baseDamage) {
        this.strength = strength;
        this.level = level;
        this.health = health;
        this.baseDamage = baseDamage;
        this.givesExp = new Random().nextInt(80,120);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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
        return baseDamage + strength;
    }

    public void setDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public void takeDamage(int baseDamage) {
        setHealth( getHealth() - baseDamage );
    }
    @Override
    public void combatSound() {
        System.out.println(RED + "The monster attacks: Slap!" + RESET);
    }

    @Override
    public void damageTaken() {
        System.out.println(RED + "Monster takes a hit! : HNYAAAA!!" + RESET);
    }

    @Override
    public void damageGiven() {
        System.out.println(RED  + "hyaaaa!" + RESET);
    }

    @Override
    public void dyingSound() {System.out.println(RED + "aaaaaaaaaaaah!!" + RESET);}
}
