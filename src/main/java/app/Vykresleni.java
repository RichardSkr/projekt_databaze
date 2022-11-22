package app;

public class Vykresleni {
    //statické metody pro vypsání textu
    public static void jmeno() {
        System.out.println("Zadejte jméno pojištěného: ");
    }
    public static void prijmeni() {
        System.out.println("Zadejte příjmení: ");
    }
    public static void tel() {
        System.out.println("Zadejte tel. číslo ve tvaru 123123123 ");
    }
    public static void  vek() {
        System.out.println("Zadejte věk: ");
    }
    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Evidence pojištěnců");
        System.out.println("1 - Přidat nového pojištěnce");
        System.out.println("2 - Vypsat všechny pojištěnce");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.println("--------------------------------");
    }
    public static void zadejPrikaz() {
        System.out.print("Zadejte příkaz k provedení: ");
    }
    public static void zavri() {
        System.out.println("Děkuji za použití, ukončuji program.");
    }
    public static void vyjimka() {
        System.out.println("Nezadal jsi číslo, opakuj akci!");
    }
}

