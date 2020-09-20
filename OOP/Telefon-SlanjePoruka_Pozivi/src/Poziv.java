package Telefon2.src;/*
    * Позив је услуга за коју се додатно задаје и трајање у секундама. Цена позива се формира на
основу цене успостављања везе и цене започетог минута разговора. Успостављање везе у
домаћем саобраћају је бесплатно, док се сваки започети минут наплаћује 10 динара. За позиве ка
иностранству успостављање везе се наплаћује 30 динара, а сваки започети минут 50 динара.
Трајање позива 0 секунди означава да веза није успостављена, те је цена таквог позива 0 динара.
Текстуални опис позива додатно садржи и трајање позива у формату (minuti:sekunde).
    * */

public class Poziv extends Usluga {

    private double trajanjerazgovora;

    public Poziv(Broj kojiIniciraUslug, Broj komeJeUslugaUpucena, double trajanjerazgovora) {
        super(kojiIniciraUslug, komeJeUslugaUpucena);
        this.trajanjerazgovora = trajanjerazgovora;

    }

    public double getTrajanjerazgovora() {
        return trajanjerazgovora;
    }

    @Override
    public double tipUsluge(Usluga u) {
        double cenaRazgovora;
        if (getTrajanjerazgovora() == 0) {
            System.out.println("razgovor nije obavljen!");
            cenaRazgovora = 0;
            return cenaRazgovora;
        } else {
            if (!Broj.daLiJeBrojIzIsteDrzave(u)) {
                cenaRazgovora = (getTrajanjerazgovora() / 60) * 10;
                return cenaRazgovora;
            } else {
                cenaRazgovora = 30 + ((getTrajanjerazgovora() / 60) * 50);
                return cenaRazgovora;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "(" + (getTrajanjerazgovora() / 60) + ":" + getTrajanjerazgovora() + ")";
    }
}
