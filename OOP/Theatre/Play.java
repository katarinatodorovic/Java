/*
Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave mogu
da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista
 u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju
 u realizaciji predstave (svakog zaposlenog u zasebnom redu).
*/

import java.util.ArrayList;

public class Play {
    private String nameOfPLay;
    private Theatre theatre;
    private static ArrayList<Employee> employees = new ArrayList<>();

    public Play(String nameOfPLay, Theatre theatre) {
        this.nameOfPLay = nameOfPLay;
        this.theatre = theatre;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e) {
        boolean isThere = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstNameLastName().toLowerCase().replaceAll("\\s", "").
                    equals(e.getFirstNameLastName().toLowerCase().replaceAll("\\s", ""))) {
                System.out.println("This employee is already in play. ");
                isThere = true;
                break;
            }
        }
        if (!isThere) {
            employees.add(e);
        }
    }

    public void removeEmployee(Employee e) {
        boolean isThere = false;
        if (employees.size() == 0) {
            System.out.println("List is empty! ");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getFirstNameLastName().toLowerCase().replaceAll("\\s", "").equals(e.getFirstNameLastName())) {
                    isThere = true;
                    employees.remove(e);
                    break;
                }
            }
        }
        if (!isThere) {
            System.out.println("That employee doesn't exist. ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < employees.size(); i++) {
            sb.append(employees.get(i));

            if (i != employees.size() - 1) {
                sb.append(", ").append("\n");
            }
        }
        return nameOfPLay + ", " + theatre.toString() + "\n" + sb;
    }
}
