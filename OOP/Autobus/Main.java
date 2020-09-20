public class Main {
    public static void main(String[] args) {

            Autobus autobus = new Autobus("Laguna",135);

            Putnik putnik1 = new Putnik("Milica Milic",15000);
            Putnik putnik2 = new Putnik("Ana Anicic",22000);
            Putnik putnik3 = new Putnik("Bogdan Bogdanovic",75000);
            Putnik putnik4 = new Putnik("Vanja Vasilijevic",4500);
            Putnik putnik5 = new Putnik("Gordana Gordic",12000);
            Putnik putnik6 = new Putnik("Danica Danicic",65000);
            Putnik putnik7 = new Putnik("Zoran Zoric",32200);
            Putnik putnik8 = new Putnik("Kosana Kosanic",12345);
            autobus.dodajPutnika(putnik1);
            autobus.dodajPutnika(putnik2);
            autobus.dodajPutnika(putnik3);
            autobus.dodajPutnika(putnik4);
            autobus.dodajPutnika(putnik5);
            autobus.dodajPutnika(putnik6);
            autobus.dodajPutnika(putnik7);
            autobus.dodajPutnika(putnik8);

            putnik1.dodajNovac(0);
            putnik1.skiniNovac(150001);
            putnik1.dodajNovac(5000);
            System.out.println(putnik1);
            putnik1.skiniNovac(1500);
            System.out.println(putnik1);
            Vozac vozac1 = new Vozac("Ljubisa Ljubic");
            Vozac vozac2 = new Vozac("Milisa Milisavljevic");
            autobus.dodajVozaca(vozac1);
            autobus.dodajVozaca(vozac2);
            System.out.println(Autobus.getVozac());
            autobus.ukloniVozaca();
            System.out.println(Autobus.getVozac());
            autobus.dodajVozaca(vozac2);


        System.out.println( autobus.toString());


    }
}
