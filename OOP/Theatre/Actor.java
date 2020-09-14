/*
Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].*/
public class Actor extends Employee {

    private String rollName;

    public Actor(String firstNameLastName, Theatre theatre, String rollName) {
        super(firstNameLastName, theatre);
        this.rollName = rollName;
    }

    @Override
    public String toString() {
        return rollName + super.toString();
    }
}
