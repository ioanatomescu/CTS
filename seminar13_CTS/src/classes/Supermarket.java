package classes;

import java.util.ArrayList;

public class Supermarket {
   private String name;
   //private int area; determinist
   private ArrayList<Market> listMarket;
public Supermarket(String name, ArrayList<Market> listMarket) {
	super();
	this.name = name;
	this.listMarket = listMarket;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Market> getListMarket() {
	return listMarket;
}
public void setListMarket(ArrayList<Market> listMarket) {
	this.listMarket = listMarket;
}

public String getBiggestMarketByArea(EMarket type) throws ExceptionNullMarket {
	if(type==null || this.listMarket.size()==0||this.listMarket==null) {
		throw new ExceptionNullMarket();
	}
	float areaMax=-1;
	String nameMaxMarket="";
	for(int i=0;i<listMarket.size();i++) {
		if(areaMax<listMarket.get(i).getArea() && this.listMarket.get(i).getTypeMarket()==type) {
			areaMax=this.listMarket.get(i).getArea();
			nameMaxMarket=this.listMarket.get(i).getName();
		}
	}
	return nameMaxMarket;
}
}

