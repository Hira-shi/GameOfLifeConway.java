package ch.gol.gameoflife;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UITest {

    @Test
    void testUI() {
        UI ui = new UI();
    }

    @Test
    public void testResetButton() {
        Interface gameInterface = new Interface();

        gameInterface.CellClicked(0, 0);
        gameInterface.resetButton();
        assertFalse(gameInterface.IsCellAlive(0, 0));
    }

    @Test
    public void testMovingButton() {
        Interface gameInterface = new Interface();
        UI ui = new UI();

        // Dont know how to do it now.
    }

    @Test
    public void testPauseButton() {
        Interface gameInterface = new Interface();
        UI ui = new UI();

        // Dont know how to do it now.
    }

    // Start Generation button
    @Test
    public void testStartButton() {
        Interface gameInterface = new Interface();

    }

}
