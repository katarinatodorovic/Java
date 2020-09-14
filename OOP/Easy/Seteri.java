package proba;

class Zaba {
    private String ime;
    private String moc;
    private int skok;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setMoc(String moc) {
        this.moc = moc;
    }

    public String getMoc() {
        return moc;
    }

    public void setSkok(int skok) {
        this.skok = skok;
    }

    public int getSkok() {
        return skok;
    }

    public void setInfo(String naziv, int visina) {
        setIme(ime);//ne moram da pisem this.setIme (ime) da bi znalo da uzme ime mogu samo ovako bez this
        setSkok(skok);// a lokalno sam ove varijable nazvala ime- naziv i skok visina
        System.out.println(naziv + " " + visina + " na Zabijadi- svetskom takmicenju svih zaba");
    }

}


public class Seteri {
    public static void main(String[] args) {

        Zaba lila = new Zaba();
        lila.setIme("Lila");
        lila.setMoc("Ima moc superskakanja");
        lila.setSkok(3);
        System.out.println(lila.getIme());
        System.out.println(lila.getMoc());
        System.out.println(lila.getSkok());
        lila.setInfo("Lila je zajebana zaba koja ima moc superskakanja " +
                "i skace 3 metra rangirana je kao : ", 3);

        //lila.ime = "Ja sam Lila"; jer jeprivatna i vise joj se ne moze pristupiti

    }
}
