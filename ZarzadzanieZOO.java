public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = new Zwierze[3];
        zwierzeta[0] = new Ssak("Simba", 5, "złoty");
        zwierzeta[1] = new Ptak("Pingu", 3, false);
        zwierzeta[2] = new Gad("Snappy", 7, 4.5);

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Porusza się: " + z.poruszSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println("-----");
        }
    }
}