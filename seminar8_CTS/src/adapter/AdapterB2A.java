package adapter;

public class AdapterB2A extends DiscountA implements IDiscountB {

	@Override
	public double calculateDiscountB(Client client) {
		// TODO Auto-generated method stub
		//varianta 1
		//this.calculateDiscountA(client.getNrOrders());
		//varianta 2
		System.out.println("Method B2");
		int total=0;
		for(int i=0;i<client.getNrOrders();i++) {
			total+=client.getOrders()[i];
		}
		this.calculateDiscountA(total);
		
		return 0;
	}

}
