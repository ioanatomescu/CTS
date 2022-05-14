package test.state;

public class WorkingState implements IState{

	@Override
	public void action(String task) {
		System.out.println("This employee works on it"+ task);
		
		
	}

}
