import java.util.ArrayList;

/*
* Planinarsko drustvo poseduje naziv, i spisak planinara. Spisak planinara je inicijalno
*  prazan i planinar moze da se doda ili
ukloni sa spiska. Ove akcije ralizovati kao 2 zasebne metode(dodaj, ukloni).
* Naziv se zadaje prilikom kreiranja i moguce ga i
dohvatiti i postaviti. Moze da se dohvati broj planinara registrovanih u drustvu.
* Planinarsko drustvo je zaduzeno za kreiranje
planinara, to jest, poseduje metodu registruj(Osoba o, String brojDozvole), koja
* osobu o registruje kao planinara u svom
drustvu, sa brojemDozvole brojDozvole. Novoregistrovanog planinara dodaje u spisak
* planinara i vraca referncu na tog
planinara. Primer poziva metode registruj:
Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
Planinar p1=drustvo1.registruj(o1,"1234567");
Planinarsko drustvo moze se ispisati na sledeci nacin:

Test_07_09_2020.md 9/7/2020

2 / 2

[NazivDrustva]{BrojPlaninara}
Planinar1
Planinar2
...

Gde su planinar1, planinar2 itd, planinari registrovani u planinarskom drustvu.
* */
public class PlaninarskoDrustvo {

    private String nazivDrustva;
    private ArrayList<Planinar> planinari = new ArrayList<>();

    public PlaninarskoDrustvo(String nazivDrustva) {
        this.nazivDrustva = nazivDrustva;
    }

    public String getNazivDrustva() {
        return nazivDrustva;
    }

    public void setNazivDrustva(String nazivDrustva) {
        this.nazivDrustva = nazivDrustva;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public int velicinaListe() {
        return planinari.size();
    }

    public void dodajPlaninara(Planinar p) {
        if (p != null && !isInList(p)) {
            planinari.add(p);
        } else System.out.println("Ne mozemo dodati planinara");
    }

    public void ukloniPlaninara(Planinar p) {
        if (p == null || planinari.size() == 0 || !isInList(p)) {
            System.out.println("Ne moze se ukloniti taj planinar");
        } else {
            planinari.remove(p);
        }
    }

    public boolean isInList(Planinar p) {
        boolean imaPlaninara = false;
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).getJMBG().equals(p.getJMBG()) && planinari.get(i).
                    getBrojPlaninarskeDozvole().equals(p.getBrojPlaninarskeDozvole())) {
                imaPlaninara = true;
            }
        }
        return imaPlaninara;
    }

    public Planinar kreirajPlaninara(Osoba o, String brojDozvole) {
        Planinar p = kreirajPlaninara(o, brojDozvole);
        dodajPlaninara(p);
        return p;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < planinari.size(); i++) {
            sb2.append(planinari.get(i)).append("\n");
        }
        sb.append("[").append(nazivDrustva).append("]").append("{").append(planinari.size()).append("}").append("\n").append(sb2);
        return String.valueOf(sb);
    }
}
