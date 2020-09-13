package definisanjeklasagetterasettera;

public class ProsecnaPotrosnjaGoriva {
    public static void main(String[] args) {
        RadSaKlasamaAutomobil a = new RadSaKlasamaAutomobil();

        a.dopuniGorivo(35.0);

        a.voziPoGradu(3.0);
        a.voziNaOtvorenom(80.0);


        a.voziPoGradu(5.6);
        a.voziPoGradu(1.2);
        a.voziPoGradu(100.2);


        a.dopuniGorivo(5.0);

        a.voziPoGradu(1.5);
        a.voziNaOtvorenom(1.5);

        a.dopuniGorivo(5.0);
        System.out.println(" kraj! ");
    }
}
