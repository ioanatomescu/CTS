package test.state;

public class VacationState implements IState {

	@Override
	public void action(String task) {
		System.out.println("This employee is not available ,cannot handle this "+task);
		
	}

}
