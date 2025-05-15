public class Gad extends Zwierze {
    private double dlugosc;

    public Gad(String nazwa, int wiek, double dlugosc) {
        super(nazwa, wiek);
        this.dlugosc = dlugosc;
    }

    @Override
    public String wydajDzwiek() {
        return "chrrr!";
    }

    @Override
    public String poruszSie() {
        return "pełza po ziemi";
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Krokodyl: " + nazwa + ", wiek: " + wiek + ", długość: " + dlugosc + " m");
    }

    @Override
    public String srodowiskoNaturalne() {
        return "rzeki i bagna";
    }
}
