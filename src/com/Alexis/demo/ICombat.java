package com.Alexis.demo;

import java.util.Random;

public interface ICombat {


    default void combatSound() throws InterruptedException{
        Thread.sleep(999);
    }
    void damageGiven();
    void damageTaken();
    void dyingSound();



}
