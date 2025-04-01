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

        gameInterface.CellClicked(0, 0);
        gameInterface.CellClicked(1, 0);
        gameInterface.NextGeneration();
        assertTrue(gameInterface.IsCellShouldBeAlive(1, 1));

        gameInterface.CellClicked(5, 0);
        gameInterface.NextGeneration();
        assertFalse(gameInterface.IsCellShouldBeAlive(5, 1));
    }

    @Test
    public void testKillOrReviveCell() {
        Interface gameInterface = new Interface();

        gameInterface.CellClicked(0, 0);
        gameInterface.KillOrReviveCell(0, 0);
        assertFalse(gameInterface.IsCellAlive(0, 0));

        gameInterface.KillOrReviveCell(5, 0);
        assertTrue(gameInterface.IsCellAlive(5, 0));
    }
}
