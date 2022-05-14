package test.chain;

public class Waiter extends AHandler {
	public Waiter(AHandler succesor) {
		super(succesor);
		// TODO Auto-generated constructor stub
	}

	public Waiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty()>5) {
			System.out.println("Waiter cannot handle this");
			this.succesor.processOrder(o);
		}else
		{
			System.out.println("The waiter is handling this "+o.getName());
		}
		
	}

}
