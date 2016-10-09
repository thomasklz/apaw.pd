package apaw.pd.TexSingletonCompositeFlyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TextoTest {
    private TextComponent H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = Factoria.getFactoria().get('H');
        o = Factoria.getFactoria().get('o');
        l = Factoria.getFactoria().get('l');
        a = Factoria.getFactoria().get('a');
        pf = new Parrafo();
        pf.añadir(H);
        pf.añadir(o);
        pf.añadir(l);
        pf.añadir(a);
        txt = new Text();
        txt.añadir(pf);
        txt.añadir(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, Factoria.getFactoria().get('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.añadir(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.imprimir(false));
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.imprimir(true));
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.imprimir(false));
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.imprimir(true));
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.añadir(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.imprimir(false));
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.imprimir(true));
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.añadir(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
