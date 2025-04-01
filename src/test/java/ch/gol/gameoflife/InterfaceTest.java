package ch.gol.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterfaceTest {


    @Test
    public void testNextGeneration() {
        Interface gameInterface = new Interface();
        protected int generation = 0;
        gameInterface.nextGeneration();
        assertTrue(gameInterface.generation == 1);
    }

    @Test
    public void testCellClicked() {
        Interface gameInterface = new Interface();

        gameInterface.CellClicked(0, 0);
    }

    @Test
    public void testIsCellAlive() {
        Interface gameInterface = new Interface();

        gameInterface.CellClicked(0, 0);
        assertTrue(gameInterface.IsCellAlive(0, 0));

        gameInterface.CellClicked(5, 0);
        assertFalse(gameInterface.IsCellAlive(5, 1));
    }


    // TEST for having an infinite map
    // On going ...

}
