package decorator;

public class DecoratorChicken extends DecoratorPizza{
  public DecoratorChicken (APizza p) {
	  super(p);
  }
	@Override
	public void getIngrendients() {
		// TODO Auto-generated method stub
		super.getIngrendients();
		System.out.println("+chicken");
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		super.calculateCost();
		System.out.println("+10 (chicken)");
	}
  
}
