package com.Alexis.demo;

import static com.Alexis.demo.Scann.*;

import static com.Alexis.demo.Colors.*;

public class Main {

    static Scann sc = new Scann();

    public static void main(String[] args) {

        Player player = new Player(2,2,2,2,1,2,2);
        System.out.println("Choose your character name:");
        player.setName(sc.nextLine());
        System.out.println("Welcome " + player);
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
                    switch (menuChoice){
                        case 1:
                            fightingMenu(player);

                            break;
                        case 2:
                            System.out.println("Status menu");

                            break;
                        case 3:
                            System.out.println("Thanks for playing!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("You need to choose a number between 1 - 3!");
                            startStop = true;
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Only numbers allowed");
                    startStop = true;
                }
            } while (startStop);
        }while (startStop);
    }

    public static void fightingMenu(Player player){
        System.out.println("Fighting Menu:" +
                "1 - FIGHT" +
                "2 - FLEE!" +
                "3 - STATUS" +
                "");
        switch (sc.nextInt()){
            case 1:
                System.out.println(RED + "You hear something closing in..." + RESET);
                break;
            case 2:
                System.out.println("You slowly turn around and... start fleeing!");
                break;
            case 3:
                player.getStatus();


        }
    }

}