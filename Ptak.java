public class Ptak extends Zwierze {
    private boolean potrafiLatać;

    public Ptak(String nazwa, int wiek, boolean potrafiLatać) {
        super(nazwa, wiek);
        this.potrafiLatać = potrafiLatać;
    }

    @Override
    public String wydajDzwiek() {
        return "kwak kwak";
    }

    @Override
    public String poruszSie() {
        return "ślizga się po lodzie";
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Pingwin: " + nazwa + ", wiek: " + wiek + ", lata: " + potrafiLatać);
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Antarktyda";
    }
}