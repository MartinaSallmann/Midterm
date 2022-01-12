package klassenUndObjekte;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public Person uebung;

    @BeforeEach
    void setUp() {
        uebung=new Person("Martina", "Sallmann", 175, (byte)3);
    }

    @org.junit.jupiter.api.Test
    void rechneBMI() {
        String martinaBMI = uebung.rechneBMI(65);

        assertEquals("Adipositas", martinaBMI);
    }

    @org.junit.jupiter.api.Test
    void printPerson() {
        String martinaAktivitaetslevel = uebung.printPerson(65);
        assertEquals(martinaAktivitaetslevel, "Sportler");
    }
}