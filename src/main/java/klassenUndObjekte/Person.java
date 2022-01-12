package klassenUndObjekte;

public class Person {
    private String vorname;
    private String nachname;
    private int koerpergroesse;
    private byte aktivitaetslevel;

    public Person(String vorname, String nachname, int koerpergroesse, byte akivitaetslevel){
        this.vorname=vorname;
        this.nachname=nachname;
        this.koerpergroesse=koerpergroesse;
        this.aktivitaetslevel=akivitaetslevel;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getKoerpergroesse() {
        return koerpergroesse;
    }

    public byte getAktivitaetslevel() {
        return aktivitaetslevel;
    }

    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    public void setAktivitaetslevel(byte aktivitaetslevel) {
        this.aktivitaetslevel = aktivitaetslevel;
    }

    public String rechneBMI(int gewicht){

        double bmi = gewicht/((koerpergroesse/100)*(koerpergroesse/100));

        if (bmi < 18.5){
            return  "Untergewicht";
        }else if (bmi >18.5 && bmi <25){
            return "Normalgewicht";
        }else if (bmi >25 && bmi <30){
            return "Übergewicht";
        }else if (bmi >30){
            return "Adipositas";
        }else
            return "Error, bmi can not be calculated";

    }

    public void printPerson(int gewicht) {

        double bmi = gewicht / (((double) koerpergroesse / 100) * ((double) koerpergroesse / 100));

        switch (aktivitaetslevel) {
            case 1:
                System.out.println("Couch Potato");
                break;
            case 2:
                System.out.println("Gelegenheitssportler");
                break;
            case 3:
                System.out.println("Sportler");
                break;
            case 4:
                System.out.println("Profisportler");
                break;
            default:
                System.out.println("Error");

        }

        System.out.println(vorname + " " + nachname + ", " + aktivitaetslevel + ", " + rechneBMI(gewicht) + " ");
    }
}
