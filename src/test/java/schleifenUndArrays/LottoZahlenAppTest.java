package schleifenUndArrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoZahlenAppTest {

    private int size;
    private int[] number;

    @BeforeEach
    void setUp() {
        size = 6;
        number = new int[size];
    }

    @Test
    void generateRandomNumbers() {
        assertEquals(6, number.length);
    }
}