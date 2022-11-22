package app;

public class Pojistenec {
    /**
     * Atributy
     */
    private final String krestni;
    private final String prijmeni;
    private final int cislo;
    private final int vek;

    /**
     * Konstruktor
     * @param krestni jmeno instance pojistence
     * @param prijmeni prijmeni instance pojistence
     * @param cislo cislo prijmeni intance pojistence
     * @param vek vek instance pojistence
     */
    public Pojistenec(String krestni, String prijmeni, int cislo, int vek) {
        this.krestni = krestni;
        this.prijmeni = prijmeni;
        this.cislo = cislo;
        this.vek = vek;
    }
    /**
     * toString
     * @return textovou reprezentaci Pojištěného
     */
    @Override
    public String toString() {
        return "Jméno: " + krestni + " " + prijmeni + ", Tel číslo: " + cislo + ", Věk: " + vek;
    }
    /**
     * Getter
     * @return krestni
     */
    public String getKrestni() {
        return krestni;
    }
    /**
     * Getter
     * @return prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }
}
