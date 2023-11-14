package com.Alexis.demo;

import java.util.Random;

import static com.Alexis.demo.Scann.*;

import static com.Alexis.demo.Colors.*;

public class Main {

    static Scann sc = new Scann();


    /*TODO
    *  TESTER FÖR:
    * MONSTER GAINS LEVEL VARJE EFTER VARJE FIGHT
    * PLAYER GAINS LEVEL EFTER VARJE FIGHT*/
    public static void main(String[] args) {

        Monster monster = new Monster(1, 1, 10, 1);
        Player player = new Player(2,2,2,0,1,100,2);
        System.out.println("Choose your character name:");
        player.setName(sc.nextLine());
        System.out.println("Welcome " + player.getName());
        mainMenu(player, monster);
    }

    public static void fightingMenu(Player player, Monster monster){
        System.out.println("Welcome to the fighting menu " +  player.getName() + ":" +
                "\n1 - FIGHT" +
                "\n2 - FLEE!" +
                "\n3 - STATUS");
        switch (sc.nextInt()) {
            case 1 -> {
                System.out.println(RED_BOLD + "You hear something closing in..." + RESET);
                battleMenu(player, monster);
            }
            case 2 -> {
                System.out.println(YELLOW + "You slowly turn around and... start fleeing!" + RESET);
                System.out.println(RED_BOLD + RED_UNDERLINED + "GAME OVER");
                System.exit(0);
            }
            case 3 -> {
                player.getStatus();
                fightingMenu(player,monster);
            }
        }
    }
    public static void battleMenu(Player player, Monster monster){

        System.out.println(RED_BOLD + "Battle begins!" + RESET);
        System.out.println("Your are facing a monster of a level of :" + monster.getLevel());
        System.out.println(player.getName() + " starts attacking..");

        player.combatSound();
        monster.takeDamage(player.getDamage());
        monster.damageTaken();
        player.damageGiven();

        if (monster.getHealth() <= 0){
            System.out.println("Congratulations, you have dealt " + player.getDamage() +
                    " damage and defeated this monster and have gained " + monster.givesExp + " xp!");
            player.updateXP(monster.givesExp);

            monster.levelUp();

            mainMenu(player,monster);
        } else {
            System.out.println("The Monster took " + player.getDamage() + " damage and have " +
                    "" + monster.getHealth() + " health remaining");

            monster.combatSound();
            player.takeDamage(monster.baseDamage);
            if (player.getHealth() <= 0) {
                System.out.println(player.getName() + "has taken too much damage!!! ");
                player.dyingSound();
                System.out.println(RED_BOLD + RED_UNDERLINED + "GAME OVER");
                System.exit(0);
            }else {
            System.out.println("You took " + monster.getDamage() + " damage and have " +
                    "" + player.getHealth() + " health remaining");
            player.damageTaken();
            monster.damageGiven();
            fightingMenu(player,monster);
            }
        }
    }

    public static void mainMenu(Player player, Monster monster){
        System.out.println("""
                \n\tWelcome to the menu:
                1 - FIGHT
                2 - STATUS
                3 - EXIT GAME""");
        boolean startStop;
        do {
            do {
                startStop = false;
                try {
                    int menuChoice = Integer.parseInt(sc.nextLine());
                    switch (menuChoice) {
                        case 1 -> fightingMenu(player,monster);
                        case 2 -> {
                            System.out.println("Status menu:\n ");
                            player.getStatus();
                            mainMenu(player,monster);
                        }
                        case 3 -> {
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                        }
                        default -> {
                            System.out.println("You need to choose a number between 1 - 3!");
                            startStop = true;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Only numbers allowed");
                    startStop = true;
                }
            } while (startStop);
        }while (startStop);
    }


}