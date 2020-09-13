package definisanjeklasagetterasettera;

public class RadSaKlasamaAutomobil {
    private double rezervoar = 0.0;
    private double predjenaKilometraza = 0.0;

    private double predjenaKilometrazaKodPoslednjeDopun = 0.0;
    private double stanjeRezervoaraKodPoslednjeDopune = 0.0;
    private double iznosPoslednjeDopuneRezervoara = 0.0;

    public double getRezervoar() {
        return rezervoar;
    }

    public double getUkupnoPredjenPut() {
        return predjenaKilometraza;
    }

    public void dopuniGorivo(double kolicina) {
        System.out.println("Do sada je prosecna potrosnja bila " + prosecnaPotrosnjaOdPoslednjeDopune());
        stanjeRezervoaraKodPoslednjeDopune = rezervoar;
        predjenaKilometrazaKodPoslednjeDopun = predjenaKilometraza;

        rezervoar += kolicina;
        iznosPoslednjeDopuneRezervoara = kolicina;

    }

    public void voziPoGradu(double put) {
        predjenaKilometraza += put;
        rezervoar -= (put / 100.0) * 7.0;
    }

    public void voziNaOtvorenom(double put) {
        predjenaKilometraza += put;
        rezervoar -= (put / 100.0) * 5.6;
    }

    public double prosecnaPotrosnjaOdPoslednjeDopune() {
        double predjeniPut, potrosenoGorivo;

        predjeniPut = predjenaKilometraza - predjenaKilometrazaKodPoslednjeDopun;
        potrosenoGorivo = (stanjeRezervoaraKodPoslednjeDopune + iznosPoslednjeDopuneRezervoara) - rezervoar;

        return (potrosenoGorivo * 100.0) / predjeniPut;
    }
}
