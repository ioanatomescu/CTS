package seminar6.prototype.resolved;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bookshop Carturesti=Bookshop.loadDataFromDB("carturesti");
           System.out.println(Carturesti);
           Bookshop diverta=(Bookshop) Carturesti;
           diverta.getListBooks().remove(2);
           System.out.println("DEEP COPY");
           System.out.println(Carturesti);
	}

}
