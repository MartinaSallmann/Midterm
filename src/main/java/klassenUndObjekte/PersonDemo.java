package klassenUndObjekte;

public class PersonDemo {
    public static void main(String[] args) {

        Person martina = new Person("Martina", "Sallmann",163, (byte) 3);
        Person stefan = new Person("Stefan", "Heiserer", 193, (byte) 2);

        System.out.println(martina.rechneBMI(62));
        System.out.println(stefan.rechneBMI(99));

        martina.printPerson(62);
        stefan.printPerson(99);
    }
}
