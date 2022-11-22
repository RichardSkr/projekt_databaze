package app;

import java.util.ArrayList;
import java.util.List;

public class Databaze {
    private final List<Pojistenec> pojistenci;
    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Přidání pojištěného
     * @param pojistenec vytvorena instance pojistence
     */
    public void pridejPojistence(Pojistenec pojistenec) {
        pojistenci.add(pojistenec);
    }

    /**
     * Zobrazení pojistěných
     */
    public void zobrazPojistene() {
        for(Pojistenec pojisteny : pojistenci) {
            System.out.println(pojisteny);
        }
    }

    /**
     * Vyhledání pojištěného
     * @param jmeno hledane jmeno
     * @param prijmeni hledame prijmeni
     */
    public void najdiPojisteneho(String jmeno, String prijmeni) {
        pojistenci.stream()
                .filter(p -> jmeno.equals(p.getKrestni()) && prijmeni.equals(p.getPrijmeni()))
                .forEach(System.out::println);
    }


}
