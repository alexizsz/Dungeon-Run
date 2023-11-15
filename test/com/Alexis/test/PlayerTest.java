package com.Alexis.test;

import com.Alexis.demo.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {


    @Test
    void testUpdateXP() {
        Player player = new Player(1,1,1,0,1,1,1);

        int initialLevel = player.getLevel();
        int initialXP = player.getExp();

        player.updateXP(50);

        assertEquals(initialLevel, player.getLevel(), "Level should remain the same");
        assertEquals(initialXP + 50, player.getExp(), "XP increased");
    }

    @Test
    void testUpdateXPLevelUp() {
        Player player = new Player(1,1,1,0,1,1,1);

        int initialLevel = player.getLevel();
        int initialXP = player.getExp();

        player.updateXP(110);

        assertEquals(initialLevel + 1, player.getLevel(), "Level should increase");
        assertEquals((initialXP + 110) - 100, player.getExp(), "XP should be adjusted after leveling up");
    }
}