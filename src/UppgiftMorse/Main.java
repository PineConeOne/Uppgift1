package UppgiftMorse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Morse converter = new Morse();
        String answer = "";
        System.out.println("Vill du konvertera till bokstäver(1) eller morsekod(2)?");
        String toLettersOrMorse = s.nextLine();
        if (toLettersOrMorse.equals("1")) {
            System.out.println("Skriv in morsekoden som du vill konvertera, separerade med mellanrum: ");
            answer = converter.toLetters(s.nextLine());
        } else if (toLettersOrMorse.equals("2")) {
            System.out.println("Skriv in bokstäverna som du vill konvertera: ");
            answer = converter.toMorse(s.nextLine());
        } else {
            System.out.println("Du kunde bara välja 1(bokstäver) eller 2(morsekod).");
        }
        System.out.println(answer);
    }
}