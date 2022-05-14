package test.command;

public class Chief {
  //cel care executa comanda
	private String name;

	public Chief() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chief(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void cookPizza(String typePizza) {
		System.out.println("The Chief "+ name + "is cooking  pizza"+typePizza);
	}
	public void cookPasta(String typePasta) {
		System.out.println("The Chief "+ name + "is cooking  pasta"+typePasta);
	}
}
