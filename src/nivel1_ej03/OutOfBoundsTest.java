package nivel1_ej03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OutOfBoundsTest {
    @Test
    void getNumOK() {
        OutOfBounds sut = new OutOfBounds();
        assertEquals(1, sut.getNum(0));
    }

    @Test
    void getNumNOK() {
        OutOfBounds sut = new OutOfBounds();
        try {
            Integer value = sut.getNum(4);
        } catch (Exception exception) {
            assertEquals("Index 4 out of bounds for length 2", exception.getMessage());
        }
    }
}