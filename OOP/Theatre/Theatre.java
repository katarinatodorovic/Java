/*
Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv
 koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku naziv[id].
 */
public class Theatre {
    private static int ID_STATIC = 0;
    private int ID;
    private String nameOfTheatre;

    public Theatre(String nameOfTheatre) {
        this.nameOfTheatre = nameOfTheatre;
        this.ID = ID_STATIC++;
    }

    public int getID() {
        return ID;
    }

    public String getNameOfTheatre() {
        return nameOfTheatre;
    }

    @Override
    public String toString() {
        return nameOfTheatre + " [ " + ID + " ]";
    }

}
