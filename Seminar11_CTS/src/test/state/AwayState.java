package test.state;

public class AwayState  implements IState{

	@Override
	public void action(String task) {
		System.out.println("This employee will prioritize this "+ task);
		
	}

}
