package adapter;

public class DiscountA implements IDiscountA {

	@Override
	public double calculateDiscountA(int value) {
		// TODO Auto-generated method stub
		//value=total number of values
		System.out.println("Method A");
		if(value>0) {
			return 0.1;
		}
		if(value>50&&value<=100) {
			return 0.05;
		}
		return 0;
	}

}
