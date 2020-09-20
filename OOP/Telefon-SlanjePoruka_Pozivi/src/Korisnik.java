package Telefon2.src;

import java.util.ArrayList;

/*
 Корисник се ствара задавањем броја телефона и почетног броја услуга које је за
корисника потребно памтити. Број услуга које се памте се увећава по потреби за по 10. Могуће
је за корисника евидентирати позив, при чему се задаје број телефона који је позван и трајање
позива, или поруку, при чему се задаје број телефона на који је порука послата, као и текст
поруке. Повратна вредност обе операције је цена услуге. Могуће је дохватити укупну цену свих
извршених услуга. Текстуални опис корисника се састоји од његовог броја телефона у првом
реду, а затим свих извршених услуга у хронолошком редоследу, при чему је свака услуга у
засебном реду
* */
public class Korisnik {
    private Broj broj;
    private int brojUsluga;
    private static double sumaSvihUsluga;
    private static ArrayList<Usluga> sveUsluge = new ArrayList<>();
  /* private static int ID_Global =0;
   private int ID;*/

    public Korisnik(Broj broj, int brojUsluga) {
        this.broj = broj;
        this.brojUsluga = brojUsluga;
    }

    public double proslediPoziv(Broj brojKjiZovem, double trjanjeRazgovora) {
        Poziv nov = new Poziv(this.broj, brojKjiZovem, trjanjeRazgovora);
        double cenaPoziva = nov.tipUsluge(nov);
        sumaSvihUsluga += cenaPoziva;
        sveUsluge.add(nov);
        brojUsluga--;
        return cenaPoziva;
    }

    public double proslediPoruku(Broj brojKomeSaljemPoruku, String tekstPoruke) {
        Poruka poruka = new Poruka(this.broj, brojKomeSaljemPoruku, tekstPoruke);
        double cenaPoruke = poruka.tipUsluge(poruka);
        sveUsluge.add(poruka);
        sumaSvihUsluga += cenaPoruke;
        brojUsluga--;
        return cenaPoruke;
    }

    public void uvecajBrojUslugaZa10() {
        brojUsluga += 10;
    }

    public static double getSumaSvihUsluga() {
        return sumaSvihUsluga;
    }

    public static ArrayList<Usluga> getSveUsluge() {
        return sveUsluge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sveUsluge.size(); i++) {
            sb.append(sveUsluge.get(i));
            if (i != sveUsluge.size() - 1) {
                sb.append(", ").append("\n");
            }
        }
        return this.broj + " " + sb;
    }

    public int getBrojUsluga() {
        return brojUsluga;
    }
}
