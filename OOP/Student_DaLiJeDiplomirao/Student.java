public class Student {
    public static void main(String[] args) {
        DaLiJeDiplomirao student = new DaLiJeDiplomirao("Mario Markovic", 1001);
        student.setujBodove(236);

        System.out.println(student.getIme() + " ima " + student.getBodovi() + " bodova.");

        System.out.println(student.getIme() + ", mogucnost diplomiranja: " + student.imaDovoljnoBodova());

        System.out.println(student.getIme() + " je polozio ispit iz Osnove programiranja");
        student.dodajBodove(5);

        System.out.println(student.getIme() + ", mogucnost diplomiranja: " + student.imaDovoljnoBodova());

        if (student.imaDovoljnoBodova()) {
            System.out.println("STRAVA SI! " + student.toString());
        }
    }
}






