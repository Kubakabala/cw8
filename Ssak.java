public class Ssak extends Zwierze {
    private String grzywaKolor;

    public Ssak(String nazwa, int wiek, String grzywaKolor) {
        super(nazwa, wiek);
        this.grzywaKolor = grzywaKolor;
    }

    @Override
    public String wydajDzwiek() {
        return "Roooar!";
    }

    @Override
    public String poruszSie() {
        return "biegnie na czterech łapach";
    }

    @Override
    public void wyswietlInformacje() {
        System.out.println("Lew: " + nazwa + ", wiek: " + wiek + ", kolor grzywy: " + grzywaKolor);
    }

}
