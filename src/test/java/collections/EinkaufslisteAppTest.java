package collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufslisteAppTest {


    public ArrayList<Einkauf> uebung;
    public HashSet<Einkauf> uebung2;

    @BeforeEach
    void setUp() {
        uebung = new ArrayList<>();
        Einkauf nummer1 = new Einkauf("Apfel",1.5);
        Einkauf nummer2 = new Einkauf("Brot", 3.5);
        uebung.add(nummer1);
        uebung.add(nummer2);

        uebung2 = new HashSet<>();
        uebung2.add(nummer1);
        uebung2.add(nummer2);

    }

    @Test
    void sum() {
        assertEquals(EinkaufslisteApp.sum(uebung),5);
    }

    @Test
    void testSum() {
        assertEquals(EinkaufslisteApp.sum(uebung2),5);
    }
}