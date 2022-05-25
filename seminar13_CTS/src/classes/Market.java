package classes;

public class Market {
      private String name;
      private float area;
      private EMarket typeMarket;
	public Market(String name, float area, EMarket typeMarket) {
		super();
		this.name = name;
		this.area = area;
		this.typeMarket = typeMarket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public EMarket getTypeMarket() {
		return typeMarket;
	}
	public void setTypeMarket(EMarket typeMarket) {
		this.typeMarket = typeMarket;
	}
      
}
