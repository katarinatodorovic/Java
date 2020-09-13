package ocenjivanje;

public class Ocenjivanje {
    public static void main(String[] args) {

        Student s = new Student("Ljubisa", "Kostic", "54/2020", "ljubisakostic@kuca.com");
        s.evidentirajTest(new Test("Programiranje 1", "1. kolokijum", 30, 20));
        s.evidentirajTest(new Test("Programiranje 1", "2. kolokijum", 30, 16));
        s.evidentirajTest(new Test("Programiranje 1", "Zavrsni ispit", 30, 10));
        s.evidentirajTest(new Test("Baze podataka", "1. kolokijum", 30, 17));
        s.evidentirajTest(new Test("Baze podataka", "2. kolokijum", 30, 11));
        s.evidentirajTest(new Test("Baze podataka", "Zavrsni projekat", 100, 80));
        s.evidentirajTest(new Test("Baze podataka", "Zavrsni ispit", 200, 170));

        s.prikazRezultata();
    }
}
