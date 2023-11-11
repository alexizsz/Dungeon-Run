package com.Alexis.demo;

public class Main {
    public static void main(String[] args) {
        Scann sc = new Scann();

        System.out.println("Choose your character name:");
        Player player = new Player(sc.nextLine());
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
                            Monster monsterOne = new Monster(1,1,1,1,1,1);
                            System.out.println("Fighting menu");
                            player.combatSound();
                            player.damageGiven();
                            monsterOne.damageTaken();
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
}