package classes;

public class Person {
      private String name;
      private String personalNumber;
      private int age;
      private double[] costReceipts;
      public Person() {
    	  
      }
	public Person(String name, String personalNumber, int age, double[] costReceipts) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.age = age;
		this.costReceipts = costReceipts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double[] getCostReceipts() {
		return costReceipts;
	}
	public void setCostReceipts(double[] costReceipts) {
		this.costReceipts = costReceipts;
	}
      public double getAvgCost() {
    	  double sum=0;
    	  for(int i=0;i<this.costReceipts.length;i++) {
    		  sum+=this.costReceipts[i];
    	  }
    	  return sum/this.costReceipts.length;
      }
}
