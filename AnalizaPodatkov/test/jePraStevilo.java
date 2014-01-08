import analizapodatkov.AnalizaPodatkov;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jerry
 */
public class jePraStevilo {
    
    public jePraStevilo() {
      
    }

    @Test
    public void glavnoDelovanje() {
        AnalizaPodatkov analiza = new AnalizaPodatkov();
        assertTrue(analiza.jePraStevilo(7));
        assertTrue(analiza.jePraStevilo(5));
        assertTrue(analiza.jePraStevilo(97));
        assertTrue(analiza.jePraStevilo(59));
        assertFalse(analiza.jePraStevilo(8));
        assertFalse(analiza.jePraStevilo(22));
        assertFalse(analiza.jePraStevilo(0));
        assertTrue(analiza.jePraStevilo(-7));
    }
}
