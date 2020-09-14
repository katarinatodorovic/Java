public class Main {
    public static void main(String[] args) {


        Employee e2 = new Actor("Vlastimir Stojiljkovic", new Theatre("Narodno pozoriste"), "Grof");
        Employee e3 = new Actor("Jugoslava Draskovic", new Theatre("Teatar Vuk"), "Manekenka");
        Theatre t1 = new Theatre("Pozoriste Terazije");
        Theatre t2 = new Theatre("Atelje 212");
        Employee e5 = new Actor("Zlata Numanagic", t1, "Majka Jugovica");
        Actor a = new Actor("Janko Milivojevic", t1, "Neca-sin");
        Director d = new Director("Dusan Golumbovski", t1, "Ozren");
        Employee e4 = new Actor("Dragan Jovanovic", t2, "Sin Dragan");
        Employee e1 = new Actor("Danilo Lazovic", t2, "Scepan Scekic");
        Play p = new Play("Srecni ljudi", t1);

        Director d1 = new Director("Dusan Golumbovski", t1, "Ozren");

        // p.addEmployee(e1);
        p.addEmployee(e2);
        p.addEmployee(e3);
        p.addEmployee(e4);
        p.addEmployee(e5);
        p.addEmployee(a);
        p.addEmployee(d);
        p.addEmployee(d1);
        p.removeEmployee(e1);


        System.out.println(e1.toString());
        System.out.println(t2.getID());
        System.out.println(e2.getTheatre().getID());
        System.out.println(e3.getTheatre().toString());
        System.out.println(a.toString());
        System.out.println(d.toString());
        System.out.println(p.toString());
        System.out.println(p.getEmployees().size());


    }
}
