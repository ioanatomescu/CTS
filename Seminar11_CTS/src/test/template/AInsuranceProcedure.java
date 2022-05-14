package test.template;

public  abstract class  AInsuranceProcedure {
        protected abstract void identifyDamage();
        protected abstract void evaluateDamage();
        protected abstract void sendInsurance();
        
        
        //metoda template care sa includa toate celalalte functii
        public void giveInsurance() {
        	identifyDamage();
        	evaluateDamage();
        	sendInsurance();
        }
}
