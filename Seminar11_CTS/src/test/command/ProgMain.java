package test.command;

public class ProgMain {

	public static void main(String[] args) {
		Chief c1= new Chief("Michael");
		Chief c21= new Chief("Rose");
		Waiter w= new Waiter();
		w.noteOrder(new PizzaOrder(c1,"diavola"));
		w.noteOrder(new PizzaOrder(c21,"carbonara"));
		w.noteOrder(new PizzaOrder(c1,"margherita"));
		w.sendOrder();

	}

}
