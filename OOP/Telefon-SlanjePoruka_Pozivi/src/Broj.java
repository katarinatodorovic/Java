package Telefon2.src;

/*
Број телефона се ствара задавањем текстуалног кода државе, позивног броја, броја
телефона (на пример „381“, „11“, „1234567“) и индикатора да ли се ради о фиксном телефону.
Могуће је проверити да ли се број телефона налази у истој држави као други задати број
телефона. Индикатор који говори да ли се ради о фиксном телефону је могуће дохватити.
Текстуални опис броја телефона је облика +kod_drzave pozivni_broj broj_telefona.

* */
public class Broj {
    private String tekstKodDrzave;
    private String pozivniBroj;
    private String brojTelefona;
    boolean isFiksni;

    public Broj(String tekstKodDrzave, String pozivniBroj, String brojTelefona, boolean isFiksni) {
        if (dalijeBroj(tekstKodDrzave) && dalijeBroj(pozivniBroj) && dalijeBroj(brojTelefona)) {
            this.tekstKodDrzave = tekstKodDrzave;
            this.pozivniBroj = pozivniBroj;
            this.brojTelefona = brojTelefona;
            this.isFiksni = isFiksni;
        }
    }

    public boolean isFiksni() {
        return isFiksni;
    }

    public boolean dalijeBroj(String s) {
        char[] m = s.toCharArray();
        boolean idDigit = true;
        for (int i = 0; i < m.length; i++) {
            if (!Character.isDigit(m[i])) {
                idDigit = false;
                System.out.println("Ono sto ste uneli nije broj!");
                break;
            }
        }
        return idDigit;
    }


    public static boolean daLiJeBrojIzIsteDrzave(Usluga u) {
        boolean isIstaDrzava = false;
        if (u.getKojiIniciraUslug() == null || u.getKomeJeUslugaUpucena() == null) {
            System.out.println("Ovakvu proveru je nemoguce izvrsiti.");
        } else {
            if (!u.getKojiIniciraUslug().tekstKodDrzave.equals(u.getKomeJeUslugaUpucena().tekstKodDrzave)) {
                isIstaDrzava = true;
            }
        }
        return isIstaDrzava;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append("+").append(tekstKodDrzave).append("_").
                append(" ").append(pozivniBroj).append(" ").append(brojTelefona));
    }
}
