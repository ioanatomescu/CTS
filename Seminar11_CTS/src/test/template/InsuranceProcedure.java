package test.template;

public class InsuranceProcedure extends AInsuranceProcedure{
  //metodele le am pastrat abstarcte si le implementam in clasa
	@Override
	protected void identifyDamage() {
		System.out.println("I am identifying an isssue !\n");
		
	}

	@Override
	protected void evaluateDamage() {
		System.out.println("For the issues identified , I am evaluating...\n");
		
	}

	@Override
	protected void sendInsurance() {
		System.out.println("Sending the results !\n");
		
	}

}
