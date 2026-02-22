package UppgiftMorse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMorse {

    @Test
    public void testAtoMorse() {
        // Arrange
        Morse converter = new Morse();
        String expected = ".-";
        // Act
        String actual = converter.toMorse("A");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testABtoMorse() {
        // Arrange
        Morse converter = new Morse();
        String expected = ".- -...";
        // Act
        String actual = converter.toMorse("AB");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testaToMorse() {
        // Arrange
        Morse converter = new Morse();
        String expected = ".-";
        // Act
        String actual = converter.toMorse("a");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testAToLetter() {
        // Arrange
        Morse converter = new Morse();
        String expected = "A";
        // Act
        String actual = converter.toLetters(".-");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testABToLetters() {
        // Arrange
        Morse converter = new Morse();
        String expected = "AB";
        // Act
        String actual = converter.toLetters(".- -...");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWrongSymbolToMorse() {
        // Arrange
        Morse converter = new Morse();
        String expected = "Det där var inte en bokstav!";
        // Act
        String actual = converter.toMorse("/");
        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWrongSymbolToLetters() {
        // Arrange
        Morse converter = new Morse();
        String expected = "Det där var inte morsekod!";
        // Act
        String actual = converter.toLetters("KJ");
        // Assert
        assertEquals(expected, actual);
    }
}
