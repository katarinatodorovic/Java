package Telefon2.src;

/*
   * Порука је услуга за коју се додатно задаје текст поруке. Могуће је проверити да ли је порука
послата. Поруку није могуће послати са броја фиксног телефона или на број фиксног телефона.
Цена послате поруке у домаћем саобраћају је 3 динара, а ка иностранству 20 динара. За поруку
коју није могуће послати цена је 0 динара. Текстуални опис поруке додатно садржи и текст
поруке
   * */
public class Poruka extends Usluga {

    private String tekstPoruke;

    public Poruka(Broj kojiIniciraUslug, Broj komeJeUslugaUpucena, String tekstPoruke) {
        super(kojiIniciraUslug, komeJeUslugaUpucena);
        this.tekstPoruke = tekstPoruke;
    }

    public boolean daLIJePorukaPoslata(Poruka p) {

        boolean isPoslata = true;
        if (p.getKojiIniciraUslug().isFiksni || p.getKomeJeUslugaUpucena().isFiksni) {
            System.out.println("Usluga ne moze biti izvrsena");
            isPoslata = false;
        }
        return isPoslata;
    }

    @Override
    public double tipUsluge(Usluga u) {
        double cenaPoruke;
        if (u.getKojiIniciraUslug().isFiksni || u.getKomeJeUslugaUpucena().isFiksni) {
            System.out.println("Usluga ne moze biti izvrsena");
            cenaPoruke = 0;
        } else {
            if (!Broj.daLiJeBrojIzIsteDrzave(u)) {
                cenaPoruke = 3;

            } else {
                cenaPoruke = 20;
            }
        }
        return cenaPoruke;
    }

    @Override
    public String toString() {
        return super.toString() + " " + tekstPoruke;
    }

}
