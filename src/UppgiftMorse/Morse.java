package UppgiftMorse;

import java.util.HashMap;
import java.util.Arrays;

public class Morse {
    // Attribut
    HashMap<String, String> mapToLetters = new HashMap<>();
    HashMap<String, String> mapToMorse = new HashMap<>();

    // skapa hashmap i konstruktor/s
    public Morse() {
        String[] lettersArray = new String[26];
        for (int i = 0; i < 26;i++) {
            lettersArray[i] = String.valueOf((char) ('A' + i));
        }
        String[] morseArray = {".-", "-...", "-.-.",  "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
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

    public String toMorse(String textIn) {
        textIn = textIn.replace(" ", "").toUpperCase();
        String[] textArray = textIn.split("");
        String textOut = "";
        String letterConverted;
        for (int i = 0; i < textArray.length; i++) {
            if (!mapToMorse.containsKey(textArray[i])) {
                return "Det där var inte en bokstav!";
            }
            letterConverted = mapToMorse.get(textArray[i]);
            textOut += letterConverted;
            if (i < textArray.length - 1) textOut += " ";
        }
        return textOut;
    }
}
