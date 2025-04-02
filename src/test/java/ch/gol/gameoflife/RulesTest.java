package ch.gol.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RulesTest {

    @Test
    void testRules() {
        Rules rules = new Rules();

    }

    @Test
    public void testIsCellShouldBeAlive() {
        Interface gameInterface = new Interface();
        Rules rules = new Rules();

        gameInterface.CellClicked(0, 0);
        gameInterface.CellClicked(1, 0);
        gameInterface.NextGeneration();
        assertTrue(rules.IsCellShouldBeAlive(1, 1));

        gameInterface.CellClicked(5, 0);
        gameInterface.NextGeneration();
        assertFalse(rules.IsCellShouldBeAlive(5, 1));
    }

    @Test
    public void testKillOrReviveCell() {
        Interface gameInterface = new Interface();
        Rules rules = new Rules();

        gameInterface.CellClicked(0, 0);
        gameInterface.KillOrReviveCell(0, 0);
        assertFalse(gameInterface.IsCellAlive(0, 0));

        rules.KillOrReviveCell(5, 0);
        assertTrue(gameInterface.IsCellAlive(5, 0));
    }
}
