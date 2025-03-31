package ch.gol.gameoflife;

import org.junit.jupiter.api.Test;

public class InterfaceTest {

    @Test
    void testOnHelloButtonClick() {
        // Create an instance of the GameInterface class
        Interface gameInterface = new Interface();

        // Call the method to be tested
        gameInterface.onHelloButtonClick();

        // Add assertions to verify the expected behavior
        // For example, you can check if the welcomeText label was updated correctly
        // assertEquals("Welcome to JavaFX Application!", gameInterface.getWelcomeText());
    }
}
