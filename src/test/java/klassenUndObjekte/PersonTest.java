package klassenUndObjekte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    public Person uebung;

    @BeforeEach
    void setUp() {
        uebung=new Person("Martina", "Sallmann", 175, (byte)3);
    }

    @Test
    void rechneBMI() {
        String martinaBMI = uebung.rechneBMI(65);

        assertEquals("Adipositas", martinaBMI);

    }

    @Test
    void printPerson() {
        String martinaAktivitaetslevel = uebung.printPerson(65);
        assertEquals(martinaAktivitaetslevel, "Sportler");

    }
}