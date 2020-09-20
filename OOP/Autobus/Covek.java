public abstract class Covek {
    /*
     * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
     * Svi podaci mogu da se dohvate, ali ne i postave.
     */
    private String ime_I_prezime;

    public Covek(String ime_I_prezime) {
        if (!ime_I_prezime.equals("")) this.ime_I_prezime = ime_I_prezime;
        else System.out.printf("Mora se zadati ime i prezime.");
    }

    public String getIme_I_prezime() {
        return ime_I_prezime;
    }

    @Override
    public String toString(){
        return this.ime_I_prezime;
    }
}
