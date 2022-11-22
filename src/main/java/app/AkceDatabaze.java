package app;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AkceDatabaze {
    /**
     * Scanner pro získání vstupů
     */
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
    /**
     * Instance databaze
     */
    Databaze databaze = new Databaze();

    /**
     * While smyčka
     * Smyčka pro volbu operace
     */
    public void program() {
        String prikaz = "";
        while (!prikaz.equals("4")) {
            Vykresleni.menu();
            Vykresleni.zadejPrikaz();
            prikaz = sc.nextLine();

            switch (prikaz) {
                case "1" -> pridatPojistence();
                case "2" -> zobrazPojistene();
                case "3" -> najdiPojistence();
                case "4" -> Vykresleni.zavri();
            }
        }
    }

    /**
     * Metoda pro přidání pojištěného do databáze
     */
    public void pridatPojistence() {
        Vykresleni.jmeno();
        String krestni = sc.nextLine();
        Vykresleni.prijmeni();
        String prijmeni = sc.nextLine();

        //Přidání a odchycení tel. čísla
        int cislo = 0;
        boolean jePlatny = false;
        do {
            Vykresleni.tel();
            try {
                cislo = Integer.parseInt(sc.nextLine());
                jePlatny = true;
            } catch (Exception e) {
                Vykresleni.vyjimka();
            }
        } while (!jePlatny);

        //přidání a odchycení věku
        int vek = 0;
        boolean plati = false;
        do {
            Vykresleni.vek();
            try {
                vek = Integer.parseInt(sc.nextLine());
                plati = true;
            } catch (Exception e) {
                Vykresleni.vyjimka();
            }
        } while (!plati);

        //vytvoření instance pojištěného a vložení do listu
        Pojistenec pojistenec = new Pojistenec(krestni,prijmeni,cislo,vek);
        databaze.pridejPojistence(pojistenec);
    }

    /**
     * Metoda pro zobrazení všech pojištěných
     */
    public void zobrazPojistene() {
        databaze.zobrazPojistene();
    }

    /**
     * Metoda pro vyhledání pojištěného
     */
    public void najdiPojistence() {
        Vykresleni.jmeno();
        String jmeno = sc.nextLine().trim();
        Vykresleni.prijmeni();
        String prijmeni = sc.nextLine().trim();
        databaze.najdiPojisteneho(jmeno, prijmeni);
    }


}
