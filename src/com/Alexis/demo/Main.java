package com.Alexis.demo;

import static com.Alexis.demo.Scann.*;

import static com.Alexis.demo.Colors.*;

public class Main {

    static Scann sc = new Scann();

    public static void main(String[] args) {

        Player player = new Player(2,2,2,2,1,2,2);
        System.out.println("Choose your character name:");
        player.setName(sc.nextLine());
        System.out.println("Welcome " + player.getName());
        mainMenu(player);
    }

    public static void fightingMenu(Player player){
        System.out.println("Welcome " + player.getName() + " to the fighting menu:" +
                "\n1 - FIGHT" +
                "\n2 - FLEE!" +
                "\n3 - STATUS");
        switch (sc.nextInt()){
            case 1:
                Monster monster = new Monster(1,1,10,1);
                System.out.println(RED_BOLD + "You hear something closing in..." + RESET);
                battleMenu(player, monster);
                break;
            case 2:
                System.out.println(YELLOW + "You slowly turn around and... start fleeing!" + RESET);
                System.out.println(RED_BOLD + RED_UNDERLINED + "GAME OVER");
                System.exit(0);
                break;
            case 3:
                player.getStatus();
                fightingMenu(player);


        }
    }

    public static void battleMenu(Player player, Monster monster){

        System.out.println(RED_BOLD + "Battle begins!" + RESET);
        System.out.println(player.getName() + " starts attacking..");
        player.combatSound();
        monster.takeDamage(player.baseDamage);
        monster.damageTaken();
        player.damageGiven();

        if (monster.getHealth() <= 0){
            System.out.println("Congratulations, you have defeated this monster!");
            monster.levelUp();
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
            fightingMenu(player);
            }
        }
    }

    public static void mainMenu(Player player){
        System.out.println("""
                Welcome to the menu:
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
                        case 1 -> fightingMenu(player);
                        case 2 -> {
                            System.out.println("Status menu:\n ");
                            player.getStatus();
                            mainMenu(player);
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