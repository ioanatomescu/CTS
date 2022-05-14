package test.state;

public class ProgMain {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setState(EState.WORKING);
		e.perform(" UX bug");
		e.setState(EState.VACATION);
        e.perform(" server down");
	}

}
