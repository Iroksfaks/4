package analizapodatkov;

public class AnalizaPodatkov {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int[] vrniPoljeSamoVeckratnikovStevilaSedem(int[] polje) {
        int[] pricakovano = {7, 14, 21, 28};
        int[] veckratniki = new int[polje.length];
        
        for(int i = 0; i < polje.length; i++) {           
        
        }
        return pricakovano;
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
