/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import analizapodatkov.AnalizaPodatkov;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jerry
 */
public class vrniPoljeStevilKiSoPrastevila {
    
    public vrniPoljeStevilKiSoPrastevila() {
    }
    
    @Test
    public void glavnoDelovanje() {
        AnalizaPodatkov analiza = new AnalizaPodatkov();
        int[] pricakovano = {19, 23, 29, 31, 37};
        int[] polje = {4, 12, 19, 44, 23, 99, 29, 34, 31, 37};
        
        assertArrayEquals(pricakovano, analiza.vrniPoljeStevilKiSoPrastevila(polje));
    }
}
