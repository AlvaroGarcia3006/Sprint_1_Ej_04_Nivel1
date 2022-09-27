package nivel1_ej02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private final int numero;
    private final char letra;

    public CalculoDniTest (int num, char let) {
        this.numero = num;
        this.letra = let;
    }
  
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{53677412, 'N'}, {11047951, 'Q'}, {23788941, 'H'}, {23566983, 'X'}, {41788423, 'E'}, {22587452, 'A'}, {36935667, 'J'}, {33333334, 'D'}, {89685438, 'C'}, {10833282, 'Y'}
        });
    }
    @Test
    public void ReturnsCorrectLetter() {
        CalculoDni dni = new CalculoDni(numero);
        assertEquals(letra, dni.obtenerLetra());
    }
}