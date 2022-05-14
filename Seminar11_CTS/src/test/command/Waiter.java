package test.command;

import java.util.ArrayList;

public class Waiter {
  private ArrayList<IOrder> orderList= new ArrayList<IOrder>();
  public void noteOrder(IOrder command) {
	  this.orderList.add(command);
  }
  public void sendOrder() { 
	  for(IOrder o:orderList) {
		  o.processOrder();
	  }
	  orderList.clear();
	  
  }
}
