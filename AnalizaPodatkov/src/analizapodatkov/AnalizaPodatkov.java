/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analizapodatkov;

/**
 *
 * @author Jerry
 */
public class AnalizaPodatkov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public int vsotaSodihStevil(int[] polje){
	int temp = 0;
	for(int i: polje){
		if(i % 2 == 0){
			temp += i;
		}
	}
	return temp;
}

public  double razmerjeMedVsotoSodihInVsotoLihihStevil(int[] polje){
	int vsotaSodih = 0;
	int vsotaLihih = 0;
	for(int i: polje){
		if(i % 2 == 0){
			vsotaSodih += i;
		} else {
			vsotaLihih += i;
		}
	}
	return (double)vsotaSodih / (double)vsotaLihih;
}
    
}
