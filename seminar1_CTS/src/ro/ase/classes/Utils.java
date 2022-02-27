package ro.ase.classes;

public class Utils {
     public int nrAparitii(int []vector) {
    	 int min=vector[0];
    	 int nr=0;
    	 for(int i=0;i<vector.length;i++) {
    		 if(min<vector[i]) {
    			 min=vector[i];
    		 }
    	 }
    	 for(int i=0;i<vector.length;i++) {
    		 if(min==vector[i]) {
    			 nr++;
    		 }
    	 }
    	 return nr;
     }
    public static  int aparitiNumarMinim(int [] nr ) {
    	 int min=0;
    	 int apar=0;
    	 for(int i=0;i<nr.length;i++) {
    		 if(min==nr[i]) {
    			 apar++;
    			 
    		 }
    		 if(min>nr[i]) {
    			 min=nr[i];
    			 apar=1;
    			 
    		 }
    	 }
    	 return apar;
    	 
     }
}
