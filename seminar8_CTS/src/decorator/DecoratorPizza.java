package decorator;

public abstract class DecoratorPizza extends APizza{
//obiect concret ca sa putem sa le modificam la runtime
	
	
	
	protected APizza aPizza;
	
	
	
	public DecoratorPizza(APizza aPizza) {
	super();
	this.aPizza = aPizza;
}

	@Override
	public void getIngrendients() {
		// TODO Auto-generated method stub
		aPizza.getIngrendients();
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		aPizza.calculateCost();
	}

	 
}
