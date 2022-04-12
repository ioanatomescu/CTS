package decorator;

public class progMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APizza pizzaBasic=new PizzaBasic();
		System.out.println("Pizza basic: ");
		pizzaBasic.getIngrendients();
		pizzaBasic.calculateCost();
		
                APizza aPizza=new DecoratorChicken(pizzaBasic);
                System.out.println("---------\nPizza chicken");
                aPizza.getIngrendients();
                aPizza.calculateCost();
                
	}

}
