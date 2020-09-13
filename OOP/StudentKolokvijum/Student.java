package ocenjivanje;

public class Student {
    private String ime, prezime, index, email;
    private int godinaUpisa;

    private final int MAX_BROJ_TESTOVA = 480;

    private Test[] testoviStudenta = new Test[MAX_BROJ_TESTOVA];
    private int indexSledecegTesta = 0;

    public void evidentirajTest(Test test) {
        if (indexSledecegTesta < MAX_BROJ_TESTOVA) {
            testoviStudenta[indexSledecegTesta] = test;
            indexSledecegTesta++;
        }
    }

    public void prikazRezultata() {
        System.out.println("Rezultati testova studenta: "
                + getIme() + " " + getPrezime()
                + " ( " + getIndex() + " ) ");
        for (int i = 0; i < indexSledecegTesta; i++) {
            System.out.println(testoviStudenta[i]);
        }
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIndex() {
        return index;
    }

    public String getEmail() {
        return email;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public Student(String ime, String prezime, String index, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
        this.email = email;

        if (index.length() == 10 &&
                Character.isDigit(index.charAt(0)) &&
                Character.isDigit(index.charAt(1)) &&
                Character.isDigit(index.charAt(2)) &&
                Character.isDigit(index.charAt(3))) {
            godinaUpisa = Integer.parseInt(index.substring(0, 4));

        }
    }
}

