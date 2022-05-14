package test.chain;

public  abstract class AHandler {
  protected AHandler succesor=null;

public AHandler(AHandler succesor) {
	super();
	this.succesor = succesor;
}
 public AHandler() {
	// TODO Auto-generated constructor stub
}

public abstract void processOrder(Order o);
 public void setSuccesor(AHandler successor) {
	 this.succesor=successor;
 }
}