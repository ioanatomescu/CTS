package seminar6.prototype;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bookshop Carturesti=Bookshop.loadDataFromDB("carturesti");
           System.out.println(Carturesti);
           Bookshop diverta=Carturesti;
           diverta.getListBooks().remove(2);
           System.out.println("--SHALLOW COPY--");
           System.out.println(Carturesti);
	}

}
