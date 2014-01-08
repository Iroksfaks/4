/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import analizapodatkov.AnalizaPodatkov;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jerry
 */
public class vsotaSodihStevil {
    
    public vsotaSodihStevil() {
    }

    
    @Test
    public void glavnoDelovanje() {
        AnalizaPodatkov analiza = new AnalizaPodatkov();
        int[] polje = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] polje2 = {1, 2, 3, 4, 5, 6, 7, -8};
        assertEquals(20, analiza.vsotaSodihStevil(polje), 0);
        assertEquals(4, analiza.vsotaSodihStevil(polje2), 0);
    }
}
