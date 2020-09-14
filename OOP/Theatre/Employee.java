/*
Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem
u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni
 opis u obliku ime[naziv_pozorista].
*/

public class Employee {
    private String firstNameLastName;
    private Theatre theatre;

    public Employee(String firstNameLastName, Theatre theatre) {
        this.firstNameLastName = firstNameLastName;
        this.theatre = theatre;
    }

    public String getFirstNameLastName() {
        return firstNameLastName;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    @Override
    public String toString() {
        return " " + firstNameLastName + " [" + theatre.getNameOfTheatre() + "]";
    }
}
