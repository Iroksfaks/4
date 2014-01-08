package analizapodatkov;

public class AnalizaPodatkov {

    
    public static void main(String[] args) {
        // TODO code application logic here
    } 
        
        public double PovprecnaVrednost(int[] polje){
       
        int sum = 0;
        
        for (int i = 0; i < polje.length; i++){
            sum = sum + polje[i];
        }
        
        double povprecna = sum / polje.length;
        
        System.out.println("povprecna: " + povprecna);
        
        return povprecna;
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

    public int[] vrniPoljeSamoVeckratnikovStevilaSedem(int[] polje) {
        int[] veckratniki;
        int index = 0;
        
        for(int i = 0; i < polje.length; i++) {           
            if(polje[i]%7 == 0) {
                index ++;
            }
        }
        
        veckratniki = new int[index];
        index = 0;
        
        for(int i = 0; i < polje.length; i++) {           
            if(polje[i]%7 == 0) {
                veckratniki[index] = polje[i];
                index ++;
            }
        }
        return veckratniki;
    }

    public boolean jePraStevilo(int num) {
        int numOfDivides = 0;
        
        if(num == 0)
            return false;
        
        for(int st = 1; st <= num; st ++){
            if(num%st == 0) {
                numOfDivides ++;
            }
        }
        
        if(numOfDivides > 2) {
            return false;
        } else {
            return true;
        }
    }

    public int[] vrniPoljeStevilKiSoPrastevila(int[] polje) {
        int index = 0;
        int[] prastevila;
        
        for(int i = 0; i < polje.length; i++) {
            if(this.jePraStevilo(polje[i]))
                index ++;
        }
        
        prastevila = new int[index];
        index = 0;
        
        for(int i = 0; i < polje.length; i++) {
            if(this.jePraStevilo(polje[i])){
                prastevila[index] = polje[i];
                index ++;
            }
        }
        
        return prastevila;
    }
}

         
