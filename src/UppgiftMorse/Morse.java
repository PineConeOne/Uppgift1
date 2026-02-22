package UppgiftMorse;

import java.util.HashMap;
import java.util.Arrays;

public class Morse {
    // Attribut
    HashMap<String, String> mapToLetters = new HashMap<>();
    HashMap<String, String> mapToMorse = new HashMap<>();

    // skapa hashmap i konstruktor/s
    public Morse() {
        // Skapar en array med bokstäverna A-Z
        String[] lettersArray = new String[26];
        for (int i = 0; i < 26;i++) {
            lettersArray[i] = String.valueOf((char) ('A' + i));
        }
        // Array med motsvarande morse.
        String[] morseArray = {".-", "-...", "-.-.",  "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        // HashMap skapas
        for (int i = 0; i < lettersArray.length; i++) {
            mapToLetters.put(morseArray[i], lettersArray[i]);
        }
        for (int i = 0; i < lettersArray.length; i++) {
            mapToMorse.put(lettersArray[i], morseArray[i]);
        }
    }

    public String toLetters(String textIn) {
        String[] textArray = textIn.split(" ");
        String textOut = "";
        String morseConverted = "";
        for (int i = 0; i < textArray.length; i++) {
            if (!mapToLetters.containsKey(textArray[i])) {
                return "Det där var inte morsekod!";
            } else {
                morseConverted = mapToLetters.get(textArray[i]);
                textOut += morseConverted;
            }
        }
        return textOut;
    }

    // Metod för att göra om bokstäver till morsekod.
    public String toMorse(String textIn) {
        textIn = textIn.replace(" ", "").toUpperCase();
        String[] textArray = textIn.split("");
        String textOut = "";
        String letterConverted;
        for (int i = 0; i < textArray.length; i++) {
            // ToUppercase här på varje bokstav.
            if (!mapToMorse.containsKey(textArray[i])) {
                return "Det där var inte en bokstav!";
            }
            letterConverted = mapToMorse.get(textArray[i]); // toupper case ta bort om inte funkar
            textOut += letterConverted;
            if (i < textArray.length - 1) textOut += " ";
        }
        return textOut;
    }
}

// Felhantering - specialtecken, små bokstäver, siffror m.m.

// Göra samma sak för morsekod()översätta, dela upp)

// Dela upp texten så att den hanterar ett tecken i taget. split.

// steg 1: översätta ett tecken till rätt morse
// Översätt ett tecken i taget






// String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

