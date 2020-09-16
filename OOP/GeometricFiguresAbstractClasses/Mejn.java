package zadatak;

import java.util.ArrayList;

public class Mejn {
    public static void main(String[] args) {

        Pravougaonik prav = new Pravougaonik("pravougaonik", "plav", 3, 2);
        System.out.println(prav.getA());
        System.out.println(prav.obim());


        ArrayList<Figura> figure = new ArrayList<>();
        figure.add(prav);
        Trougao trougao = new Trougao("trougao", "zelena", 2, 3, 5);
        figure.add(trougao);
        double sum = 0;

        for (int i = 0; i < figure.size(); i++) {
            sum += figure.get(i).obim();
            //  figure.get(i).g
           /* if (figure.get(i) instanceof Pravougaonik) {
                sum += ((Pravougaonik) figure.get(i)).obim();
            } else if (figure.get(i) instanceof Trougao) {
                sum += ((Trougao) figure.get(i)).obim();
            }*/

        }

    }
}
