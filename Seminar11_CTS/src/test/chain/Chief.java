package test.chain;

public class Chief extends AHandler{



	public Chief(AHandler succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder(Order o) {
		// TODO Auto-generated method stub
            if(o.getDifficulty()>5) {
            	System.out.println("The Chief is handlong this "+o.getName());
            }
	}

}
