package ex2;

public class Market{
	
public float computeVAT(int productType, float initialPrice, int timeSpent)
{
  float finalPrice = 0;
  float value = (timeSpent > 10) ? (float)30/100 : (float)timeSpent/100; 
  if (productType == 1)
  {
  	finalPrice = initialPrice;
  }
  else if (productType == 2)
  {
  	finalPrice = (initialPrice - (Constants.LOW_DISCOUNT * initialPrice)) - value * (initialPrice - (Constants.LOW_DISCOUNT * initialPrice));
  }
  else if (productType == 3)
  {
  	finalPrice = (initialPrice - (Constants.MEDIUM_DISCOUNT * initialPrice)) - value * (initialPrice - (Constants.MEDIUM_DISCOUNT * initialPrice));
  }
  else if (productType == 4)
  {
  	finalPrice = (initialPrice - (Constants.BIG_DISCOUNT * initialPrice)) - value * (initialPrice - (Constants.BIG_DISCOUNT * initialPrice));
  }
  return finalPrice;
}}