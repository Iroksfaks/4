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
public class veckratnikovStevilaSedemTest {
    
    public veckratnikovStevilaSedemTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public void vrniPoljeSamoVeckratnikovStevilaSedem (){
        AnalizaPodatkov analiza = new AnalizaPodatkov();
        int[] polje  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 21, 28, 29, 15};
        int[] pricakovano = {7, 14, 21, 28};
        
        assertArrayEquals(pricakovano, analiza.vrniPoljeSamoVeckratnikovStevilaSedem(polje));
    }
}

