package UppgiftMorse;

import java.util.HashMap;
import java.util.Arrays;

public class Morse {
    // Attribut
    HashMap<String, String> mapToLetters = new HashMap<>();
    HashMap<String, String> mapToMorse = new HashMap<>();

    // skapa hashmap i konstruktorn
    public Morse() {
        String[] lettersArray = new String[26];
        // Loop för att skapa en array med bokstäverna A-Z.
        for (int i = 0; i < 26;i++) {
            // Stoppar in värdet av
            lettersArray[i] = String.valueOf((char) ('A' + i));
        }
        String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < lettersArray.length; i++) {
            mapToLetters.put(morseArray[i], lettersArray[i]);
            mapToMorse.put(lettersArray[i], morseArray[i]);
        }
    }

    // Metod för att konvertera till bokstäver.
    public String toLetters(String textIn) {
        String[] textArray = textIn.split(" "); // Delar inkommande sträng vid mellanrummen.
        String textOut = ""; // Skapar två strängar för att skapa outputen.
        String morseConverted;
        // Loop för att hantera konverteringen.
        for (int i = 0; i < textArray.length; i++) {
            if (!mapToLetters.containsKey(textArray[i])) { // Letar i Hashmapen efter det vi skrivit in, om det ej finns skrivs ett felmeddelande ut.
                return "Det där var inte morsekod!";
            } else {
                morseConverted = mapToLetters.get(textArray[i]); // Själva konverteringskoden.
                textOut += morseConverted;
            }
        }
        return textOut;
    }

    // Metod för att konvertera till morsekod.
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


//public Morse() {
//    String[] lettersArray = new String[26];
//    for (int i = 0; i < 26;i++) {
//        lettersArray[i] = String.valueOf((char) ('A' + i));
//    }
//    String[] morseArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//    for (int i = 0; i < lettersArray.length; i++) {
//        mapToLetters.put(morseArray[i], lettersArray[i]);
//    }
//    for (int i = 0; i < lettersArray.length; i++) {
//        mapToMorse.put(lettersArray[i], morseArray[i]);
//    }
//}
