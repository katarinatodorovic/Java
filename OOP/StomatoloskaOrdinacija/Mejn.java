package ordinacija;

public class Mejn {
    public static void main(String[] args) {
        Stomatolog s1 = new Stomatolog("Ljubo", "Ljubic", "1111111111111");
        Stomatolog s2 = new Stomatolog("Milan", "Milic", "3333333333333");
        Stomatolog s3 = new Stomatolog("Kaca", "Kacovic", "2222222222222");
        Stomatolog s4 = new Stomatolog("Oblo", "Oblic", "4444444444444");
        Pacijent p1 = new Pacijent("Seco", "Secic", "5555555555555");
        Pacijent p2 = new Pacijent("Vaha", "Vahic", "6666666666666");
        Pacijent p3 = new Pacijent("Kocko", "Kocix", "7777777777777");
        Pacijent p4 = new Pacijent("Muto", "Mutavdzic", "8888888888888");
        s1.dodajNovac(85000);
        System.out.println(s1.toString());
        System.out.println(s1.getId());
        System.out.println(s1.getNovac());
        s1.oduzmiNovac(5000);
        Ordinacija o = new Ordinacija("Ekskluziva", 4500);
        o.addStomatologa(s1);
        o.addStomatologa(s2);
        o.addStomatologa(s3);
        o.addStomatologa(s4);
        o.addPacijenta(p1);
        o.addPacijenta(p2);
        o.addPacijenta(p3);
        o.addPacijenta(p4);

        for (int i = 0; i < o.getPacijenti().size(); i++) {
            System.out.println(o.getPacijenti().get(i));
        }
        for (int j = 0; j < o.getStomatolozi().size(); j++) {
            System.out.println(o.getStomatolozi().get(j));
        }
    }
}
