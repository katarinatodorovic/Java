/*
Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni
oblik je nadimak_ime[naziv_pozorista].*/

public class Director extends Employee {

    private String nickName;

    public Director(String firstNameLastName, Theatre theatre, String nickName) {
        super(firstNameLastName, theatre);
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return nickName + super.toString();
    }
}
