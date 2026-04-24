public class Main {
    public static void main(String[] args) {

        ProduktMenu espresso = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu americano = new ProduktMenu("K-02", "Americano", 13.5, "kawa");
        ProduktMenu latte = new ProduktMenu("K-03", "Latte", 14.0, "kawa");
        ProduktMenu tiramisu = new ProduktMenu("D-01", "Tiramisu", 16.0, "deser");
        ProduktMenu brownie = new ProduktMenu("D-02", "Brownie", 15.0, "deser");

        System.out.println("=== MENU ===");
        System.out.println(espresso);
        System.out.println(americano);
        System.out.println(latte);
        System.out.println(tiramisu);
        System.out.println(brownie);

        KlientKawiarni klient1 = new KlientKawiarni(100, "Julia", "Mazur", "j.mazur@mail.pl");
        KlientKawiarni klient2 = new KlientKawiarni(101, "Adam", "Nowak", "a.nowak@mail.pl");

        System.out.println("\n=== KLIENCI ===");
        System.out.println(klient1);
        System.out.println(klient2);

        Zamowienie zam1 = new Zamowienie(klient1);
        zam1.dodajProdukt(espresso);
        zam1.dodajProdukt(tiramisu);

        Zamowienie zam2 = new Zamowienie(klient2);
        zam2.dodajProdukt(americano);
        zam2.dodajProdukt(latte);
        zam2.dodajProdukt(brownie);

        System.out.println("\n=== ZAMÓWIENIA ===");

        System.out.println(zam1);
        System.out.println("Wartość: " + zam1.policzWartosc() + " zł");
        System.out.println("Liczba produktów: " + zam1.policzLiczbeProduktow());

        System.out.println();

        System.out.println(zam2);
        System.out.println("Wartość: " + zam2.policzWartosc() + " zł");
        System.out.println("Liczba produktów: " + zam2.policzLiczbeProduktow());

        System.out.println("\nLiczba produktów w systemie: " + ProduktMenu.getLiczbaProduktow());

        ProduktMenu testProdukt = new ProduktMenu("K-01", "Espresso Kopia", 9.0, "kawa");
        System.out.println("\nCzy espresso i kopia są równe? " + espresso.equals(testProdukt));

        KlientKawiarni testKlient = new KlientKawiarni(999, "Julia", "Mazur", "j.mazur@mail.pl");
        System.out.println("Czy klienci są równi? " + klient1.equals(testKlient));

        zam1.oznaczJakoOplacone();

        System.out.println("\nPo opłaceniu zamówienia:");
        System.out.println(zam1);
    }
}