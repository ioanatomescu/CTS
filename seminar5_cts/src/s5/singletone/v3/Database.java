package s5.singletone.v3;

public class Database {
     private static Database INSTANCE;
    static {
    	  INSTANCE= new Database();
    	 
     }
    private Database() {
    	
    }
    public Database getInstance() {
    	return INSTANCE;
    }
     
}
