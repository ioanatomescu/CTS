package memento;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ManagerVersions versions= new ManagerVersions();
   //trebuei facut i constructorul fara parametrii
   Contract originalContract= new Contract("Ioana");
  originalContract.addClause("increase the salary with 14%");
  
	}

}
