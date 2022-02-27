package ro.ase.classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //nr de aparatii
		int [] vector= {45,78,17,-5,74,-5,5};
		Utils utils= new Utils();
		System.out.println(utils.nrAparitii(vector));
		System.out.println(utils.aparitiNumarMinim(vector));
	}

}
